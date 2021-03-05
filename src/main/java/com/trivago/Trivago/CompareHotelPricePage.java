package com.trivago.Trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareHotelPricePage {
	
	public static WebDriver driver;
	
	CompareHotelPricePage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	By LoginLink = By.xpath("//*[@id=\"js_navigation\"]/div/div[1]/button/span");
	
	public void clickLoginLink() {
		driver.findElement(LoginLink).click();
	}
	
	
}
