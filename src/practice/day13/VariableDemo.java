package practice.day13;

public class VariableDemo {
	int price ; //instance variable 
	static String name ="abc";
	
	public static void main(String[] args) {
//		name ="xyz";
//		System.out.println(name);
//		calculate();
		VariableDemo d = new VariableDemo();
		d.print();
//		d.display();
	}
	public static void calculate() {
		System.out.println(name);
	}
	public void print() {
		int age = 20; //age is a local variable
		System.out.println(age);
		
		System.out.println(price);
		price = 40;
		System.out.println(price);
	}
	public void display() {
		//		System.out.println(age);
		System.out.println("display" + price);
	}
	//	public void sum(int a, int b) {
	//		System.out.println(a+b);
	//	}
	//	public void divide(int a, int b) {
	//		System.out.println(a/b);
	//	}

}
