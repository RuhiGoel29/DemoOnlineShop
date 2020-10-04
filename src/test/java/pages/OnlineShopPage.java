package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.adidas.onlineShop.driverFactory.BasePage;

import utils.Utilities;

public class OnlineShopPage extends BasePage implements OnlinePageInterface {
	
	public String expectedPrice;
	public String actualPrice;
	public static OnlineShopPage ObjOnlineShopPage = null;
	
	//creating the object of class OnlineShopPage
	public static OnlineShopPage getOnlineShopPageObject() {
		if(OnlineShopPage.ObjOnlineShopPage == null) 
		ObjOnlineShopPage = new OnlineShopPage();
		return ObjOnlineShopPage;
	}
	
	//Function for clicking any link
	public void clickLink(String arg)
	{
		driver.findElement(By.linkText(arg)).click();
	}
	
	public void acceptAlert() throws InterruptedException
	{ 	
		Thread.sleep(2000);
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		Thread.sleep(2000);
		
	}
	public void clickHomeButton() throws InterruptedException, IOException
	{
		Utilities.explicitWait(btnHomepage, driver);
		driver.findElement(btnHomepage).click();
		Thread.sleep(3000);
	}
	
	public void deleteProductFromCart(String arg) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//td[text()='"+ arg +"']/following-sibling::td/a")).click();
		Thread.sleep(3000);
		Utilities.explicitWait(CaptureTotalPrice, driver);
		expectedPrice = driver.findElement(CaptureTotalPrice).getText();
		
	}
	
	//Dynamic xpath for clicking any button
	public void clickButton(String arg) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='"+ arg +"']")).click();
		
	}
	
	public void enterName(String arg1) throws InterruptedException
	{
		driver.findElement(Name).sendKeys(arg1);		
	}
	
	public void enterCountry(String arg1) throws InterruptedException
	{
		driver.findElement(Country).sendKeys(arg1);		
	}
	
	public void enterCity(String arg1) throws InterruptedException
	{
		driver.findElement(City).sendKeys(arg1);		
	}
	
	public void enterCreditCard(String arg1) throws InterruptedException
	{
		driver.findElement(CreditCard).sendKeys(arg1);		
	}
	
	public void enterMonth(String arg1) throws InterruptedException
	{
		driver.findElement(Month).sendKeys(arg1);		
	}
	
	public void enterYear(String arg1) throws InterruptedException
	{
		driver.findElement(Year).sendKeys(arg1);		
	}
	
	public void CapturePurchaseId()
	{
		String[] arr= driver.findElement(OrderDetails).getText().split("\n");
		System.out.println(arr[0]);
	}
	
	public void CaptureAmount()
	{
		String[] arr= driver.findElement(OrderDetails).getText().split("\n");
		System.out.println(arr[1]);
	}
	
	//Function for validating the price
	public boolean validatePrice()
	{	System.out.println(expectedPrice);
		String[] arr = driver.findElement(OrderDetails).getText().split("\n");
		String[] arr1 = arr[1].split(" ");
		actualPrice = arr1[1];
		System.out.println(actualPrice);
		if(expectedPrice.contains(actualPrice))
			return true;
		else
			return false;
		
	}
}
