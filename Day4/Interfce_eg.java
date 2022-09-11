package Day4;

interface mobile{

	void sms();
	void call();
	
	default void msg() {
		System.out.println("Default");
	}

	static void display() {
		System.out.println("Static");
	}
}

interface camera{
	void cameraapp();
}

class apple implements mobile,camera{
	public void sms() {
		System.out.println("apple sms");
	}

	public void call() {
		System.out.println("apple call");
	}

	@Override
	public void cameraapp() {
		// TODO Auto-generated method stub
		
	}

}
class samsung implements mobile{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Samsung sms");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Samsung call");
	}

}


public class Interfce_eg {
	public static void main(String[] args) {
		samsung s = new samsung();
		s.sms();
		s.call();
		
		mobile m = new samsung();
		m.msg();
		mobile.display();
	}
}
