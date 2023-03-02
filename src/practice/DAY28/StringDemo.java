package tyconsult22.java.DAY28;

public class StringDemo {

	public static void main(String[] args) {
String s1 = new String("D");
String s2 = new String("D");
System.out.println(s2);


System.out.println(s1 == s2); //comparing //false bcoz 2 new objects
//== is used as a reference comparison or address comparison

System.out.println(s1.equals(s2)); //content comparison // true

String s = new String("java");
s.concat("language");
System.out.println(s);


	}

}
