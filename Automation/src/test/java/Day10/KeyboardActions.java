package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	public static void main(String[] args) {
		
		int n = 10;
		byte i = (byte) n;
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hello Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		
		
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.TAB);
//		act.keyUp(null, Keys.TAB);
//		act.build().perform();
	}
}
