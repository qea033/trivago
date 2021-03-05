package com.trivago.Trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public static WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver,5);
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By emailAddress_field = By.id("login_email");
	
	By password_field = By.id("login_password");
	
	By login_button = By.id("login_submit");
	
	public void clickLog_in() throws InterruptedException {
		
		driver.findElement(emailAddress_field).sendKeys("qea035@gmail.com");
		Thread.sleep(400);
		driver.findElement(password_field).sendKeys("TestPass@1234");
		Thread.sleep(400);
		driver.findElement(login_button).click();
	}
}
