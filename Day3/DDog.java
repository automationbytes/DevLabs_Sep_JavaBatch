package Day3;

public class DDog extends aanimal{
	
	DDog(){
		super();
		
	}
	
	
	void eat() {
		System.out.println(super.name);
		super.eat();
	//	System.out.println("Dog eat method");
	}

	
public static void main(String[] args) {
	DDog d = new DDog();
	d.eat();
	
	
}
}
