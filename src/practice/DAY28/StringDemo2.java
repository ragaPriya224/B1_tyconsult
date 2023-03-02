package tyconsult22.java.DAY28;

public class StringDemo2 {

	public static void main(String[] args) {


StringBuffer s = new StringBuffer("hello");
s.append("world");
System.out.println(s);//helloworld

StringBuffer s1 = new StringBuffer("D");
StringBuffer s2 = new StringBuffer("D");
System.out.println(s1 == s2); //false
System.out.println(s1.equals(s2)); //false 
//.equals method is not overrided here. 


StringBuilder s3 = new StringBuilder("D");
StringBuilder s4 = new StringBuilder("D");
System.out.println(s3 == s4); //false
System.out.println(s3.equals(s4)); //false 


String s5 = new String("java");
String s6 = "java";
	}

}
