package Day6;

public class ExtractingNumbers {
	public static void main(String[] args) {
		String str = "abc789nac123";
		//D - numbers
		//d - chars
		//[^0-9]
		//[0-9]
		
		
		//String number = str.replaceAll("[^0-9]", "");
		String number = str.replaceAll("\\d", "");
	
		
		System.out.println(number);
		String cha = "";
		char[] arr = str.toCharArray();
		for(char a : arr) {
			if(!Character.isAlphabetic(a)) {
				System.out.println(a);
			}
			else {
				cha = a + cha;
			}
		}
		System.out.println(cha);
		System.out.println();
	}
}
