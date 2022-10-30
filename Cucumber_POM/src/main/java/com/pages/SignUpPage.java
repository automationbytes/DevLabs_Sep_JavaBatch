package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	private WebDriver driver;
	private By firstname = By.xpath("//input[@name=\"firstname\"]");
	private By lastname = By.xpath("//input[@name=\"lastname\"]");
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void EnterLastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);	
	}
	
	public void EnterFirstname(String fname){
		driver.findElement(firstname).sendKeys(fname);
	}
	
	
}
