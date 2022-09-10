package Day3;

public class init_Blocks {
	{
		System.out.println("Init block 1");
	}
	
	public init_Blocks() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Init block 2");
	}
	
	
	public static void main(String[] args) {
		init_Blocks i = new init_Blocks();
	
		System.out.println("Main");
	}
}
