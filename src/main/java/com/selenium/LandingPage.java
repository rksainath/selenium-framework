package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.xpath("//*[@id=\"content\"]/ul/li[3]/a");
	By TextField = By.xpath("//h2[contains(text(),'Available Examples')]");
	By ABTesting = By.xpath("//a[contains(text(),'A/B Testing')]");
	
	By LPage = By.xpath("//*[@id=\"content\"]");

	public WebElement getSignIn() {
		WebElement login = driver.findElement(signin);
		return login;

	}

	public WebElement getAbs() {
		WebElement abs = driver.findElement(ABTesting);
		return abs;

	}
	
	public WebElement AbsText() {
		WebElement absText = driver.findElement(TextField);
		return absText;

	}
	
	public WebElement landPage() {
		WebElement lndpage = driver.findElement(TextField);
		return lndpage;

	}

	
}
