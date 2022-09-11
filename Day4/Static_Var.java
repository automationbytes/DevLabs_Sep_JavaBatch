package Day4;

public class Static_Var {
//used to refer common properties
	//school name for all student
	//gets memory when class is loaded (only one time)
	
	static String collegename = "Dev Labs";
	
	public static void main(String[] args) {
		Static_Var s = new Static_Var();
		System.out.println(Static_Var.collegename);
		
		
	}
}
