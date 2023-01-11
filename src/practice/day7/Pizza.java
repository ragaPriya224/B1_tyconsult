package practice.day7;

public class Pizza {
	public String thickness;
	
	Pizza(){ //no args -> good coding standard
		
	}
	
	Pizza(String thickness){ // parameterized constructor
		this.thickness = thickness;
	}
	public static void main(String[] args) {

		Pizza myPizza = new Pizza();
//		Pizza-> class name
//		myPizza -> object
//		new -> keyword
//		Pizza() -> constructor
		
	}
	
	// if u don't create any constructor, automatically default constructor implicitly created for you.
	
	// if u create any constructor, then default constructor will not be created for you
	
	//
}
