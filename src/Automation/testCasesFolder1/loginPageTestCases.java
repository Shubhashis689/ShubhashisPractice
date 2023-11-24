package Automation.testCasesFolder1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.pageActionsFolder1.loginPageAction;
import Automation.pageControlsFolder1.loginPageControl;


public class loginPageTestCases {
	public WebDriver driver;
	
	@BeforeMethod
	public void beforeTestcase() throws InterruptedException
	{
		 loginPageControl log=new loginPageControl();
		
		driver=log.login();
		 
	}
	
	@AfterMethod
	public void tearDown()
	{
		//System.out.println("AfterTest");
		driver.quit();
	}
	
	@Test
	public void loginSuccess()
	{
		loginPageAction log= new loginPageAction(driver);
		
		boolean isSuccess=log.doLogin("bapu689@gmail.com","Bapu@143");
		Assert.assertTrue(isSuccess);
	}
	@Test
	public void loginUnsuccess()
	{
		
		loginPageAction log=new loginPageAction(driver);
		
		boolean isSuccess=log.doLogin("bapuu689@gmail.com","Bapu@143");
		Assert.assertTrue(isSuccess);
	}
	
	@Test
	public void loginNew()
	{
		
		loginPageAction log=new loginPageAction(driver);
		
		log.doLogin("sipun1234@gmail.com","Bapu123@143");
		System.out.println("FailTestCase");
}
	

}
