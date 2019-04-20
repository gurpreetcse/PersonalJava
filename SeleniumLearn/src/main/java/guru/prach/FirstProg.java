package guru.prach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProg {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\n691643\\Documents\\Lib\\IEDriverServer.exe");
		//ChromeOptions chromeOptions = new ChromeOptions();
	    //chromeOptions.setBinary("C:\\Users\\n691643\\AppData\\Local\\Google\\Chrome SxS\\Application\\chrome.exe");
	    //chromeOptions.addArguments("--headless");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
