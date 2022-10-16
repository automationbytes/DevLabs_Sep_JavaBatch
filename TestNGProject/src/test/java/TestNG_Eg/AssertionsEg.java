package TestNG_Eg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsEg {

	@Test
	public void Assert_Eq() {
		
		String a = "Hello";
		String b = "World";
	//	Assert.assertEquals(a, b);
		
		SoftAssert sa = new SoftAssert();
		Assert.assertEquals(a, b);
		
		
		System.out.println("Hello");
		//Assert.assertTrue(a.equals(b));
		
	}
	
	
}

