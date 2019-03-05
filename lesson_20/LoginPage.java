package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = ".//input[@id ='mailbox:login']")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id ='mailbox:password']")
	private WebElement passwordField;

	@FindBy(xpath = ".//input[@value = 'Войти']")
	private WebElement enterButtonLogin;

	@FindBy(xpath = ".//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a")
	private WebElement buttonNewLetter;

	@FindBy(xpath = ".//a[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(xpath = ".//div[@data-id=\"950\"]")
	private WebElement spamLink;

	@FindBy(xpath = "(.//div[@class='b-checkbox__box'])[3]")
	private WebElement checkboxMailIn_1;

	@FindBy(xpath = "(.//div[@class='b-checkbox__box'])[4]")
	private WebElement checkboxMailIn_2;

	@FindBy(xpath = "(.//div[@class='b-checkbox__box'])[5]")
	private WebElement checkboxMailIn_3;

	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[26]")
	private WebElement checkboxSpam;

	@FindBy(xpath = "(.//span[text()='Спам'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = ".//div[@data-name=\"noSpam\"]")
	private WebElement buttonNotSpam;

	@FindBy(xpath = ".//*[@id='jsHtml']/body/div[1]")
	public static WebElement notSpamMessage;

	@FindBy(xpath = ".//*[@id=\"jsHtml\"]/body/div[1]")
	public static WebElement spamMessage;

	@FindBy(xpath = ".//textarea[@data-original-name=\"To\"]")
	private WebElement enterEmail;

	@FindBy(xpath = ".//input[@name=\"Subject\"]")
	private WebElement letterTopic;
	
	@FindBy(xpath = ".//body[@id='tinymce']/br[1]")
	private WebElement textLetter;
	
	@FindBy(xpath = "(//body//iframe)[5]")
	public static WebElement frame;

	@FindBy(xpath = ".//div[@data-name=\"send\"]")
	private WebElement buttonSend;

	@FindBy(xpath = "(.//a[@href=\"/messages/inbox/\"])[3]")
	public static WebElement letterSentMessage;

	@FindBy(xpath = ".//div[@data-group=\"letters-more\"]")
	private WebElement elementMore;

	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[2]/div/div[2]/div[5]/div/div[2]/div[2]/a[3]")
	private WebElement flag;

	@FindBy(xpath = "//*[@id=\"jsHtml\"]/body/div[1]/div[1]/div")
	public static WebElement flagMessage;

	@FindBy(xpath = "//*[@id=\"b-letters\"]/div/div[2]/div/div[2]/div[1]/div/a/div[3]/div/b")
	private WebElement flagNotVisible;

	@FindBy(xpath = ".//div[@data-group=\"selectAll\"]")
	private WebElement allLeters;

	@FindBy(xpath = ".//a[@data-name=\"flag_no\"]")
	public static WebElement removeFlag;
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void enterButtonLogin() {
		enterButtonLogin.click();
	}

	public void clickRadioButtonMailIn_1() {
		checkboxMailIn_1.click();
	}

	public void clickRadioButtonMailIn_2() {
		checkboxMailIn_2.click();
	}

	public void clickRadioButtonMailIn_3() {
		checkboxMailIn_3.click();
	}

	public void clickSpam() {
		spamLink.click();
	}

	public void clickButtonNewLetter() {
		buttonNewLetter.click();
	}

	public void enterEmail(String email) {
		enterEmail.click();
		enterEmail.sendKeys(email + "\n");
	}

	public void enterLetterTopic(String topic) {
		letterTopic.click();
		letterTopic.sendKeys(topic);
	}

	public void enterTextLetter(String text) {
		textLetter.click();
		textLetter.sendKeys(text);
	}

	public void clickButtonSend() {
		buttonSend.click();
	}

	public void clickRadioButtonSpam() {
		checkboxSpam.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public void clickNotSpamButton() {
		buttonNotSpam.click();
	}

	public void clickMore() {
		elementMore.click();
	}

	public void flagLetter() {
		flag.click();
	}

	public void selectAllLeters() {
		allLeters.click();
	}

	public void removeAllFlags() {
		removeFlag.click();
	}

	public boolean isMessageExtractFromSpam(WebDriver driver) {
		return notSpamMessage.isDisplayed();
	}

	public boolean isMessageInSpam(WebDriver driver) {
		return spamMessage.isDisplayed();
	}

	public boolean isMessageLetterSent(WebDriver driver) {
		return letterSentMessage.isDisplayed();
	}

	public boolean isMessageFlag(WebDriver driver) {
		return flagMessage.isDisplayed();
	}

	public String isEnabledFlagNo(WebDriver driver) {
		return removeFlag.getAttribute("aria-disabled");
	}


}
