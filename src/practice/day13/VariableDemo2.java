package practice.day13;

public class VariableDemo2 {
	int price ; //instance variable 
	static String name = "abc"; //static variable
	
	public static void main(String[] args) {
		name = "xyz";
		VariableDemo2 d = new VariableDemo2();
		d.print();
		VariableDemo2 d2 = new VariableDemo2();
		d2.print();
		
		System.out.println("in main" +name);
	}
	
	public void print() {
//		System.out.println("first" +price);
//		price = 40;
//		System.out.println(price);
		System.out.println("in method" +VariableDemo2.name);
	}
	public void display() {
		//		System.out.println(age);
		System.out.println("display" + price);
	}
	
	

}
