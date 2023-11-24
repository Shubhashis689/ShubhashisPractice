package Automation.pageActionsFolder1;

import org.openqa.selenium.WebDriver;

import Automation.pageControlsFolder1.CartPageControl;
import Automation.pageControlsFolder1.homePageControl;
import Automation.pageControlsFolder1.orderPageControl;

public class homePageAction {
	public WebDriver driver;
	public CartPageControl cartPageControl;
	public orderPageControl OrderPageControl;
	public homePageControl HomePageControl;
	public homePageAction(WebDriver driver) {
		super();
		this.driver=driver;
		cartPageControl=new CartPageControl(driver);
		OrderPageControl=new orderPageControl(driver);
		HomePageControl=new homePageControl(driver);
	}
	
	public boolean validateFilter(String item) throws InterruptedException
	{
		Thread.sleep(3000);
		HomePageControl.filterSearchBar.sendKeys(item);
		HomePageControl.filterText.click();
		boolean noResult=HomePageControl.showingZeroResult.isDisplayed();
		return noResult;
	}
	
	public boolean filterByPriceRange(int minPrice, int maxPrice) throws InterruptedException
	{
		Thread.sleep(3000);
		HomePageControl.minPriceRange.sendKeys(String.valueOf(minPrice));
		HomePageControl.maxPriceRange.sendKeys(String.valueOf(maxPrice));
		HomePageControl.filterText.click();
		boolean noResult=HomePageControl.showingZeroResult.isDisplayed();
		return noResult;
	}
	
	
	
	
}
