package Day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.openmultipleurl.com/");
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.google.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.bing.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.facebook.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.amazon.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.microsoft.com/");
		driver.findElement(By.xpath("//input[@value=\"Go Now\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allopenWindow = driver.getWindowHandles(); 
		
		for(String a : allopenWindow) {
			if(!a.equals(parentWindow)) {
				driver.switchTo().window(a);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				
				if(driver.getTitle().equals("Google")) {
					driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Selenium");
					driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
					break;
				}
				else {
					driver.close();
				}
			}
		}
	}
}
