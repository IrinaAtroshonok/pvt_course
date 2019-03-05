package test;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;

public class TestsMailRu {
	private WebDriver driver;
	private LoginPage loginPage;
	FluentWait<WebDriver> wait;
	FluentWait<WebDriver> wait1;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		wait = new FluentWait<WebDriver>(driver);
		wait1 = new FluentWait<WebDriver>(driver);
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

	@Test
	public void testAddToSpam() {
		driver.get("https://www.mail.ru");
		loginPage.enterData("ulej22", "atr3764");
		loginPage.enterButtonLogin();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		loginPage.clickRadioButtonMailIn_1();
		loginPage.clickSpamButton();
		wait.until(ExpectedConditions.visibilityOf(LoginPage.spamMessage));
		Assert.assertTrue(loginPage.isMessageInSpam(driver));
	}

	@Test
	public void testExtractToSpam() {
		driver.get("https://www.mail.ru");
		loginPage.enterData("ulej22", "atr3764");
		loginPage.enterButtonLogin();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		loginPage.clickSpam();
		loginPage.clickRadioButtonSpam();
		loginPage.clickNotSpamButton();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(LoginPage.notSpamMessage));
		Assert.assertTrue(loginPage.isMessageExtractFromSpam(driver));
	}

	@Test
	public void testSendNewMessage() {
		driver.get("https://www.mail.ru");
		loginPage.enterData("ulej22", "atr3764");
		loginPage.enterButtonLogin();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		loginPage.clickButtonNewLetter();
		loginPage.enterEmail("irishka.93@mail.ru");
		loginPage.enterEmail("atroshonoki@gmail.com");
		loginPage.enterLetterTopic("Тема письма");
		driver.switchTo().frame(LoginPage.frame);
		loginPage.enterTextLetter("Текст письма");
		loginPage.clickButtonSend();
		wait.until(ExpectedConditions.visibilityOf(LoginPage.letterSentMessage));
		Assert.assertTrue(loginPage.isMessageLetterSent(driver));
	}

	@Test
	public void testflagLetter() {
		driver.get("https://www.mail.ru");
		loginPage.enterData("ulej22", "atr3764");
		loginPage.enterButtonLogin();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		loginPage.clickRadioButtonMailIn_1();
		loginPage.clickRadioButtonMailIn_2();
		loginPage.clickRadioButtonMailIn_3();
		loginPage.clickMore();
		loginPage.flagLetter();
		wait.until(ExpectedConditions.visibilityOf(LoginPage.flagMessage));
		Assert.assertTrue(loginPage.isMessageFlag(driver));
	}

	@Test
	public void testnotFlagLetter() {
		driver.get("https://www.mail.ru");
		loginPage.enterData("ulej22", "atr3764");
		loginPage.enterButtonLogin();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		loginPage.selectAllLeters();
		loginPage.clickMore();
		loginPage.flagLetter();
		loginPage.clickMore();
		loginPage.removeAllFlags();
		loginPage.clickMore();
		Assert.assertEquals(loginPage.isEnabledFlagNo(driver), "disabled");
	}
}
