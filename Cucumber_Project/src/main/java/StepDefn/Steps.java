package StepDefn;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Steps {


	WebDriver driver;
	
	
	@Before(order = 1)
	public void beforeScen() {
		System.out.println("Before 1");
	}
	
	@Before(order = 2)
	public void beforetwo() {
		System.out.println("Before 2");
	}	
	
//	@BeforeAll
//	public void beforeAllScen() {
//		System.out.println("Before ALl Scenario");
//	}
	
	@BeforeStep
	public void beforeStepScen() {
		System.out.println("Before Step Scenario");
	}
	
	
	
	
	
	@Given("I navigates to google url")
	public void i_navigates_to_google_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Then("I verifies google search page is displayed")
	public void i_verifies_google_search_page_is_displayed() {
		Assert.assertEquals("Google", driver.getTitle());
	}
	@When("I enter {string} in search bar")
	public void i_enter_in_search_bar(String string) {
		driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).sendKeys(string);
	}
	@Then("I click on search button")
	public void i_click_on_search_button() {
		driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).sendKeys(Keys.ENTER);
	}


@When("I enter below values in search bar")
public void i_enter_below_values_in_search_bar(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
 //   throw new io.cucumber.java.PendingException();
	
	List<String> rows = dataTable.asList();
	System.out.println(rows.size());
	
	for(String r : rows) {
		System.out.println(r);
		
		driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).sendKeys(r);
		driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		
	}
	
	
}

@When("I enter below values as list of list")
public void i_enter_below_values(io.cucumber.datatable.DataTable dataTable) {
List<List<String>> rows = dataTable.asLists();
System.out.println(rows);

for(List<String> r : rows) {
	System.out.println(r.get(1));
}

}



@When("I enter below values as list of map")
public void i_enter_below_values_map(io.cucumber.datatable.DataTable dataTable) {
List<Map<String, String>> rows = dataTable.asMaps(String.class,String.class);
System.out.println(rows);

for(Map<String,String> r : rows) {
	System.out.println(r.get("firstname"));
	System.out.println(r.get("lastname"));
	
}

}



}
