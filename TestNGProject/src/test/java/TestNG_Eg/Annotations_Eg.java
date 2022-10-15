package TestNG_Eg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Annotations_Eg {

	
	@BeforeTest
	public void beforeTst() {
		System.out.println("Before Test");
	}
	
	
	
	@BeforeClass
	public void beforeCls() {
		System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethd() {
		System.out.println("Before Method");
	}
	
	
	@Test
	public void abc() {
		System.out.println("ABC");
	}
	
	@Test
	public void xyz() {
		System.out.println("XYZ");
	}
	
	@AfterMethod
	public void aftrmetd() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void aftrcls() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void aftrTst() {
		System.out.println("After Test");
	}
}
