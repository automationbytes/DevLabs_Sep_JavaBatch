package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		//scrollto - page up, pagedown
		//scrollby - x,y
		//scrollintoView - particular element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(8000);
		
		je.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(8000);
		je.executeScript("window.scrollBy(0,1200)");
		
		Thread.sleep(8000);
		je.executeScript("window.scrollBy(0,-600)");
		

		Thread.sleep(8000);
		//je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[normalize-space()='Awards & Recognition']")));
		
		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//div[normalize-space()='Awards & Recognition']")));
		act.build().perform();
		
	}
}
