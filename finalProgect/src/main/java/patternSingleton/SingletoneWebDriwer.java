package patternSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletoneWebDriwer {

	private static WebDriver driver;

	private SingletoneWebDriwer() {

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}
