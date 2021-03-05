package com.trivago.Trivago;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoTestClass {
  
	public static WebDriver driver;
	
	
	@BeforeTest
	public void browserSetup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.trivago.in");
	}
	
	
	@Test(priority=0)
	public void clicklogin() {
	CompareHotelPricePage cp = new CompareHotelPricePage(driver);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	cp.clickLoginLink();
	}
	
	@Test(priority=1)
	public void clickLog_in() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
				
		Thread.sleep(400);
		lp.clickLog_in();
		
	}
	
	
	@AfterTest
	public void tear_down() {
		driver.close();
	}
	
	
}
