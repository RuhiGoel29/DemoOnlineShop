package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adidas.onlineShop.driverFactory.BasePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OnlineShopPage;
import utils.Utilities;

public class OnlineShopStepDefination {
	
	//getting the driver object
	public WebDriver driver = BasePage.getDriver();
	
	//getting the object of class OnlineShopPage
	private OnlineShopPage ObjOnlineShopPage = OnlineShopPage.getOnlineShopPageObject();

	@Given("^DemoBlaze Web Page is opened$")
	public void demoblaze_Web_Page_is_opened() throws Throwable {
		driver.get(Utilities.getConfigValue("url"));
		System.out.println("DemoBlaze webpage is opened");
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg) throws Throwable {
		ObjOnlineShopPage.clickLink(arg);
		System.out.println("Clicked on " + arg);
	}

	@When("^I click on OK button in Alert popup$")
	public void i_click_on_OK_button_in_Alert_popup() throws InterruptedException {
		ObjOnlineShopPage.acceptAlert();
		System.out.println("Clicked on OK button in alert popup");
	}

	@When("^I click on Home button$")
	public void i_click_on_Home_button() throws InterruptedException, IOException {
		ObjOnlineShopPage.clickHomeButton();
		System.out.println("Clicked on HomeButton");
	}

	@When("^I delete product \"([^\"]*)\" from cart$")
	public void i_delete_product_from_cart(String arg) throws Throwable {
		ObjOnlineShopPage.deleteProductFromCart(arg);
		System.out.println("Deleted Product " + arg);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_Button(String arg) throws Throwable {
		ObjOnlineShopPage.clickButton(arg);
		System.out.println("Clicked on Button " + arg);
	}

	@When("^I enter the name \"([^\"]*)\"$")
	public void i_enter_the_name(String arg1) throws Throwable {
		ObjOnlineShopPage.enterName(arg1);
		System.out.println("Name entered " + arg1);
	}

	@When("^I enter the country \"([^\"]*)\"$")
	public void i_enter_the_country(String arg1) throws Throwable {
		ObjOnlineShopPage.enterCountry(arg1);
		System.out.println("Country entered " + arg1);
	}

	@When("^I enter the city \"([^\"]*)\"$")
	public void i_enter_the_city(String arg1) throws Throwable {
		ObjOnlineShopPage.enterCity(arg1);
		System.out.println("City entered " + arg1);
	}

	@When("^I enter the credit card \"([^\"]*)\"$")
	public void i_enter_the_credit_card(String arg1) throws Throwable {
		ObjOnlineShopPage.enterCreditCard(arg1);
		System.out.println("Card details entered " + arg1);
	}

	@When("^I enter the month \"([^\"]*)\"$")
	public void i_enter_the_month(String arg1) throws Throwable {
		ObjOnlineShopPage.enterMonth(arg1);
		System.out.println("Month entered " + arg1);
	}

	@When("^I enter the Year \"([^\"]*)\"$")
	public void i_enter_the_Year(String arg1) throws Throwable {
		ObjOnlineShopPage.enterYear(arg1);
		System.out.println("Year entered " + arg1);
	}
	@When("^I capture the Purchase ID$")
	public void i_capture_the_Purchase_ID() throws Throwable {
		ObjOnlineShopPage.CapturePurchaseId();
		System.out.println("Purchase ID captured");
	}

	@And("^I capture the Amount$")
	public void i_capture_the_Amount() throws Throwable {
		ObjOnlineShopPage.CaptureAmount();
		System.out.println("Amount captured");
	}
	
	@Then("^I verify purchase amount is expected$")
	public void i_verify_purchase_amount_is_expected() throws Throwable {
		Assert.assertTrue(ObjOnlineShopPage.validatePrice(), "Purchase amount is not equal");
		System.out.println("Purchase amount verified as expected");
	}
}
