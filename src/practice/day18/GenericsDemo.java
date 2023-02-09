package practice.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		
	TreeSet<Integer> foodSet = new TreeSet<Integer>();
	foodSet.add(12);
	foodSet.add(22);
	foodSet.add(33);
	System.out.println(foodSet);
	foodSet.add("burger");  //string 
	System.out.println(foodSet);
	HashSet<String> dataSet = new HashSet<String>();
	
	ArrayList<String> foodList = new ArrayList<String>();
	foodList.add("burger");
	foodList.add("pizza");
	foodList.add("frenchfries");//or
	
	
	HashMap<Integer,String> avengersMap = new HashMap<Integer,String>();

	avengersMap.put(1, "hulk"); //add data
	avengersMap.put(2, "spidy");
	avengersMap.put(3, "capamerica");
	avengersMap.put(4, "loki");
	
	
//	int[] foodArray = new int[6];
//	foodArray[2]=5;
//	foodArray[1]=4;
//	foodArray[3]="hello";//string 

	}

}
