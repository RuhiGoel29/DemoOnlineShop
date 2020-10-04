package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	// This function returns values from config.properties file
	public static String getConfigValue(String arg) {
		String value = "";
		try {
			Properties prop = new Properties();
			FileReader file = new FileReader(System.getProperty("user.dir") + "\\config.properties");
			prop.load(file);
			value = prop.getProperty(arg);
		} catch (Exception e) {
			System.out.println("unable to read config file");

		}
		return value;
	}

	// Explicit wait Function
	public static boolean explicitWait(By by, WebDriver driver) throws IOException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
