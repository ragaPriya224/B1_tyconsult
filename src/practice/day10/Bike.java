package practice.day10;

public  class Bike { //  final class cannot be inherited
	public final String name = "bmw";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.printName();
		
	}

	public final void printName() { // method cannot be overriden
//		name = "audi"; // final keyword for variable means, you cannot reassign the values
		System.out.println(name);
	}
	public void stop() {
		System.out.println("bike stopped");
	}

}
