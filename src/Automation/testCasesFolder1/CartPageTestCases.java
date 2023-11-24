package Automation.testCasesFolder1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.pageActionsFolder1.CartPageAction;
import Automation.pageActionsFolder1.loginPageAction;
import Automation.pageControlsFolder1.loginPageControl;

	public class CartPageTestCases {
	
	public WebDriver driver;

	@BeforeMethod
	public void beforeTestcase() throws InterruptedException
	{
		loginPageControl log=new loginPageControl();		
		driver=log.login();
		loginPageAction login=new loginPageAction(driver);
		login.loginSuccess(); 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void addedDesiredProductToCart() throws InterruptedException
	{
		String product="IPHONE 13 PRO";
		CartPageAction cartPageAction=new CartPageAction(driver);
		cartPageAction.addOneProductToCart(product);
		cartPageAction.clickOnCartButton();
		boolean actual=cartPageAction.isProductDisplayOnCartPage(product);
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void viewDesiredProduct() throws InterruptedException
	{
		String product="ADIDAS ORIGINAL";
		CartPageAction cartPageAction=new CartPageAction(driver);
		cartPageAction.viewOneProduct(product);
		boolean actual=cartPageAction.isProductDisplayOnViewPage(product);
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void bookAnOrder() throws InterruptedException
	{
		String product="IPHONE 13 PRO";
		String Country="Pakistan";
		CartPageAction cartPageAction=new CartPageAction(driver);
		cartPageAction.addOneProductToCart(product);
		cartPageAction.clickOnCartButton();
		cartPageAction.clickOnCheckOutButton();
		cartPageAction.selectDesiredCountry(Country);
		cartPageAction.placeOrder();
		boolean isSuccess=cartPageAction.thankYouPage();
		Assert.assertTrue(isSuccess);
		
	}
	/*
	
	@Test
	public void addMultipleItemsToCart() throws InterruptedException
	{
		CartPageAction cartPageAction=new CartPageAction(driver);
		cartPageAction.addMultipleProductToCart();
	}
	*/
	
}
