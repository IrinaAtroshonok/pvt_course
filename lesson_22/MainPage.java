package core;

import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	private WebDriver driver;
	private WebDriver driver_1;

	@FindBy(xpath = ".//input[@name=\"ss\"]")
	private WebElement searchFieldCity;

	@FindBy(xpath = ".//div[@class=\"xp__dates-inner\"]")
	private WebElement searchFieldDates;

	@FindBy(xpath = ".//td[@data-date=\"2019-03-11\"]")
	private WebElement searchFieldStartDate;

	@FindBy(xpath = ".//td[@data-date=\"2019-03-26\"]")
	private WebElement searchFieldEndDate;

	@FindBy(xpath = ".//div[@class=\"xp__input-group xp__guests\"]")
	private WebElement searchFieldCountPeopleAndRoms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/span")
	private WebElement searchCountAdult;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]")
	private WebElement increaseAmountAdult;

	@FindBy(xpath = "(//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[1]")
	private WebElement decreaseAmountAdult;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/span")
	private WebElement searchCountRooms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[2]")
	private WebElement increaseAmountRooms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[1]")
	private WebElement decreaseAmountRooms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")
	private WebElement findButton;

	@FindBy(xpath = ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]")
	public static List<WebElement> listOfHotels;

	@FindBy(xpath = ".//*[@id=\"sort_by\"]/ul/li[3]/a")
	private WebElement sorthotels;

	@FindBy(xpath = "(.//a[@class =\"hotel_name_link url\"])[1]")
	private WebElement firstHotel;

	@FindBy(xpath = "(.//div[@class=\"bui-review-score__badge\"])[1]")
	private WebElement ratingHotel;

	public MainPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickFieldCity() {
		searchFieldCity.click();
	}

	public void enterCity(String city) {
		enterText(searchFieldCity, city);
	}

	public void clickFieldDates() {
		searchFieldDates.click();
	}

	public void clickFieldStartDate() {
		searchFieldStartDate.click();
	}

	public void clickFieldEndDate() {
		searchFieldEndDate.click();
	}

	public void clickFieldCountPeopleAndRoms() {
		searchFieldCountPeopleAndRoms.click();
	}

	public String getTextCountAdult() {
		return searchCountAdult.getText();
	}

	public void clickFieldIncreaseAmountAdult() {
		increaseAmountAdult.click();
	}

	public void clickFieldDecreaseAmountAdult() {
		decreaseAmountAdult.click();
	}

	public String getTextCountRooms() {
		return searchCountRooms.getText();
	}

	public void clickFieldIncreaseAmountRooms() {
		increaseAmountRooms.click();
	}

	public void clickFieldDecreaseAmountRooms() {
		decreaseAmountRooms.click();
	}

	public void clickFindButton() {
		findButton.click();
	}

	public void clickSorthotels() {
		sorthotels.click();
	}

	public void clickFirstHotel() {
		firstHotel.click();
	}

	public void waitFirstHotelIsVisibl() {
		driver_1 = new ChromeDriver();
		driver_1.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver_1.close();
	}

	public String getTextRatingHotel() {
		return ratingHotel.getText();
	}

}
