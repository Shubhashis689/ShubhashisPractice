package Automation.pageActionsFolder1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation.pageControlsFolder1.loginPageControl;


public class loginPageAction {
	public WebDriver driver;
	public loginPageControl LoginPageControl;
	
	public loginPageAction(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		LoginPageControl=new loginPageControl(driver);
	}
	
	public boolean doLogin(String UserName, String PassWord)
	{
		LoginPageControl.username.sendKeys(UserName);
		LoginPageControl.password.sendKeys(PassWord);
		LoginPageControl.submit.click();
		//action method
		boolean isErrorPresent= LoginPageControl.toastMessage.isDisplayed();
		return isErrorPresent;
	}
	
	public void loginSuccess()
	{
		LoginPageControl.username.sendKeys("bapu689@gmail.com");
		LoginPageControl.password.sendKeys("Bapu@143");
		LoginPageControl.submit.click();
	}
	

}
