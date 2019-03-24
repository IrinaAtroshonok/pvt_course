package core;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataFromDatabase.DataForMailRu;
import dataFromDatabase.GetDataFromDatabase;
import pages.MailPage;

public class ProgectStepsMailRu {
	//get data from the database
	DataForMailRu data = GetDataFromDatabase.getDatafromDatabase();	
	private String login = data.getLogin();
	private String password = data.getPassword();
	private String firstMail = data.getFirstEmail();
	private String secondMail = data.getSecondEmail();
	private static String topic = "Тема письма";
	private static String folderName = "1";
	private WebDriver webDriver;
	private MailPage pageMail;
	FluentWait<WebDriver> wait;

	public ProgectStepsMailRu() throws ClassNotFoundException, SQLException {
		webDriver = new ChromeDriver();
		pageMail = new MailPage(webDriver);
		wait = new FluentWait<WebDriver>(webDriver);
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) {
		webDriver.get(url);
	}

	@When("^I login as correct user$")
	public void loginAsCorrectUser() {
		pageMail.enterDataForAutorization(login, password);
		pageMail.clickEnterButton();
		wait.until(ExpectedConditions.titleContains("Входящие"));
	}

	@When("^I click a button New Mail$")
	public void clickButtonNewLetter() {
		pageMail.clickButtonNewMail();
	}

	@When("^I fill the field To$")
	public void fillTheFieldTo() {
		pageMail.enterEmails(firstMail, secondMail);
	}

	@When("^I fill the field Topic$")
	public void fillTheFieldTopic() {
		pageMail.enterLetterTopic(topic);
	}

	@When("^I fill content$")
	public void fillMailContent() {
		pageMail.enterMailContent("Пишу тебе письмо");
	}

	@When("^I click a button Send$")
	public void clickSendButton() {
		pageMail.clickButtonSend();
	}

	@Then("I check if mail is sended$")
	public void checkIfMailIsSended() {
		Assert.assertTrue(pageMail.isMessageLetterSent(webDriver));
	}

	@When("^I choose a mail$")
	public void clickRadioButtonIn() {
		pageMail.clickRadioButtonMailIn_1();
	}

	@When("^I click a button Delete$")
	public void clickDeleteButtonIn() {
		pageMail.clickDeleteButton();
	}

	@Then("I check if mail is deleted$")
	public void checkIfMailIsDeleted() {
		Assert.assertTrue(pageMail.isDeleteMessage(webDriver));
	}

	@When("^I click a button Spam$")
	public void clickSpamButtonIn() {
		pageMail.clickSpamButton();
	}

	@Then("I check if mail is in spam$")
	public void checkIfMailInSpam() {
		Assert.assertTrue(pageMail.isMessageInSpam(webDriver));
	}

	@When("^I open1 spam folder$")
	public void openSpamFolder() {
		pageMail.clickSpam();
	}

	@When("^I choose a mail in spam$")
	public void clickRBSpam() {
		pageMail.clickRadioButtonSpam();
	}

	@When("^I click a button NOT Spam$")
	public void clickButtonNotSpam() {
		pageMail.clickNotSpamButton();
	}

	@Then("I check if mail is not in spam$")
	public void checkIfMailNotInSpam() {
		Assert.assertTrue(pageMail.isMessageExtractFromSpam(webDriver));
	}

	@When("^I choose link astrology$")
	public void ckichLinkAstrology() {
		pageMail.clickAstrologyLink();
	}

	@When("^I open page with all sign of the zodiac$")
	public void openAllSign() {
		pageMail.allSign();
	}

	@When("^I choose sign Scorpion$")
	public void openSignScorpion() {
		pageMail.clickScorpionSign();
	}

	@When("^I choose astrology period$")
	public void openAstrologyPeriod() {
		pageMail.chooseAstrologyPeriod();
	}

	@Then("I see astrological forecast$")
	public void doesISeeForecast() {
		Assert.assertTrue(pageMail.isForecastDisplayed(webDriver));
	}

	@When("^I choose a few mails$")
	public void clickFewRadioButtonIn() {
		pageMail.clickRadioButtonMailIn_1();
		pageMail.clickRadioButtonMailIn_2();
	}

	@When("^I click move$")
	public void chooseFewMails() {
		pageMail.clickMoveButton();
	}

	@When("^I click button new folder$")
	public void clickNewFolder() {
		pageMail.clickNewFolderButton();
	}

	@When("^I fill the field folder name$")
	public void fillFieldFolderName() {
		pageMail.enterFolderName(folderName);
	}

	@When("^I click button submit$")
	public void clickSubmit() {
		pageMail.clickSubmitButton();
	}

	@Then("I see message that folder create$")
	public void newFolderCreated() {
		Assert.assertTrue(pageMail.isNewFolderMessageDisplay(webDriver));
	}

	@When("^I click button more$")
	public void clickButtonMore() {
		pageMail.clickMore();
	}

	@When("^I flag letters$")
	public void flagLetters() {
		pageMail.flagLetter();
	}

	@Then("I check whether the letters are flagged$")
	public void areLettersFlugged() {
		Assert.assertTrue(pageMail.isMessageFlag(webDriver));
	}

	@When("^I choose all mails$")
	public void chooseAllMails() {
		pageMail.selectAllLeters();
	}

	@When("^I remove the flag$")
	public void removeFlags() {
		pageMail.removeAllFlags();
	}

	@Then("I check if flag is not set$")
	public void flagNotSet() {
		Assert.assertEquals(pageMail.isEnabledFlagNo(webDriver), "disabled");
	}

	@When("^I open popup for create new filter$")
	public void createFilter() {
		pageMail.newFilter();
	}

	@When("^I open all folders$")
	public void openFolders() {
		pageMail.openFolders();
	}

	@When("^I choose folder$")
	public void chooseFolders() {
		pageMail.chooseFolder();
	}

	@When("^I save Filter$")
	public void SaveFilter() {
		pageMail.ckickSaveFilterButton();
	}

	@Then("I see message that filter created$")
	public void isFilterCreate() {
		Assert.assertTrue(pageMail.isMessageFilderDisplayed(webDriver));
	}

	@When("^I click more in main menu$")
	public void clickMoreMainMenu() {
		pageMail.ckickMoreInMainMenu();
	}

	@When("^I open settings$")
	public void openSettings() {
		pageMail.openSettings();
	}

	@When("^I open filter settings$")
	public void openFilterSettings() {
		pageMail.openFilterSettings();
	}

	@When("^I click delete button$")
	public void deleteFilter() {
		pageMail.deleteFilter();
	}

	@When("^I confirm delete$")
	public void confirmDeleteFilter() {
		pageMail.confirmDeleteFilter();
	}

	@Then("I see that filter deleted$")
	public void isFilterDelete() {
		Assert.assertTrue(pageMail.isMessageFilderDeleteDisplayed(webDriver));
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}
