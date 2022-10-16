package TestNG_Eg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class depends_ongrps {

	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Before Class");
	}

	@AfterClass(alwaysRun = true)
	public void cleanup() {
		driver.close();
		driver.quit();
		System.out.println("After Class");
	}



	@Test(groups= {"searchengine"})
	public void launch() {
		driver.get("https://www.yahoo.com/");
		System.out.println("Google");
	}

	@Test(groups= {"searchengine"})
	public void launchGoogle() {
		driver.get("https://www.google.com/");
		System.out.println("Google");
	}

	@Test(groups= {"searchengine"})
	public void launchBing() {
		driver.get("https://www.bing.com/");
		System.out.println("Bing");
	}



	@Test(dependsOnGroups = {"searchengine"})
	public void launchAmazon() {
		driver.get("https://www.Amazon.com/");
		System.out.println("Amazon");
	}



	@Test(dependsOnGroups = {"searchengine"})
	public void launchEbay() {
		driver.get("https://www.ebay.com/");
		System.out.println("Ebay");
	}

}


