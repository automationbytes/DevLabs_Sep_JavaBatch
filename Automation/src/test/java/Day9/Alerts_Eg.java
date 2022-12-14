package Day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Eg {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();
		
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		driver.switchTo().alert().sendKeys("Tommy");
	//	driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();
	}
}
