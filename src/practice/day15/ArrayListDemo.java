package practice.day15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Arraylist object creation.
		ArrayList foodList = new ArrayList();
		foodList.add("burger");
		foodList.add("pizza");
		foodList.add("frenchfries");//order s also maintained
		foodList.add("pizza"); //duplicates are allowed
		foodList.add(123); 
		foodList.add(false); //heterogenous data allowed
		foodList.add(null); //null insertion possible
		foodList.add("briyani");
		System.out.println(foodList);
		foodList.remove("briyani");
		System.out.println(foodList); //briyani is removed
		System.out.println(foodList.contains("cheese"));
		System.out.println(foodList.isEmpty());
		System.out.println(foodList.size());
		foodList.add(2,"dosa"); //add data based on index
		System.out.println(foodList);
		foodList.remove(0);
		System.out.println(foodList);
		System.out.println(foodList.get(3));
		System.out.println(foodList);
		System.out.println(foodList.set(1, "noodles"));
		//set noodles data in the first index
//		i.e., dosa replaced by noodles
		System.out.println(foodList);
		
		ArrayList drinkList = new ArrayList();
		drinkList.add("coffee");
		drinkList.add("boost");
		drinkList.add("milo");
		drinkList.add("horlicks"); //4data
		System.out.println(drinkList);
		
//		foodList.add("coffee");
//		foodList.add("boost");
//		foodList.add("milo");
//		foodList.add("horlicks");
		
//		foodList.addAll(drinkList);
		foodList.addAll(1, drinkList);
		System.out.println(foodList);
//		explore containsall, sublist 
	}

}
