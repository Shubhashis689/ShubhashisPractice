package Automation.pageControlsFolder1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPageControl {
	
	public WebDriver driver;
	
	public orderPageControl(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver login()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapu\\Downloads\\Bapu\\New driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		return driver;	
}

	@FindBy(xpath="(//button[contains(@class,'btn-custom')])[2]")
	public WebElement orders;
	
	@FindBy(xpath="(//button[contains(@class,'btn-primary')])[1]")
	public WebElement view;
	
	@FindBy(xpath="//div[@class='email-title']")
	public WebElement emailTitle;
	
	@FindBy(xpath="//tr")
	public List<WebElement> tableRow;
	
	@FindBy(xpath="(//button[contains(@class,'btn-danger')])[1]")
	public WebElement delete;
	
	@FindBy(xpath="//div[@class='toast-bottom-right toast-container']")
	public WebElement toastMessage;
	
	@FindBy(xpath="//button[@class='btn btn-primary col-md-2 offset-md-4']")
	public WebElement goBackToShop;
	
	@FindBy(xpath="//section/div/h4")
	public WebElement filters;
	
	@FindBy(xpath="//button[@class='btn btn-primary col-md-2']")
	public WebElement goBackToCart;
	
	@FindBy(xpath="//h1[contains(text(),'My Cart')]")
	public WebElement myCart;
	
	@FindBy(xpath="//button[contains(@routerlink,'/dashboard/cart')]")
	public WebElement cart;
	
	@FindBy(xpath="//section[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[2]")
	public WebElement adidasOriginalAddToCartButton;
	
	@FindBy(xpath="//div[2]/ul[1]/li[1]/div[1]/div[3]/button[1]")
	public WebElement buyNow;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	public WebElement selectCountry;
	
	@FindBy(xpath="//span[@class='ng-star-inserted']")
	public List<WebElement> countryDropdownList;
	
	@FindBy(xpath="//a[contains(@class,'btnn action__submit ng-star-inserted')]")
	public WebElement placeOrder;
	
	@FindBy(xpath="//h1[contains(@class,'hero-primary')]")
	public WebElement thankYouForOrder;
	
	
}
