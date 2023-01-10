package practice.day6;

public class Phone {

	public String colour;
	public int wheels;
	
//	how to create a constructor?
	
	Phone(){ //default constructor or non parameterized constructor 
		this.colour = "black";
		this.wheels = 4;
		System.out.println(" constructor called");
	}
	
	Phone(String colour, int wheels){
		this.colour = colour;
		this.wheels = 2;
	}
	
	public static void main(String[] args) {

		//object creation 
		Phone iphone= new Phone();  //when object is created, constructor is called
		
		iphone.colour = "blue";

		System.out.println(iphone.colour); //null

		System.out.println(iphone.wheels);  //4

		Phone nokia= new Phone();
		nokia.colour = "pink";
		System.out.println(nokia.colour); 

		System.out.println(nokia.wheels);
		
		
		Phone samsung= new Phone("yellow", 3); //parameterized 
//		samsung.colour = "yellow";
		System.out.println(samsung.colour);
	


		
		
	}



}
//default value for string is null