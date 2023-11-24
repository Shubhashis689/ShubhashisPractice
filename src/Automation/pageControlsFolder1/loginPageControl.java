package Automation.pageControlsFolder1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageControl {
	
public WebDriver driver;
	
	public loginPageControl(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public loginPageControl() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='userEmail']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='userPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement submit;
	
	@FindBy(xpath="//div[@id='toast-container']")
	public WebElement toastMessage;
	
	@FindBy(xpath="(//button[contains(@class,'btn-custom')])[2]")
	public WebElement orders;
	
	@FindBy(xpath="(//button[contains(@class,'btn-primary')])[1]")
	public WebElement view;
	
	@FindBy(xpath="//div[@class='email-title']")
	public WebElement emailTitle;
	
	public WebDriver login() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapu\\Downloads\\Bapu\\New driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		return driver;
		
	
}
	

}
	
	


