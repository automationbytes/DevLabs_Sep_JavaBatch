package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	private By username = By.xpath("//input[@id=\"email\"]");
	private By password = By.xpath("//input[@id=\"pass\"]");
	private By signup = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;//by
		//PageFactory.initElements(driver, this);//findby
	}
	
	
	public void EnterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void EnterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickCreateNew() {
		driver.findElement(signup).click();
	}
}
