package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbhiBus {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id=\"source\"]")).sendKeys("cha");	
		
		List<WebElement> sourcedrpdwn = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement s : sourcedrpdwn) {
			System.out.println(s.getText());
			
		}
		
		
		
	}
}
