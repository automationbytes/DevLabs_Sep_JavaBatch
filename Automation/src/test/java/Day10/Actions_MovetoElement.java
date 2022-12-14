package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_MovetoElement {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li[@class='site-nav__menu ']/a[text()='Weather']")));
		act.moveToElement(driver.findElement(By.xpath("//a[@class='site-nav__link' and text()='2-Week Forecast']")));
		act.click(driver.findElement(By.xpath("//a[@class='site-nav__link' and text()='2-Week Forecast']")));
		act.build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//li[@class=\"nav-2__item\"]/a[text() = \"Sun & Moon \"]")));
		act.moveToElement(driver.findElement(By.xpath("//li[@class=\"nav-2__submenu-item\"]/a[text()='Moon Phases ']")));
		act.click().build().perform();
	}
}
