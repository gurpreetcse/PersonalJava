package guru.prach;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BrowserOpen {
	
	 private WebDriver driver;

		@BeforeClass
	    public void beforeClass() {
			//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\n691643\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59\\chromedriver.exe");
			System.setProperty("webdriver.ie.driver","C:\\Users\\n691643\\Documents\\Lib\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//ChromeOptions options = new ChromeOptions();
			//options.setExperimentalOption("useAutomationExtension", false);
	        //driver = new ChromeDriver();
	    }
	     @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }

	    @Test
	    public void verifySearchButton() {
	        driver.get("http://www.google.com");
	     	System.out.println(driver.getTitle());
	    }

}
