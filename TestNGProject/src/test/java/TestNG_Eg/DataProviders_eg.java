package TestNG_Eg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviders_eg {

	@DataProvider(name = "data-provider")
	public Object[][] dataProvMtd(){
		return new Object[][] {{3},{5}};
	}
	
	@DataProvider(name = "multi-DP")
	public Object[][] MultiDPMthd(){
		return new Object[][] {{2,3},{5,10}};
	}
	
	@Test(dataProvider = "data-provider" )
	public void sampletest(int val) {
		System.out.println(val);
		System.out.println(val*val);
	}
	
	@Test(dataProvider = "multi-DP")
	public void sum(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	
}
