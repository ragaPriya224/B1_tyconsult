package practice.day17;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		//student id and student name
		HashMap avengersMap = new HashMap();

		avengersMap.put("1", "hulk"); //add data
		avengersMap.put("2", "spidy");
		avengersMap.put("3", "capamerica");
		avengersMap.put("1", "loki");

		System.out.println(avengersMap);
		System.out.println(avengersMap.remove(2));
		System.out.println(avengersMap.remove("2"));
		System.out.println(avengersMap);

		//replace a  data
		System.out.println(avengersMap.replace("4", "tonystark"));

		avengersMap.put("5", "thor");
		System.out.println(avengersMap);
		System.out.println(avengersMap.containsKey("44"));
		System.out.println(avengersMap.containsValue("loki"));
		System.out.println(avengersMap.get("5"));
		
		System.out.println(avengersMap.size());
//clear check
		
			System.out.println(avengersMap.putIfAbsent("1", "drstrange"));
			System.out.println(avengersMap);
			//entry 
			System.out.println(avengersMap.put("6", "loki"));
			System.out.println(avengersMap.keySet());
			System.out.println(avengersMap.values());
			System.out.println(avengersMap.entrySet());
			
//			avengersMap.
			
			
			
			

	}

}
