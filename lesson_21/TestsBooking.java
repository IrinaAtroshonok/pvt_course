package core;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import core.MainPage;

public class TestsBooking {
	private WebDriver driver;
	private MainPage mainPage;
	FluentWait<WebDriver> wait;
	int hotelNumber = 0;
	double raiting = 0.0;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		mainPage = new MainPage(driver);
		wait = new FluentWait<WebDriver>(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testHaveHotels() {
		driver.get("https://www.booking.com");
		mainPage.clickFieldCity();
		mainPage.enterCity("Москва");
		mainPage.clickFieldDates();
		mainPage.clickFieldStartDate();
		mainPage.clickFieldEndDate();
		mainPage.clickFieldCountPeopleAndRoms();
		int adult = Integer.parseInt(mainPage.getTextCountAdult());
		if (adult != 3) {
			if (adult < 3) {
				mainPage.clickFieldIncreaseAmountAdult();
			} else {
				mainPage.clickFieldDecreaseAmountAdult();
			}
		}

		int rooms = Integer.parseInt(mainPage.getTextCountRooms());
		if (rooms != 2) {
			if (rooms < 2) {
				mainPage.clickFieldIncreaseAmountRooms();
			} else {
				mainPage.clickFieldDecreaseAmountRooms();
			}
		}

		mainPage.clickFindButton();
		Assert.assertNotNull(MainPage.listOfHotels);
	}

	@Test
	public void testCheckRaitng() {
		driver.get("https://www.booking.com");
		mainPage.clickFieldCity();
		mainPage.enterCity("Москва");
		mainPage.clickFieldDates();
		mainPage.clickFieldStartDate();
		mainPage.clickFieldEndDate();
		mainPage.clickFieldCountPeopleAndRoms();
		int adult = Integer.parseInt(mainPage.getTextCountAdult());
		if (adult != 3) {
			if (adult < 3) {
				mainPage.clickFieldIncreaseAmountAdult();
			} else {
				mainPage.clickFieldDecreaseAmountAdult();
			}
		}

		int rooms = Integer.parseInt(mainPage.getTextCountRooms());
		if (rooms != 2) {
			if (rooms < 2) {
				mainPage.clickFieldIncreaseAmountRooms();
			} else {
				mainPage.clickFieldDecreaseAmountRooms();
			}
		}

		mainPage.clickFindButton();
		mainPage.clickSorthotels();
		mainPage.waitFirstHotelIsVisibl();
		mainPage.clickFirstHotel();
		int raiting = Integer.parseInt(mainPage.getTextRatingHotel());
		Assert.assertTrue(raiting >= 9);
	}

}
