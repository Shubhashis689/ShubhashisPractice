package Automation.pageActionsFolder1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Automation.pageControlsFolder1.orderPageControl;


public class orderPageAction {
	
	public WebDriver driver;
	public orderPageControl OrderPageControl;
	
	
	public orderPageAction(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	OrderPageControl=new orderPageControl(driver);
	}

	public boolean viewItems() throws InterruptedException
	{
	
	OrderPageControl.orders.click();
	Thread.sleep(5000);
	OrderPageControl.view.click();
	
	boolean isErrorPresent= OrderPageControl.emailTitle.isDisplayed();
	return isErrorPresent;
	}
	
	
	public void getTableData() throws InterruptedException
	{
		
		OrderPageControl.orders.click();
		
		for (WebElement tableData:OrderPageControl.tableRow)
		{
			System.out.println(tableData.getText());
		}
		
		
	}
	
	public boolean deleteFirstOrderFromTable() throws InterruptedException 
	{
		
		OrderPageControl.orders.click();
		Thread.sleep(2000);
		OrderPageControl.delete.click();
		Thread.sleep(2000);
		boolean isToastDisplayed=OrderPageControl.toastMessage.isDisplayed();
		return isToastDisplayed;
		
	}
	
	public void goBackToShop() throws InterruptedException
	{
		
		OrderPageControl.orders.click();
		Thread.sleep(2000);
		OrderPageControl.goBackToShop.click();
				
	}
	
	public void goBackToCart() throws InterruptedException
	{
		
		OrderPageControl.orders.click();
		Thread.sleep(2000);
		OrderPageControl.goBackToCart.click();
	}
	
	public boolean placeAnOrder() throws InterruptedException
	{
		
		OrderPageControl.adidasOriginalAddToCartButton.click();
		Thread.sleep(2000);
		OrderPageControl.cart.click();
		Thread.sleep(2000);
		OrderPageControl.buyNow.click();
		Thread.sleep(2000);
		OrderPageControl.selectCountry.sendKeys("ind");
		Thread.sleep(2000);

		for(WebElement tableList:OrderPageControl.countryDropdownList)
		{
			if(tableList.getText().equalsIgnoreCase("india"))
			{
				tableList.click();
				break;
			}
		}
		Thread.sleep(4000);
		OrderPageControl.placeOrder.click();
		Thread.sleep(4000);
		boolean isDisplay=OrderPageControl.thankYouForOrder.isDisplayed();
		return isDisplay;
		
	}
	
	
}
