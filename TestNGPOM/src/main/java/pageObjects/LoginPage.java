package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTestClass;

public class LoginPage extends BaseTestClass {
	
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement username_webedit;
	
	

	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement password_webedit;

	
	@FindBy(name = "login-button")
	WebElement login_webButton;

	By username_editbox = By.xpath("//input[@placeholder='Username']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; //by method
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName(String username) {
		driver.findElement(username_editbox).sendKeys(username);
	}
	
	public void enterUser(String user) {
		username_webedit.sendKeys(user);
	}
	
	public void enterpasswrd(String pass) {
		password_webedit.sendKeys(pass);
	}

	
	public void clickLogin() {
		login_webButton.click();
	}
	
	
	public String pageTitle() {
		return driver.getTitle();
	}
}
