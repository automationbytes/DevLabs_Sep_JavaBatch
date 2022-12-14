package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.findElement(By.xpath("(//a/p[contains(text(),'Catalog')])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		
		Thread.sleep(5000);
		
		Select pagesize = new Select(driver.findElement(By.name("products-grid_length")));
		pagesize.selectByVisibleText("100");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();
		Thread.sleep(2000);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//tr"));
		int rowsize = row.size();
		System.out.println(rowsize);
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//th//div"));
		int colsize = col.size();
		System.out.println(colsize);
		
		for(int j = 1; j<=colsize; j++) {
		//	System.out.println("//table[@id=\"products-grid\"]//th["+j+"]/div");
			System.out.println(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//th["+j+"]/div")).getAttribute("textContent"));
			if(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//th["+j+"]/div")).getAttribute("textContent").equals("Product name")) {

				for(int i = 1; i<rowsize;i++) {
					System.out.println(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]//td["+j+"]")).getText());
					if(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]//td["+j+"]")).getText().equals("Nokia Lumia 1020")) {
						driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]//td[8]/a")).click();
						break;
					}
				}	
		
			}
			
		}
}
}
		
//		for(WebElement c : col) {
//			System.out.println(c.getAttribute("textContent"));
//		}
		
//		
//			}


