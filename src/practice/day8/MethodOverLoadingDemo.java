package practice.day8;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sum(10.0d); //method calling
//		sum(5,6);
//		sum(5,'a');
		sum(10.5f);
	}
	
	
	public static void sum(long a) {
		System.out.println("hello");
		System.out.println(a);
	}
	
	public static void sum(int a,int b) {
		System.out.println("good morning");
		System.out.println(a);
	}
	public static void sum(int a,char b) {
		System.out.println("pizza");
		System.out.println(a);
	}
	public static void sum(double a) {
		System.out.println("bye");
		System.out.println(a);
	}

}
