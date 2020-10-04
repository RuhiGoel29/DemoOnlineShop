package pages;

import org.openqa.selenium.By;

public interface OnlinePageInterface {
	
	//Locators for Online shop website
	By btnHomepage = By.xpath("//div[@id='navbarExample']/ul/li/a[text()='Home ']");
	By Name = By.id("name");
	By Country = By.id("country");
	By City = By.id("city");
	By CreditCard = By.id("card");
	By Month = By.id("month");
	By Year = By.id("year");
	By OrderDetails = By.xpath("//p[@class='lead text-muted ']");
	By CaptureTotalPrice = By.xpath("//h3[@id='totalp']");
	
}
