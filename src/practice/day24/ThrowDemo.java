package day24;

import java.io.IOException;


public class ThrowDemo{

	public static void main(String[] args) throws ArithmeticException, IOException  {
	
//			int result = 10/0;
			System.out.println("hello");//s1
			
			ThrowDemo obj = new ThrowDemo();//creating object
			obj.m1();
			System.out.println("bye");
	}
	void m1() throws ArithmeticException, IOException {
		calculate();
	}
	void calculate() throws ArithmeticException, IOException {
		int age = 40;
		if(age < 18) {
			throw new ArithmeticException("exception occured");
		}
		if(age > 18) {
			throw new IOException("io exception");
		}
	}
	void divide() throws  NullPointerException{
		int age = 10;
		if(age < 18) {
			throw new NullPointerException("id is wrong");
		}
	
	}
}
