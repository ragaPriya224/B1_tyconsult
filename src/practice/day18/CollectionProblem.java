package practice.day18;

import java.util.HashMap;

//find count of each character
public class CollectionProblem {

	public static void main(String[] args) {
//i got the data 
		String  name = "ganapathi";
		
//		s -> 0
		
		
//		for(int i = 0 ;i<name.length();i++) {
//			name
//		}
		
		HashMap<Character,Integer> characterMap = new HashMap<Character,Integer>();
		System.out.println(characterMap.size()); //0 
		
		char[] nameArray = name.toCharArray();
		System.out.println(nameArray);
		for(int i = 0;i<=nameArray.length-1;i++) {
			if(characterMap.containsKey(nameArray[i])){// key is already present means
//			     increment by1
				characterMap.put(nameArray[i],characterMap.get(nameArray[i])+1 );
			} 
			characterMap.putIfAbsent(nameArray[i], 1);
//			else {//key is not there
//				//add the data 
//				// there is a key - s, value is 1
//				
//			} 
	}
		System.out.println(characterMap);
}	
}
//	key - s - char
//	value - count - Integer
// s  1
//	h 1 +1
// a 1 +1
//n 1
//m 1
//t 1
//i 1
	

