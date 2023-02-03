package practice.day16;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		TreeSet foodSet = new TreeSet();
		foodSet.add("burger");
		foodSet.add("pizza");
		foodSet.add("america");
		foodSet.add("frenchfries");//data stored according to sorting order
		foodSet.add("pizza"); //duplicates is not  allowed
		
		System.out.println(foodSet);
		TreeSet markSet = new TreeSet();
		markSet.add(101);
		markSet.add(107);
		markSet.add(103);
		markSet.add(115);
		markSet.add(104);
		markSet.add(110);
		markSet.add(100);
		System.out.println(markSet);
		
		System.out.println(markSet.first()); //100
		System.out.println(markSet.last()); //115
//		datas less than 104
		System.out.println(markSet.headSet(104)); //100, 101, 103

		//		datas greater than or equal to 104
		System.out.println(markSet.tailSet(104));//104, 107, 110, 115
		
		System.out.println(markSet.subSet(103, 110));//103, 104,107 
		
		//explore the rest of frequent methods
	}

}
