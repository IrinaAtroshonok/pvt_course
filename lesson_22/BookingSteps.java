package core;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingSteps {
	private WebDriver webDriver;
	private MainPage mainPage;
	double raiting = 0.0;

	public BookingSteps() {
		webDriver = new ChromeDriver();
		mainPage = new MainPage(webDriver);
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) {
		webDriver.get(url);
	}

	@When("^I enter the city$")
	public void enterCity() {
		mainPage.clickFieldCity();
		mainPage.enterCity("Москва");
	}

	@When("^I choose dates$")
	public void chooseDates() {
		mainPage.clickFieldDates();
		mainPage.clickFieldStartDate();
		mainPage.clickFieldEndDate();
	}

	@When("^I choose the number of guests$")
	public void chooseTheNumberOfGueste() {
		mainPage.clickFieldCountPeopleAndRoms();
		int adult = Integer.parseInt(mainPage.getTextCountAdult());
		if (adult != 2) {
			if (adult < 2) {
				mainPage.clickFieldIncreaseAmountAdult();
			} else {
				mainPage.clickFieldDecreaseAmountAdult();
			}
		}
	}

	@When("^I choose the number of rooms$")
	public void chooseTheNumberOfRooms() {
		int rooms = Integer.parseInt(mainPage.getTextCountRooms());
		if (rooms != 1) {
			if (rooms < 1) {
				mainPage.clickFieldIncreaseAmountRooms();
			} else {
				mainPage.clickFieldDecreaseAmountRooms();
			}
		}
	}

	@When("^I click button Find$")
	public void clickFind() {
		mainPage.clickFindButton();
	}

	@Then("^I check if there are hotels$")
	public void checkResult() {
		Assert.assertNotNull(MainPage.listOfHotels);
	}

	@When("^I sorted hotels by rating$")
	public void sortedHotelsByRating() {
		mainPage.clickSorthotels();
	}

	@When("^I open the first hotel$")
	public void openFirstHotel() {
		mainPage.waitFirstHotelIsVisibl();
		mainPage.clickFirstHotel();
	}

	@Then("^I check hotel rating$")
	public void checkRaiting() {
		raiting = Double.parseDouble(mainPage.getTextRatingHotel());
		Assert.assertTrue(raiting >= 9.0);
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}
