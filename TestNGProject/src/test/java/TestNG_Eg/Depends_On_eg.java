package TestNG_Eg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On_eg {

	@Test
	public void signin() {
		Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods = {"signin"} )
	public void homepage() {
		System.out.println("Hello");
	}
}
