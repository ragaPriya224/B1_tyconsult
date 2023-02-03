package practice.day16;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//Arraylist object creation.
		HashSet foodSet = new HashSet();
		foodSet.add("burger");
		foodSet.add("pizza");
		foodSet.add("frenchfries");//order s NOT also maintained
		foodSet.add("pizza"); //duplicates is not  allowed
		
		System.out.println(foodSet);
//		
		foodSet.add(123); 
		foodSet.add(false); //heterogenous data allowed
		foodSet.add(null); //null insertion possible
		foodSet.add("briyani");
		System.out.println(foodSet);
		
		//explore the rest of frequent methods
	}

}
