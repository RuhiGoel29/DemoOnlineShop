package com.adidas.onlineShop.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
	private static WebDriver driver;

	// Initializing driver
	public static void launchdriver(String browser) {
		if (null == driver) {
			switch (browser.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "FIREFOX":
				break;
			default:
			}
		}
	}

	public static WebDriver getDriverInstance() {
		if (null == driver) {
			launchdriver("chrome");// setting default value as chrome if not initialized

		}
		return driver;

	}
}
