package practice.day7;

public class Child extends Parent{
	
	// Child is the child
	//Parent is the parent
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c= new Child ();
		c.sleep();
		c.eat();

	}
	
	public void sleep() {
		System.out.println("sleeping");
		
	}
}
