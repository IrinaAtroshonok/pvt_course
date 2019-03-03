package core;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookingTests_19 {

	private WebDriver driver;
	private LocalDate today;
	private LocalDate startDate;
	private LocalDate endtDate;
	private WebElement ourHotel;
	private WebElement hotel;
	private int night = 7;
	private int maxSumForCheap = night * 120;
	private int minSumForExpensive = night * 480;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		today = LocalDate.now();
		startDate = today.plus(3, ChronoUnit.DAYS);
		endtDate = today.plus(10, ChronoUnit.DAYS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void bestCheapHotel() throws Exception {
		driver.get("https://www.booking.com");
		WebElement fieldCity = driver.findElement(By.xpath(".//input[@name=\"ss\"]"));
		fieldCity.clear();
		fieldCity.sendKeys("Париж");

		WebElement fieldDates = driver.findElement(By.xpath(".//div[@class=\"xp__dates-inner\"]"));
		fieldDates.click();

		WebElement fieldStartDate = driver.findElement(By.xpath(".//td[@data-date=" + "\"" + startDate + "\"" + "]"));
		fieldStartDate.click();

		WebElement fieldEndDate = driver.findElement(By.xpath(".//td[@data-date=" + "\"" + endtDate + "\"" + "]"));
		fieldEndDate.click();

		WebElement buttonFind = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
		buttonFind.click();

		Select adult = new Select(driver.findElement(By.xpath(".//select[@id=\"group_adults\"]")));
		adult.selectByIndex(1);

		Select room = new Select(driver.findElement(By.xpath(".//select[@id=\"no_rooms\"]")));
		room.selectByIndex(0);

		WebElement buttonFind_2 = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
		buttonFind_2.click();

		WebElement sortHotelsByPrise = driver.findElement(By.xpath(".//a[@data-id=\"pri-1\"]"));
		sortHotelsByPrise.click();

		WebElement sorthotelsByRaiting = driver.findElement(By.xpath(".//a[@data-id=\"review_score-90\"]"));
		sorthotelsByRaiting.click();

		Thread.sleep(4000);// надо подождать иначе в список попадают все отели с предыдущей страницы

		List<WebElement> hotelsList = driver.findElements(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]"));
		Assert.assertNotNull(hotelsList);

		int hotelNumber = 0;
		double raiting = 0.0;

		for (int i = 0; i < hotelsList.size(); i++) {
			String hotelRaiting = hotelsList.get(i).findElement(By.xpath(".//div[@class=\"bui-review-score__badge\"]"))
					.getText();
			String replacedHotelRaiting = hotelRaiting.replace(',', '.');
			double doubletHotelRaiting = Double.parseDouble(replacedHotelRaiting);

			if (doubletHotelRaiting >= raiting) {
				raiting = doubletHotelRaiting;
				hotelNumber = i + 1;
			}
		}

		WebElement priseElement = driver.findElement(By.xpath("(.//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"])["
				+ hotelNumber + "]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b"));
		ourHotel = hotelsList.get(hotelNumber - 1).findElement(By.xpath(".//a[@class=\"hotel_name_link url\"]"));
		ourHotel.click();

		String priseAndСurrency = priseElement.getText();
		String priceString = priseAndСurrency.substring(4);
		double price = Double.parseDouble(priceString);
		Assert.assertTrue(price / night <= maxSumForCheap);

	}

	@Test
	public void bookingTheCheapestOfTheMostExpensive() throws Exception {
		driver.get("https://www.booking.com");
		WebElement fieldCity = driver.findElement(By.xpath(".//input[@name=\"ss\"]"));
		fieldCity.clear();
		fieldCity.sendKeys("Париж");

		WebElement fieldDates = driver.findElement(By.xpath(".//div[@class=\"xp__dates-inner\"]"));
		fieldDates.click();

		WebElement fieldStartDate = driver.findElement(By.xpath(".//td[@data-date=" + "\"" + startDate + "\"" + "]"));
		fieldStartDate.click();

		WebElement fieldEndDate = driver.findElement(By.xpath(".//td[@data-date=" + "\"" + endtDate + "\"" + "]"));
		fieldEndDate.click();

		WebElement buttonFind = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
		buttonFind.click();

		Select adult = new Select(driver.findElement(By.xpath(".//select[@id=\"group_adults\"]")));
		adult.selectByIndex(3);

		Select room = new Select(driver.findElement(By.xpath(".//select[@id=\"no_rooms\"]")));
		room.selectByIndex(1);

		WebElement buttonFind_2 = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
		buttonFind_2.click();

		WebElement sortByPrise = driver.findElement(By.xpath(".//a[@data-id=\"pri-5\"]"));
		sortByPrise.click();

		WebElement sortByPriseExpensiveHotels = driver.findElement(By.xpath(".//a[@data-category=\"price\"]"));
		sortByPriseExpensiveHotels.click();

		Thread.sleep(4000);

		hotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
		hotel.click();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		WebElement priseElement = driver.findElement(
				By.xpath("//*[@id=\"group_recommendation\"]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/span[2]"));
		String priseAndСurrency = priseElement.getText();
		String priceString = priseAndСurrency.substring(4).replaceAll("\\s", "");
		double price = Double.parseDouble(priceString);
		Assert.assertTrue(price >= minSumForExpensive);

		// бронь этого номера
		WebElement buttonBooking = driver
				.findElement(By.xpath("//*[@id=\"group_recommendation\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/a"));
		buttonBooking.click();

		Thread.sleep(5000);

		WebElement buttonBookingSubmit = driver
				.findElement(By.xpath("//div[@data-component=\"hotel/new-rooms-table/reservation-cta\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(buttonBookingSubmit).click(buttonBookingSubmit).build().perform();

		WebElement fieldLastName = driver.findElement(By.xpath(".//input[@name=\"lastname\"]"));
		fieldLastName.clear();
		fieldLastName.sendKeys("Ivanov");

		WebElement fieldEmail = driver.findElement(By.xpath(".//input[@name=\"email\"]"));
		fieldEmail.clear();
		fieldEmail.sendKeys("ulel@mail.ru");

		WebElement fieldConfirmEmail = driver.findElement(By.xpath(".//input[@id=\"email_confirm\"]"));
		fieldConfirmEmail.clear();
		fieldConfirmEmail.sendKeys("ulel@mail.ru");

		WebElement buttonAddData = driver.findElement(By.xpath(".//button[@name=\"book\"]"));
		buttonAddData.click();

		Select coutry = new Select(driver.findElement(By.xpath(".//select[@id=\"cc1\"]")));
		coutry.selectByIndex(21);

		WebElement phone = driver.findElement(By.xpath(".//input[@id=\"phone\"]"));
		phone.sendKeys("291111111");

		WebElement fieldAdres = driver.findElement(By.xpath(".//input[@id=\"address1\"]"));
		fieldAdres.clear();
		fieldAdres.sendKeys("ul. Lenina 3");

		WebElement fieldCity_2 = driver.findElement(By.xpath(".//input[@id=\"city\"]"));
		fieldCity_2.clear();
		fieldCity_2.sendKeys("Minsk");

		Select cardType = new Select(driver.findElement(By.xpath(".//select[@id=\"cc_type\"]")));
		cardType.selectByIndex(2);

		WebElement numberCard = driver.findElement(By.xpath(".//input[@id=\"cc_number\"]"));
		numberCard.clear();
		numberCard.sendKeys("4242424242424243");

		Select cardMonthEnd = new Select(driver.findElement(By.xpath(".//select[@id=\"cc_month\"]")));
		cardMonthEnd.selectByIndex(2);

		Select cardYearEnd = new Select(driver.findElement(By.xpath(".//select[@id=\"ccYear\"]")));
		cardYearEnd.selectByIndex(1);

		WebElement cvvCard = driver.findElement(By.xpath(".//input[@id=\"cc_cvc\"]"));
		cvvCard.clear();
		cvvCard.sendKeys("959");

		WebElement buttonBook = driver.findElement(By.xpath("(.//button[@name=\"book\"])[2]"));
		buttonBook.click();

		Thread.sleep(4000);

		WebElement message = driver.findElement(By.xpath("//*[@id=\"bp_form_cc_number_msg\"]"));
		Assert.assertNotNull(message);
	}
}
