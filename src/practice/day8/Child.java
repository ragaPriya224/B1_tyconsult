package practice.day8;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.wealth(); 
		c.marry();
	}
	public void marry(){ //overrided method
		System.out.println("hello team, y ");
	}
	

}
