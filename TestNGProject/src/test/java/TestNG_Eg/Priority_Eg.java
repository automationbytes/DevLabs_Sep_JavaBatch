package TestNG_Eg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority_Eg {
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



	@Test(priority = 2)
	public void Yahoo() {
		driver.get("https://www.yahoo.com/");
		System.out.println("Yahoo");
	}

	@Test(priority = -1)
	public void Google() {
		driver.get("https://www.google.com/");
		System.out.println("Google");
	}

	@Test(priority = 0)
	public void Bing() {
		driver.get("https://www.bing.com/");
		System.out.println("Bing");
	}



	@Test(priority = 2)
	public void Amazon() {
		driver.get("https://www.Amazon.com/");
		System.out.println("Amazon");
	}



	@Test(priority = -10)
	public void Ebay() {
		driver.get("https://www.ebay.com/");
		System.out.println("Ebay");
	}

}
