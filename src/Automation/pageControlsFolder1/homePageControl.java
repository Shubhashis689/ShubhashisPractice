package Automation.pageControlsFolder1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageControl {
public WebDriver driver;
	
	public homePageControl(WebDriver driver) {
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
	
	@FindBy(xpath="//section[1]/form[1]/div[1]/input[1]")
	public WebElement filterSearchBar;
	
	@FindBy(xpath="//section//input[@formcontrolname='minPrice']")
	public WebElement minPriceRange;
	
	@FindBy(xpath="//section//input[@formcontrolname='maxPrice']")
	public WebElement maxPriceRange;
	
	@FindBy(xpath="//div[@id='res']")
	public WebElement showingZeroResult;
	
	@FindBy(xpath="//section //h4[@id='burgundy']")
	public WebElement filterText;
}
