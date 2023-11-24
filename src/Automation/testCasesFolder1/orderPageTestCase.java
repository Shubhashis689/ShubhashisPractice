package Automation.testCasesFolder1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.pageActionsFolder1.loginPageAction;
import Automation.pageActionsFolder1.orderPageAction;
import Automation.pageControlsFolder1.loginPageControl;
import Automation.pageControlsFolder1.orderPageControl;

public class orderPageTestCase {
	
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
		//System.out.println("AfterTest");
		driver.quit();
	}
	
	@Test
	public void itemsViewPage() throws InterruptedException
	{
		orderPageAction order=new orderPageAction(driver);
		boolean isViewed=order.viewItems();
		Assert.assertTrue(isViewed);
	}
	
	@Test
	public void tableDataPrint() throws InterruptedException
	{
		orderPageAction order=new orderPageAction(driver);
		order.getTableData();
	}

	/*@Test
	public void deleteButton() throws InterruptedException
	{
		orderPageAction order=new orderPageAction(driver);
		boolean isDelete=order.delete();
		Assert.assertTrue(isDelete);
	}
	
	@Test
	public void GoBackToShop() throws InterruptedException
	{
		orderPageAction order=new orderPageAction(driver);
		order.goBackToShop();
		Thread.sleep(3000);
		orderPageControl OrderPageControl=new orderPageControl(driver);
		Assert.assertEquals(OrderPageControl.filters.getText(),"Filters");
	}
	
	@Test
	public void GoBackToCart() throws InterruptedException
	{
		
		orderPageAction order=new orderPageAction(driver);
		order.goBackToCart();
		Thread.sleep(3000);
		orderPageControl OrderPageControl=new orderPageControl(driver);
		Assert.assertEquals(OrderPageControl.myCart.getText(),"My Cart");
		
	}*/
	
	@Test
	public void orderItem() throws InterruptedException
	{
		orderPageAction order=new orderPageAction(driver);
		boolean isAdded=order.placeAnOrder();
		Assert.assertTrue(isAdded);
	}
	
}
