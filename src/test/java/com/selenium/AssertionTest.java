package com.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

import java.io.IOException;

public class AssertionTest extends Base {
	public static Logger log = LogManager.getLogger(AssertionTest.class.getName());
	
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
		
		lp.getAbs().click();
		log.info("Clicked A/B Testing");

	}

	@AfterTest
	public void Rampdown() {
		driver.close();
		driver=null;
		log.info("Driver Closed");
	}

}
