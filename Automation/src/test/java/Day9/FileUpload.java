package Day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("(//span[text()='Choose']/parent::span/input)[1]")).sendKeys("C:\\Users\\Vigne\\SepBatch\\Automation\\src\\test\\java\\Day9\\Dummy.txt");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//span[text()='Choose'])[1]")));
		
		Thread.sleep(6000);
		
		Robot rb = new Robot();
		
		//Copy file path to clipboard
		StringSelection path = new StringSelection("C:\\Users\\Vigne\\SepBatch\\Automation\\src\\test\\java\\Day9\\Dummy.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		
		//press ctrl + v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//release ctrl + v
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		//press enter
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		//release enter
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
	}

}
