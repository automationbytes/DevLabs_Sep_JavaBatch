package Day3;

abstract class bank{
	void roi() {
		System.out.println("roi");
	}
	bank(){
		System.out.println("Abstract const");
	}
	
	static void hello() {
		System.out.println("static");
	}
	
	void sample() {
		System.out.println("hello");
	}
}

class citi extends bank{
	void roi() {
		System.out.println("15%");
	}
}

class yes extends bank{
	void roi() {
		System.out.println("12%");
	}
}


public class Rate_Bank {
public static void main(String[] args) {
	citi c = new citi();
	c.roi();
	citi.hello();
}
}
