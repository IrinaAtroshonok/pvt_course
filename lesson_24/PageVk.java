package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageVk {
	private final String LOGIN = ""; //My login
	private final String PASSWORD = ""; //My password
	
	@FindBy(xpath = ".//a[text()='Ирина Атрошонок']")
	private WebElement author;

	@FindBy(xpath = ".//div[text()='Атрошонок']")
	private WebElement postText;

	@FindBy(xpath = ".//input[@id='index_email']")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id='index_pass']")
	private WebElement passwordField;

	@FindBy(xpath = ".//button[@id=\"index_login_button\"]")
	private WebElement enterButton;

	@FindBy(xpath = ".//div[@class='top_profile_name']")
	private WebElement logoutField;

	public PageVk(WebDriver driver) {
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

	public void login(WebDriver driver) {
		enterData(LOGIN, PASSWORD); 
		enterButton.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(logoutField));
	}

	public boolean isPostOnTheWall(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(author));
		return author.isDisplayed();
	}

	public boolean isPostUpdated(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(postText));
		return postText.isDisplayed();
	}

	public boolean isPostDeleted(WebDriver driver) {
		return postText.isDisplayed();
	}

}
