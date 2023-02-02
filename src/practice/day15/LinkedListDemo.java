package practice.day15;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList heroList = new LinkedList();
		heroList.add("loki");
		heroList.add("spiderman");
		heroList.add("avengers");
		heroList.add("thor");//ins order maintained
		heroList.add("spiderman");//dup allowed
		System.out.println(heroList);
System.out.println(heroList.getFirst());
heroList.addFirst("black widow"); //try addLast
System.out.println(heroList.getFirst());
System.out.println(heroList.getLast());
System.out.println(heroList);
System.out.println(heroList.removeFirst());
System.out.println(heroList);
System.out.println(heroList.removeLast());
System.out.println(heroList);
//		System.out.println(heroList.last());
//		System.out.println(heroList);
	}

}
