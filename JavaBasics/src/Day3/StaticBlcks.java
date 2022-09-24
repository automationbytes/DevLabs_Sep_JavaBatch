package Day3;

public class StaticBlcks {


	static int i = 10;
	static
	{
		System.out.println(i);
		System.out.println("static block 1");
	}

	public StaticBlcks() {
		i = i + 5;
		System.out.println(i);
	}

	{
		i = i + 9;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		StaticBlcks s = new StaticBlcks();
		StaticBlcks s1 = new StaticBlcks();
		System.out.println(s.i);
		System.out.println(s1.i);
	}
}
