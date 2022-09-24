package Day3;

public class OOPS {
	String std1;
	String std2;
	int age;
	
	
	OOPS(String std, int age){
		this.std1 = std;
		this.age = age;
	}
	
	OOPS(){
	
	}
	void toStudy() {
		System.out.println(this.std1 + this.std2);
	}
	
	public static void main(String[] args) {
		
		OOPS st1 = new OOPS("a",5);
		st1.toStudy();
		OOPS st = new OOPS();
		
		
		
	}
}
