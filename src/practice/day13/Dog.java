package practice.day13;

public class Dog extends Animal{ 
	public String name="puppy";
	@Override
	public void sound() {
		System.out.println("bow bow");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.print();
	}

	public void print() {
//		sound();
		super.sound();
		System.out.println(name);
		System.out.println("parent name" +super.name);
	}
}