package practice.day6;

public class Dog {

	public String colour = "blue";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog pet = new Dog(); //object creation 

		System.out.println(pet.colour);
		pet.printName("dalmation");
		
		Dog puppy = new Dog();
		puppy.printName("husky");
	}

	public  void printName(String name) {
		System.out.println(name);
	}

}
