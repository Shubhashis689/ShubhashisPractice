package Automation.pageActionsFolder1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Automation.pageControlsFolder1.CartPageControl;
import Automation.pageControlsFolder1.orderPageControl;

public class CartPageAction {
	
	public WebDriver driver;
	public CartPageControl cartPageControl;
	public orderPageControl OrderPageControl;
	
	public CartPageAction(WebDriver driver) {
		super();
		this.driver=driver;
		cartPageControl=new CartPageControl(driver);
		OrderPageControl=new orderPageControl(driver);
	}
	
	
	
	protected void addMultipleProductToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		String[] itemsNeeded= {"zara coat 3", "iphone 13 pro"};
		int j=0;
		for(int i=0;i<cartPageControl.productNames.size();i++)
		{
			String AllProductNames=cartPageControl.productNames.get(i).getText();
			
			List itemsNeededList=Arrays.asList(itemsNeeded);
		
			if(itemsNeededList.contains(AllProductNames))
			{
				j++;
				Thread.sleep(3000);
			//	cartPageControl.allAddToCartButton.click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}	
		}			
	}
	
	
	
	public void clickOnCartButton() throws InterruptedException
	{
		Thread.sleep(2000);
		OrderPageControl.cart.click();
	}
	
	public void addOneProductToCart(String desiredProduct)
	{
		List<WebElement> productsOnHomePage=cartPageControl.productNameOnHomePage;
		//String[] item ={desiredProduct};
		for(int i=0;i<productsOnHomePage.size();i++)
		{
			String productName=productsOnHomePage.get(i).getText();
			// List itemsneeded = Arrays.asList(item);
			 if(desiredProduct.contains(productName))
				{
				 cartPageControl.allAddToCartButton.get(i).click();
				}
			
	}}
	
	public boolean isProductDisplayOnCartPage(String desiredProduct)
	{
		
		List<WebElement> productsOnCartPage=cartPageControl.productNameOnCartTable;
		for(int i=0;i<productsOnCartPage.size();i++)
		{
			String productOnCartPage=productsOnCartPage.get(i).getText();
			//System.out.println(productOnCartPage);
			if(desiredProduct.contains(productOnCartPage))
			{
				return true;
			}
		}
	    return false;
	}
	
	public void viewOneProduct(String desiredProduct)
	{
		List<WebElement> productsOnHomePage=cartPageControl.productNameOnHomePage;
		//String[] item ={desiredProduct};
		for(int i=0;i<productsOnHomePage.size();i++)
		{
			String productName=productsOnHomePage.get(i).getText();
			// List itemsneeded = Arrays.asList(item);
			 if(desiredProduct.contains(productName))
				{
				 cartPageControl.allViewButton.get(i).click();
				}}
		}
	
	public boolean isProductDisplayOnViewPage(String desiredProduct) throws InterruptedException
		{
			Thread.sleep(2000);
			String actualProductName=cartPageControl.desiredProductOnViewPage.getText();
			if(actualProductName.equals(desiredProduct))
			{
				return true;
			}
	    return false;
}
	
	public void clickOnCheckOutButton() throws InterruptedException
	{
		Thread.sleep(2000);
		cartPageControl.checkoutButton.click();
	}

	public void selectDesiredCountry(String country) throws InterruptedException
	{
		Thread.sleep(2000);
		cartPageControl.selectCountry.sendKeys(country);
		Thread.sleep(2000);
		List<WebElement> countries=cartPageControl.countryList;
		
		/*for(int i=0;i<countries.size();i++)
		{
			String countryName=countries.get(i).getText();*/
		for(WebElement element:countries)
		{
			String countryName=element.getText();
			if(country.equals(countryName))
			{
				element.click();
				break;
				//cartPageControl.countryList.get(i).click();
			}
		}	
	}
	
	public void placeOrder()
	{
		cartPageControl.placeOrder.click();
	}
	
	public boolean thankYouPage()
	{
		boolean pass=cartPageControl.thankYouForTheOrder.isDisplayed();
		return pass;
	}
	
	
	
	
	
	
	

}