package practice.day5;

public class MethodDemo {

	public static void main(String[] args) {
//		int output = addNumber();
//		System.out.println(output);
//		System.out.println(addNumber());
		int output = subtractNumber(10,2);
		System.out.println(output);
		
		subtractNumber();
		
//		subtractNumber(5);
	}


	public static int addNumber() {
		System.out.println("hello");
//		int result = 2+3;
//		return result;
		return 2+3;
	}
	
	public static int subtractNumber() {
		return 5-3;
	}
	
	public static int subtractNumber(int num1, int num2) {
		return num1-num2;
	}
	public static void divideNumber() {
		System.out.println("hello");
		System.out.println(10/2);
		int output = 8/4;
		System.out.println(output);
//		int result = 2+3;
//		return result;
		
	}
	
	


}
