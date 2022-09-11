package Day4;

public class GarbageCollector_eg {

	public void finalize() {
		System.out.println("Garbage collectr being called");
	}
	
	public static void main(String[] args) {
		
		GarbageCollector_eg g = new GarbageCollector_eg();
		g = null;
		System.gc();
	}
}
