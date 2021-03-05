package com.trivago.Trivago;

import java.time.LocalDate;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLogin {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	JavascriptExecutor js = null;
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.trivago.in");
	WebElement e = driver.findElement(By.name("sQuery"));
	
	e.sendKeys("Mumbai");
	e.sendKeys(Keys.DOWN);
	e.sendKeys(Keys.ENTER);
	
	WebElement d = driver.findElement(By.className("dealform-button__label"));
	String dateValue = "13-03-2021";	
	 
	selectDate(driver,d,dateValue);	
}

public static void selectDate(WebDriver driver, WebElement e, String dateValue)
{
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value',+'"+dateValue+"')", e);
	
}


}


