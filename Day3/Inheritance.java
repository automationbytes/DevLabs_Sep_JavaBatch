package Day3;

class Animal{
	int x = 5;
	void eat() {
		System.out.println("Animal eat method");
	}

	void sleep() {
		System.out.println("Animal sleep method");
	}
}

class dog extends Animal{

	void bark() {
		System.out.println("Bark method of dog");
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("Method of cat");
	}
}


public class Inheritance {
	public static void main(String[] args) {	
		
		dog d = new dog();
		d.eat();
		
		cat c = new cat();
		c.eat();
	}
}
