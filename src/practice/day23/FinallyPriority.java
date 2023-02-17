package day23;


public class FinallyPriority{

	public static void main(String[] args) {
		System.out.println(m1());

	}
	public static int m1() {

		try {
			return 777;
		}catch(NullPointerException e) {
			return 888;
		}
		finally {
			return 999;
		}
		
		
//		finally or return? 
	}
}
