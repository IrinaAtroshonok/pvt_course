package core;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingTest_18 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void haveHotels() {
		driver.get("https://www.booking.com");
		WebElement searchFieldCity = driver.findElement(By.xpath(".//input[@name=\"ss\"]"));
		searchFieldCity.clear();
		searchFieldCity.sendKeys("Москва");

		WebElement searchFieldDates = driver.findElement(By.xpath(".//div[@class=\"xp__dates-inner\"]"));
		searchFieldDates.click();

		WebElement searchFieldStartDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-11\"]"));
		searchFieldStartDate.click();

		WebElement searchFieldEndDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-26\"]"));
		searchFieldEndDate.click();

		WebElement searchFieldCountPeopleAndRoms = driver
				.findElement(By.xpath(".//div[@class=\"xp__input-group xp__guests\"]"));
		searchFieldCountPeopleAndRoms.click();

//для наглядности выбрала 3 взрослых и 2 номера ,т.к. 2 взрослых и 1 номер проставлены по умолчанию

		WebElement searchCountAdult = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/span"));
		int adult = Integer.parseInt(searchCountAdult.getText());
		if (adult != 3) {
			if (adult < 3) {
				WebElement increaseAmountAdult = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]"));
				increaseAmountAdult.click();
			} else {
				WebElement decreaseAmountAdult = driver.findElement(
						By.xpath("(//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[1]"));
				decreaseAmountAdult.click();
			}
		}

		WebElement searchCountRooms = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/span"));
		int rooms = Integer.parseInt(searchCountRooms.getText());
		if (rooms != 2) {
			if (rooms < 2) {
				WebElement increaseAmountRooms = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[2]"));
				increaseAmountRooms.click();
			} else {
				WebElement decreaseAmountRooms = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[1]"));
				decreaseAmountRooms.click();
			}
		}

		WebElement findButton = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
		findButton.click();

		List<WebElement> list = driver.findElements(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]"));
		Assert.assertNotNull(list);
	}

	@Test
	public void checkRaitng() throws Exception {
		driver.get("https://www.booking.com");
		WebElement searchFieldCity = driver.findElement(By.xpath(".//input[@name=\"ss\"]"));
		searchFieldCity.clear();
		searchFieldCity.sendKeys("Москва");

		WebElement searchFieldDates = driver.findElement(By.xpath(".//div[@class=\"xp__dates-inner\"]"));
		searchFieldDates.click();

		WebElement searchFieldStartDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-11\"]"));
		searchFieldStartDate.click();

		WebElement searchFieldEndDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-26\"]"));
		searchFieldEndDate.click();

		WebElement searchFieldCountPeopleAndRoms = driver
				.findElement(By.xpath(".//div[@class=\"xp__input-group xp__guests\"]"));
		searchFieldCountPeopleAndRoms.click();

//для наглядности выбрала 3 взрослых и 2 номера ,т.к. 2 взрослых и 1 номер проставлены по умолчанию

		WebElement searchCountAdult = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/span"));
		int adult = Integer.parseInt(searchCountAdult.getText());
		if (adult != 3) {
			if (adult < 3) {
				WebElement increaseAmountAdult = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]"));
				increaseAmountAdult.click();
			} else {
				WebElement decreaseAmountAdult = driver.findElement(
						By.xpath("(//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[1]"));
				decreaseAmountAdult.click();
			}
		}

		WebElement searchCountRooms = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/span"));
		int rooms = Integer.parseInt(searchCountRooms.getText());
		if (rooms != 2) {
			if (rooms < 2) {
				WebElement increaseAmountRooms = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[2]"));
				increaseAmountRooms.click();
			} else {
				WebElement decreaseAmountRooms = driver.findElement(
						By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[1]"));
				decreaseAmountRooms.click();
			}
		}

		WebElement findButton = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
		findButton.click();

		WebElement sorthotels = driver.findElement(By.xpath(".//*[@id=\"sort_by\"]/ul/li[3]/a"));
		sorthotels.click();

		Thread.sleep(3000); // надо подождать пока страница прогрузится иначе не сработает

		WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class =\"hotel_name_link url\"])[1]"));
		firstHotel.click();

		WebElement ratingHotel = driver.findElement(By.xpath("(.//div[@class=\"bui-review-score__badge\"])[1]"));
		int raiting = Integer.parseInt(ratingHotel.getText());
		Assert.assertTrue(raiting >= 9);
	}

}
