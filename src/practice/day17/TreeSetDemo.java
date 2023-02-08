package practice.day17;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet foodSet = new TreeSet();
		foodSet.add("burger");
		foodSet.add("pizza");
		foodSet.add("america");
		foodSet.add("frenchfries");//data stored according to sorting order
		foodSet.add("pizza"); //duplicates is not  allowed
//		foodSet.add(134);//cannot add hetero elements
		
		foodSet.add(null); // cannot add null
		System.out.println(foodSet);
		
	}

}
