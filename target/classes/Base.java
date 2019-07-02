package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import sun.net.ftp.FtpDirEntry.Type;

public class Base {

	public static WebDriver driver;
	public Properties properties = new Properties();
	
	public WebDriver initiateBrowser() throws IOException {

		
		FileInputStream fis = new FileInputStream("/home/sainath/Documents/selenium_framework/Demo/src/main/java/resources/data.properties");
		properties.load(fis);
		
		String browserName = properties.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/home/sainath/Documents/selenium_jars/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","/home/sainath/Documents/selenium_jars/geckodriver-v0.24.0-linux32/geckodriver");
			driver = new FirefoxDriver();
		}

		return driver;

	}
	
	public void getScreenshot(ITestResult result) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("/home/sainath/Documents/selenium_framework/Demo/screenshots/"+result+".jpg"));
		
	}
}
