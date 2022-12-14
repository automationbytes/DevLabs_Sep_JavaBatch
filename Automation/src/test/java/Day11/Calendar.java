package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flight-booking/goair-airlines.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("dpt_date")).click();
		for(int i = 0; i<12;i++) {
			
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//span[text()='Next']")).click();
			String Table1 = driver.findElement(By.xpath("(//div[@id=\"ui-datepicker-div\"]//span[@class=\"ui-datepicker-month\"])[1]")).getText();
			String Table2 = driver.findElement(By.xpath("(//div[@id=\"ui-datepicker-div\"]//span[@class=\"ui-datepicker-month\"])[2]")).getText();
			
			if(Table1.equals("June")) {
				List<WebElement> date = driver.findElements(By.xpath("(//table[@class=\"ui-datepicker-calendar\"]//td)[1]"));
				for(WebElement d : date) {
					d.getText().equals("19");
					d.click();
					break;
				}
			}
			
			else if(Table2.equals("June")) {
				List<WebElement> date = driver.findElements(By.xpath("(//table[@class=\"ui-datepicker-calendar\"]//td)[2]"));
				for(WebElement d : date) {
					d.getText().equals("19");
					d.click();
					break;
				}
			}
		}
		
		//System.out.println(driver.findElement(By.xpath("(//div[@id=\"ui-datepicker-div\"]//span[@class=\"ui-datepicker-month\"])[1]")).getText());
	}

}
