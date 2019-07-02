package com.selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.io.IOException;

public class HomePage extends Base {

	private static Logger log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initiateTest() throws IOException {
		driver = initiateBrowser();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		log.info("Driver initialized");
	}

	@Test
	public void browserTest() throws IOException {

		LandingPage lp = new LandingPage(driver);

		AssertJUnit.assertEquals(lp.landPage().isDisplayed(), true);
		log.info("Landing page is displayed");

	}

	@AfterTest
	public void Rampdown() {
		driver.close();
		log.info("Browser closed");
		driver=null;
	}

}
