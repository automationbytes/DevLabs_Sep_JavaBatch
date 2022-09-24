package Day3;

public class Con_Eg {
	
	int a;
	
	
	public Con_Eg() {
		System.out.println("Constructor calling");
	}
	
	void name() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Con_Eg c = new Con_Eg();
		Con_Eg c2 = new Con_Eg();

		Con_Eg c1 = null;
		//c1 = new Con_Eg();
		//System.out.println("Hello");
		c1.name();
	}
}
