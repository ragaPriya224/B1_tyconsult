package tyconsult22.java.DAY30;
//convert primitive data types into objects
public class Wrapper {

	public static void main(String[] args) { // main thread
		int a = 20;
		//primitive to wrapper = autoboxing 
		Integer b = Integer.valueOf(a);
		
		
		//unboxing-> reverse of autoboxing i.e., wrapper to primitive
		
		
		Integer x = 3;
		int y = x.intValue();
		
//		-------------------------
		
		String name = "dev";
		name.concat("world");
	}
	void display() {
		
	}

}
