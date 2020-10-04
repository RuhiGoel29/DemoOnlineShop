package stepDefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.adidas.onlineShop.driverFactory.BasePage;
import com.adidas.onlineShop.driverFactory.SingletonDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private WebDriver driver;
	
	//Initializing driver, setting implicit wait, maximizing browser
	@Before
	public void setup(){
		driver = SingletonDriver.getDriverInstance();
		BasePage.setDriver(driver); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void afterScenario() {
		driver.quit(); // closing all the open browsers
	}

}
