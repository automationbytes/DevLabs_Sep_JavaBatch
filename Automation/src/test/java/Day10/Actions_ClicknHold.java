package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_ClicknHold {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		
		Actions act = new Actions(driver);
//		act.clickAndHold(driver.findElement(By.xpath("//span[text()='50L']/parent::span")));
//		act.release(driver.findElement(By.xpath("//span[text()='125L']/parent::span")));
//		act.build().perform();
//		
		
		act.dragAndDrop(driver.findElement(By.xpath("//span[text()='50L']/parent::span")), driver.findElement(By.xpath("//span[text()='125L']/parent::span")));
		act.build().perform();
	}
}
