package facade;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import core.ProgectStepsMailRu;
import dataFromDatabase.DataForMailRu;
import dataFromDatabase.GetDataFromDatabase;
import pages.MailPage;
import patternSingleton.SingletoneWebDriwer;

public class AllMetodsForFacade {
	// !!!get data from database
	DataForMailRu data = GetDataFromDatabase.getDatafromDatabase();
	private String login = data.getLogin();
	private String password = data.getPassword();
	private WebDriver webDriver = SingletoneWebDriwer.getDriver();
	private MailPage pageMail = new MailPage(webDriver);
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(webDriver);
	private static final Logger logger = Logger.getLogger(ProgectStepsMailRu.class);

	public void enterDataForAutorization() {
		pageMail.enterDataForAutorization(login, password);
	}

	public void clickEnterButton() {
		pageMail.clickEnterButton();
		wait.until(ExpectedConditions.titleContains("Входящие"));
		logger.info("authorization was successful");
	}
}
