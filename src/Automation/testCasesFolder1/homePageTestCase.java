package Automation.testCasesFolder1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.pageActionsFolder1.homePageAction;
import Automation.pageActionsFolder1.loginPageAction;
import Automation.pageControlsFolder1.loginPageControl;

public class homePageTestCase {
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
	public void filterForNoResult() throws InterruptedException
	{
		homePageAction home=new homePageAction(driver);
		boolean isSuccess=home.validateFilter("Bike");
		Assert.assertTrue(isSuccess);
	}
	
	@Test
	public void filterByPriceRangeForNoResult() throws InterruptedException
	{
		homePageAction home=new homePageAction(driver);
		boolean isSuccess=home.filterByPriceRange(20, 200);
		Assert.assertTrue(isSuccess);
	}
	
	
	
	
	
}
