package Day5;
class outsideclass{
	String studentName ="Tom" ;
	String Rollnum = "55";
	static String schoolName ="public high school";
	
	
}
public class InstanceVariable {
	
	public static void main(String[] args) {
		outsideclass i = new outsideclass();
		System.out.println(i.studentName);
		//System.out.println(i.schoolName);
		System.out.println(outsideclass.schoolName);
	}
}
