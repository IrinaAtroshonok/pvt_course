package core;

import java.io.IOException;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataFromDatabase.DataForMailRu;
import dataFromDatabase.GetDataFromDatabase;
import facade.FacadeMetod;
import pages.MailPage;
import patternSingleton.SingletoneWebDriwer;
import ru.yandex.qatools.allure.annotations.Attachment;

public class ProgectStepsMailRu {
	private static final Logger logger = Logger.getLogger(ProgectStepsMailRu.class);
	// !!!get data from the database
	DataForMailRu data = GetDataFromDatabase.getDatafromDatabase();
	private String firstMail = data.getFirstEmail();
	private String secondMail = data.getSecondEmail();
	private static String topic = "Тема письма";
	private static String folderName = "1";
	private WebDriver webDriver;
	private MailPage pageMail;
	FluentWait<WebDriver> wait;
	FacadeMetod facade;

	public ProgectStepsMailRu() throws ClassNotFoundException, SQLException {
		webDriver = SingletoneWebDriwer.getDriver(); // Singleton pattern
		pageMail = new MailPage(webDriver);
		wait = new FluentWait<WebDriver>(webDriver);
		facade = new FacadeMetod();
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) throws IOException {
		webDriver.get(url);
		makeScreenshot();
	}

	@When("^I login as correct user$")
	public void loginAsCorrectUser() {
		facade.autorization(); // Facade pattern
		makeScreenshot();
	}

	@When("^I click a button New Mail$")
	public void clickButtonNewLetter() {
		pageMail.clickButtonNewMail();
		makeScreenshot();
	}

	@When("^I fill the field To$")
	public void fillTheFieldTo() {
		pageMail.enterEmails(firstMail, secondMail);
		makeScreenshot();
	}

	@When("^I fill the field Topic$")
	public void fillTheFieldTopic() {
		pageMail.enterLetterTopic(topic);
		makeScreenshot();
	}

	@When("^I fill content$")
	public void fillMailContent() {
		pageMail.enterMailContent("Пишу тебе письмо");
		makeScreenshot();
	}

	@When("^I click a button Send$")
	public void clickSendButton() {
		pageMail.clickButtonSend();
		makeScreenshot();
	}

	@Then("I check if mail is sended$")
	public void checkIfMailIsSended() {
		Assert.assertTrue(pageMail.isMessageLetterSent(webDriver));
		makeScreenshot();
		pageMail.clickLogout();
		logger.info("mail sent");
	}

	@When("^I choose a mail$")
	public void clickRadioButtonIn() {
		try {
			pageMail.clickRadioButtonMailIn_1();
		} catch (Exception e) {
			logger.fatal("no letters");
			throw e;
		}
		makeScreenshot();
	}

	@When("^I click a button Delete$")
	public void clickDeleteButtonIn() {
		pageMail.clickDeleteButton();
		makeScreenshot();
	}

	@Then("I check if mail is deleted$")
	public void checkIfMailIsDeleted() {
		Assert.assertTrue(pageMail.isDeleteMessage(webDriver));
		makeScreenshot();
		pageMail.clickLogout();
		logger.warn("Attention.You can delete not that mail");
	}

	@When("^I click a button Spam$")
	public void clickSpamButtonIn() {
		pageMail.clickSpamButton();
		makeScreenshot();
	}

	@Then("I check if mail is in spam$")
	public void checkIfMailInSpam() {
		Assert.assertTrue(pageMail.isMessageInSpam(webDriver));
		makeScreenshot();
		pageMail.clickLogout();
		logger.info("mail in spam");
	}

	@When("^I open1 spam folder$")
	public void openSpamFolder() {
		pageMail.clickSpam();
		makeScreenshot();
	}

	@When("^I choose a mail in spam$")
	public void clickRBSpam() {
		try {
			pageMail.clickRadioButtonSpam();
		} catch (Exception e) {
			logger.error("no letters");
			throw e;
		}
		makeScreenshot();
	}

	@When("^I click a button NOT Spam$")
	public void clickButtonNotSpam() {
		pageMail.clickNotSpamButton();
		makeScreenshot();
	}

	@Then("I check if mail is not in spam$")
	public void checkIfMailNotInSpam() {
		Assert.assertTrue(pageMail.isMessageExtractFromSpam(webDriver));
		pageMail.clickLogout();
		logger.info("mail is not in spam");
	}

	@When("^I choose link astrology$")
	public void ckichLinkAstrology() {
		pageMail.clickAstrologyLink();
		makeScreenshot();
	}

	@When("^I open page with all sign of the zodiac$")
	public void openAllSign() {
		pageMail.allSign();
		makeScreenshot();
	}

	@When("^I choose sign Scorpion$")
	public void openSignScorpion() {
		pageMail.clickScorpionSign();
		makeScreenshot();
	}

	@When("^I choose astrology period$")
	public void openAstrologyPeriod() {
		pageMail.chooseAstrologyPeriod();
		makeScreenshot();
	}

	@Then("I see astrological forecast$")
	public void doesISeeForecast() {
		Assert.assertTrue(pageMail.isForecastDisplayed(webDriver));
		logger.info("get astrological forecast");
	}

	@When("^I choose a few mails$")
	public void clickFewRadioButtonIn() {
		pageMail.clickRadioButtonMailIn_1();
		pageMail.clickRadioButtonMailIn_2();
		makeScreenshot();
	}

	@When("^I click move$")
	public void chooseFewMails() {
		pageMail.clickMoveButton();
		makeScreenshot();
	}

	@When("^I click button new folder$")
	public void clickNewFolder() {
		pageMail.clickNewFolderButton();
		makeScreenshot();
	}

	@When("^I fill the field folder name$")
	public void fillFieldFolderName() {
		pageMail.enterFolderName(folderName);
		makeScreenshot();
	}

	@When("^I click button submit$")
	public void clickSubmit() {
		pageMail.clickSubmitButton();
		makeScreenshot();
	}

	@Then("I see message that folder create$")
	public void newFolderCreated() {
		Assert.assertTrue(pageMail.isNewFolderMessageDisplay(webDriver));
		pageMail.clickLogout();
		logger.info("folder created");
	}

	@When("^I click button more$")
	public void clickButtonMore() {
		pageMail.clickMore();
		makeScreenshot();
	}

	@When("^I flag letters$")
	public void flagLetters() {
		pageMail.flagLetter();
		makeScreenshot();
	}

	@Then("I check whether the letters are flagged$")
	public void areLettersFlugged() {
		Assert.assertTrue(pageMail.isMessageFlag(webDriver));
		pageMail.clickLogout();
		logger.info("letters are flagged");
	}

	@When("^I choose all mails$")
	public void chooseAllMails() {
		pageMail.selectAllLeters();
		makeScreenshot();
	}

	@When("^I remove the flag$")
	public void removeFlags() {
		pageMail.removeAllFlags();
		makeScreenshot();
	}

	@Then("I check if flag is not set$")
	public void flagNotSet() {
		Assert.assertEquals(pageMail.isEnabledFlagNo(webDriver), "disabled");
		pageMail.clickLogout();
		logger.info("flag is not set");
	}

	@When("^I open popup for create new filter$")
	public void createFilter() {
		pageMail.newFilter();
		makeScreenshot();
	}

	@When("^I open all folders$")
	public void openFolders() {
		pageMail.openFolders();
		makeScreenshot();
	}

	@When("^I choose folder$")
	public void chooseFolders() {
		pageMail.chooseFolder();
		makeScreenshot();
	}

	@When("^I save Filter$")
	public void SaveFilter() {
		pageMail.ckickSaveFilterButton();
		makeScreenshot();
	}

	@Then("I see message that filter created$")
	public void isFilterCreate() {
		Assert.assertTrue(pageMail.isMessageFilderDisplayed(webDriver));
		pageMail.clickLogout();
		logger.info("filter created");
	}

	@When("^I click more in main menu$")
	public void clickMoreMainMenu() {
		pageMail.ckickMoreInMainMenu();
		makeScreenshot();
	}

	@When("^I open settings$")
	public void openSettings() {
		pageMail.openSettings();
		makeScreenshot();
	}

	@When("^I open filter settings$")
	public void openFilterSettings() {
		pageMail.openFilterSettings();
		makeScreenshot();
	}

	@When("^I click delete button$")
	public void deleteFilter() {
		pageMail.deleteFilter();
		makeScreenshot();
	}

	@When("^I confirm delete$")
	public void confirmDeleteFilter() {
		pageMail.confirmDeleteFilter();
		makeScreenshot();
	}

	@Then("I see that filter deleted$")
	public void isFilterDelete() {
		Assert.assertTrue(pageMail.isMessageFilderDeleteDisplayed(webDriver));
		pageMail.clickLogout();
		logger.info("filter deleted");
	}

	@AfterClass
	public void afterClass() {
		webDriver.quit();
	}

	@Attachment(value = "Attachment Screenshot", type = "image/png")
	public byte[] makeScreenshot() {
		return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
	}
}
