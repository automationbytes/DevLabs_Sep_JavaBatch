package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Paste']")));
		act.click().build().perform();
		
		driver.switchTo().alert().accept();
		
		act.doubleClick(driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']")));
		act.build().perform();
		
	}
}
