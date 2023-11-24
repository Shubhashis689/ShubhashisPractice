package Automation.pageControlsFolder1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageControl {
	
public WebDriver driver;
	
	public CartPageControl(WebDriver driver) {
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

	
	
	@FindBy(xpath="//b")
	public List<WebElement> productNames;	
	
	@FindBy(xpath="//ancestor::div[@class='card-body']//button[2]")
	public List<WebElement> allAddToCartButton;
	
	
	@FindBy(xpath="//div[@class='cart']")
	public WebElement cartPageTable;
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	public List<WebElement> productNameOnCartTable;
	
	@FindBy(xpath="//h5/b")
	public List<WebElement> productNameOnHomePage;
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	public List<WebElement> allViewButton;
	
	@FindBy(xpath="//div/h2")
	public WebElement desiredProductOnViewPage;
	
	@FindBy(xpath="//li[@class='totalRow']/button")
	public WebElement checkoutButton;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	public WebElement selectCountry;
	
	@FindBy(xpath="//section/button/span")
	public List<WebElement> countryList;
	
	@FindBy(xpath="//a[@class='btnn action__submit ng-star-inserted']")
	public WebElement placeOrder;
	
	@FindBy(xpath="//h1")
	public WebElement thankYouForTheOrder;
}
