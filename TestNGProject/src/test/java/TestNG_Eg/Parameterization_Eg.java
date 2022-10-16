package TestNG_Eg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Eg {

	
	@Test
	@Parameters({"a","b"})
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	

	
	@Test
	@Parameters({"a","b"})
	public void diff(int a, int b) {
		System.out.println(a-b);
	}

	
	
	@Test
	@Parameters({"a","b"})
	public void mul(int a, int b) {
		System.out.println(a*b);
	}

	
	
	@Test
	@Parameters({"a","b"})
	public void div(int a, int b) {
		System.out.println(a/b);
	}

}
