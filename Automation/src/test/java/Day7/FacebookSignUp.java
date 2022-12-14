package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * 
		 * 
//tagname[@attribute = 'value']
//a[@data-testid='open-registration-form-button']


//tagname[@attribute1 = 'value' and @attribute2 = 'value']
//input[@type="text"]

//tagname[contains(@att,'val')]
//input[contains(@aria-label,'obile number or')]

//tagname[text()='value']
//label[text()='Female']
		 */
	//	driver.navigate().to("");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Select daySelect = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		daySelect.selectByValue("8");
		
		Select monthSelect = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		monthSelect.selectByVisibleText("May");
		
		Select yearSelect = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		yearSelect.selectByIndex(9);
		
		for(WebElement year : yearSelect.getOptions()) {
			System.out.println(year.getText());
		}
		
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
	}
}
