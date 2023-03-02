package tyconsult22.java.DAY28;

public class StringDemo3 {

	public static void main(String[] args) {
//		String s1 = new String("D");
//		String s2 = new String("D");
//		String s3= "D";
//		String s4= "D";
		
		String s1 = new String("D");
		s1.concat("s");
		String s2 = s1.concat("solutions");
		s1 = s1.concat("lang");
		System.out.println(s1);
		System.out.println(s2);
	}

}
