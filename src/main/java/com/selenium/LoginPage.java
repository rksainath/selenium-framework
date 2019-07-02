package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.xpath("//*[@id=\"content\"]/ul/li[3]/a");

	public WebElement getSignIn() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement login = driver.findElement(signin);
		return login;
		

	}

}
