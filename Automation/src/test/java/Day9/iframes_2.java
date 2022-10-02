package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes_2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		Thread.sleep(10);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"Order a Brochure\"]")));
		//driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//a[@aria-controls=\"View the brochure and pricelist online\"]")).click();

	}
}
