package practice.day11;

public abstract class Mobile {

	public abstract void welcomeText(); //abstract method
	
	public abstract void gamingNotification(); //abstract method
	
	public final void call() { //non abstract method
		System.out.println("calling");
	}
	public void m1() { //non abstract method
		System.out.println("calling");
	}

}

// abstract class -> is an incomplete class 
// cannot create an object for abstract class 
//abstract method na, no method body 
// abstract method should be present inside a abstract class 
// abstract and non abstract method possible
// any number of abstract methods, non abstractmethods  possible