package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage {
	private static final int LINK_PRESENSE_TIMEOUT = 6;
	private WebDriver driver;

	@FindBy(xpath = ".//input[@id ='mailbox:login']")
	private WebElement loginField;

	@FindBy(xpath = ".//select[@id=\"mailbox:domain\"]")
	private Select domain;

	@FindBy(xpath = ".//input[@id ='mailbox:password']")
	private WebElement passwordField;

	@FindBy(xpath = ".//input[@value = 'Войти']")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(xpath = ".//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a")
	private WebElement buttonNewMail;

	@FindBy(xpath = ".//textarea[@data-original-name=\"To\"]")
	private WebElement enterEmail;

	@FindBy(xpath = ".//input[@name=\"Subject\"]")
	private WebElement letterTopic;

	@FindBy(xpath = ".//div[@data-name=\"send\"]")
	private WebElement buttonSend;

	@FindBy(xpath = ".//div[@class='message-sent__title']")
	public static WebElement letterSentMessage;

	@FindBy(xpath = "(.//div[@class='b-checkbox__box'])[3]")
	private WebElement checkboxMailIn_1;

	@FindBy(xpath = "(.//div[@class='b-checkbox__box'])[4]")
	private WebElement checkboxMailIn_2;

	@FindBy(xpath = "(.//span[text()='Удалить'])[1]")
	private WebElement deleteButton;

	@FindBy(xpath = ".//span[text()='Удалено 1 письмо.  ']")
	public static WebElement deleteMessage;

	@FindBy(xpath = "(.//span[text()='Спам'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = ".//*[@id=\"jsHtml\"]/body/div[1]")
	public static WebElement spamMessage;

	@FindBy(xpath = ".//div[@data-id=\"950\"]")
	private WebElement spamLink;

	@FindBy(xpath = "//*[@id=\"b-letters\"]/div/div[5]/div/div[2]/div[1]/div/a/div[1]")
	private WebElement checkboxSpam;

	@FindBy(xpath = ".//div[@data-name=\"noSpam\"]")
	private WebElement buttonNotSpam;

	@FindBy(xpath = ".//*[@id='jsHtml']/body/div[1]")
	public static WebElement notSpamMessage;

	@FindBy(xpath = "(.//h3[@class='projects-item__title i-link-deco'])[5]")
	private WebElement astrologyLink;

	@FindBy(xpath = ".//a[@href='#other_zodiac_sign']")
	private WebElement allZodiacSign;

	@FindBy(xpath = ".//span[text()='Скорпион']")
	private WebElement scorpionSign;

	@FindBy(xpath = ".//span[text()='2019']")
	private WebElement astrologyPeriod;

	@FindBy(xpath = ".//div[@class='article__text']")
	private WebElement astrologyForecast;

	@FindBy(xpath = ".//div[@data-group=\"moveTo\"]")
	private WebElement moveButton;

	@FindBy(xpath = ".//a[@data-name=\"new\"]")
	private WebElement newFolderButton;

	@FindBy(xpath = ".//input[@name='name']")
	private WebElement fieldFolderName;

	@FindBy(xpath = "(.//button[@data-bem='btn'])[1]")
	private WebElement submitButton;

	@FindBy(xpath = ".//span[text()='2 письма перемещено в папку «1»']")
	public static WebElement newFolderMessage;

	@FindBy(xpath = ".//div[@data-group=\"letters-more\"]")
	private WebElement elementMore;

	@FindBy(xpath = ".//a[@data-name='flag_yes']")
	private WebElement flag;

	@FindBy(xpath = ".//span[text()='Помечено 2 письма.  ']")
	public static WebElement flagMessage;

	@FindBy(xpath = ".//div[@data-group=\"selectAll\"]")
	private WebElement allLeters;

	@FindBy(xpath = ".//a[@data-name=\"flag_no\"]")
	public static WebElement removeFlag;

	@FindBy(xpath = ".//a[@data-name='create_filter']")
	private WebElement filter;

	@FindBy(xpath = ".//div[@class='js-select-link']")
	private WebElement folder;

	@FindBy(xpath = ".//label[@data-name='slivky']")
	private WebElement myFolder;

	@FindBy(xpath = ".//span[text()='Сохранить']")
	private WebElement saveFilterButton;

	@FindBy(xpath = ".//div[text()='Поместить в папку «slivky»']")
	public static WebElement filterMessage;

	@FindBy(xpath = ".//span[@data-name='ph-more']")
	private WebElement moreMainMenu;

	@FindBy(xpath = ".//a[@bem-id='61']")
	private WebElement settings;

	@FindBy(xpath = "(.//a[@data-name='filters'])[1]")
	private WebElement filterSettings;

	@FindBy(xpath = "//*[@id=\"options-form-filters\"]/table/tbody/tr/td[5]/div")
	private WebElement deleteFilterButton;

	@FindBy(xpath = ".//button[@class='btn btn_main confirm-ok']")
	private WebElement confirmDeleteFilterButton;

	@FindBy(xpath = ".//span[text()='Фильтр удалён']")
	public static WebElement filterDeleteMessage;

	public MailPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void enterDataForAutorization(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}

	public void clickLogout() {
		logoutLink.click();
	}

	public void clickButtonNewMail() {
		buttonNewMail.click();
	}

	public void enterEmails(String firstEmail, String secondEmail) {
		enterText(enterEmail, firstEmail + "\n");
		enterText(enterEmail, secondEmail + "\n");
	}

	public void enterLetterTopic(String topic) {
		enterText(letterTopic, topic);
	}

	public void enterMailContent(String text) {
		((JavascriptExecutor) driver).executeScript("tinyMCE.activeEditor.setContent('<p>" + text + "</p>')");
	}

	public void clickButtonSend() {
		buttonSend.click();
	}

	public boolean isMessageLetterSent(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(letterSentMessage))
				.isDisplayed();
		return letterSentMessage.isDisplayed();
	}

	public void clickRadioButtonMailIn_1() {
		checkboxMailIn_1.click();
	}

	public void clickRadioButtonMailIn_2() {
		checkboxMailIn_2.click();
	}

	public void clickDeleteButton() {
		deleteButton.click();
	}

	public boolean isDeleteMessage(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(deleteMessage))
				.isDisplayed();
		return deleteMessage.isDisplayed();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean isMessageInSpam(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(spamMessage))
				.isDisplayed();
		return spamMessage.isDisplayed();
	}

	public void clickSpam() {
		spamLink.click();
	}

	public void clickRadioButtonSpam() {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(checkboxSpam))
				.isDisplayed();
		checkboxSpam.click();
	}

	public void clickNotSpamButton() {
		buttonNotSpam.click();
	}

	public boolean isMessageExtractFromSpam(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(notSpamMessage))
				.isDisplayed();
		return notSpamMessage.isDisplayed();
	}

	public void clickAstrologyLink() {
		astrologyLink.click();
	}

	public void allSign() {
		allZodiacSign.click();
	}

	public void clickScorpionSign() {
		scorpionSign.click();
	}

	public void chooseAstrologyPeriod() {
		astrologyPeriod.click();
	}

	public boolean isForecastDisplayed(WebDriver driver) {
		return astrologyForecast.isDisplayed();
	}

	public void clickMoveButton() {
		moveButton.click();
	}

	public void clickNewFolderButton() {
		newFolderButton.click();
	}

	public void enterFolderName(String folderName) {
		enterText(fieldFolderName, folderName);
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

	public boolean isNewFolderMessageDisplay(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(newFolderMessage))
				.isDisplayed();
		return newFolderMessage.isDisplayed();
	}

	public void clickMore() {
		elementMore.click();
	}

	public void flagLetter() {
		flag.click();
	}

	public boolean isMessageFlag(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(flagMessage))
				.isDisplayed();
		return flagMessage.isDisplayed();
	}

	public void selectAllLeters() {
		allLeters.click();
	}

	public void removeAllFlags() {
		removeFlag.click();
	}

	public String isEnabledFlagNo(WebDriver driver) {
		return removeFlag.getAttribute("aria-disabled");
	}

	public void newFilter() {
		filter.click();
	}

	public void openFolders() {
		folder.click();
	}

	public void chooseFolder() {
		myFolder.click();
	}

	public void ckickSaveFilterButton() {
		saveFilterButton.click();
	}

	public boolean isMessageFilderDisplayed(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(filterMessage))
				.isDisplayed();
		return filterMessage.isDisplayed();
	}

	public void ckickMoreInMainMenu() {
		moreMainMenu.click();
	}

	public void openSettings() {
		settings.click();
	}

	public void openFilterSettings() {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(filterSettings))
				.isDisplayed();
		filterSettings.click();
	}

	public void deleteFilter() {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(filterMessage))
				.isDisplayed();
		deleteFilterButton.click();
	}

	public void confirmDeleteFilter() {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)
				.until(ExpectedConditions.visibilityOf(confirmDeleteFilterButton)).isDisplayed();
		confirmDeleteFilterButton.click();
	}

	public boolean isMessageFilderDeleteDisplayed(WebDriver driver) {
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(filterDeleteMessage))
				.isDisplayed();
		return filterDeleteMessage.isDisplayed();
	}

}
