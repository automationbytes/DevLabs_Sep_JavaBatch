package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumProg {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hellouser");
		
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("otten passwor")).click();
		
		
		
	}
}
