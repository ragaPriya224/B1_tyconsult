package practice.day16;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("burger");
		foodSet.add("pizza");
		foodSet.add("frenchfries");//order IS  maintained
		foodSet.add("pizza"); //duplicates is not  allowed
		
		System.out.println(foodSet);
//		
//		foodSet.add(123); 
//		foodSet.add(false); //heterogenous data allowed
//		foodSet.add(null); //null insertion possible
//		foodSet.add("briyani");
//		System.out.println(foodSet);
		
		//explore the rest of frequent methods
	}

}
