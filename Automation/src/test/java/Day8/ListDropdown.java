package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListDropdown {
	public static WebDriver driver;
	
	public static void ListValue(String xpath, String val) {

		List<WebElement> dateCal = driver.findElements(By.xpath(xpath));
		for(WebElement d : dateCal) {
			System.out.println(d.getText());
			if(d.getText().equals(val)) {
				d.click();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Kol");	
		
		List<WebElement> sourcedrpdwn = driver.findElements(By.xpath("//input[@id=\"src\"]/following-sibling::ul/li"));
		
		for(WebElement s : sourcedrpdwn) {
			//System.out.println(s.getText());
			if(s.getText().equals("Kollam")) {
				s.click();
				break;
			}
		}
		
		
		driver.findElement(By.id("dest")).sendKeys("Ba");
//		List<WebElement> destDropdwn = driver.findElements(By.xpath("//input[@id=\"dest\"]/following-sibling::ul/li"));
//		
//		for(WebElement d : destDropdwn) {
//			//System.out.println(d.getText());
//			if(d.getText().contains("Madhya Pradesh")) {
//				d.click();
//				break;
//			}
//		}
		ListValue("//input[@id=\"dest\"]/following-sibling::ul/li", "Madiwala, Bangalore");
		
		ListValue("//table//td", "10");
//		
//		List<WebElement> dateCal = driver.findElements(By.xpath("//table//td"));
//		for(WebElement d : dateCal) {
//			System.out.println(d.getText());
//			if(d.getText().equals("19")) {
//				d.click();
//				break;
//			}
//		}
//		

		
		
	}
}
