package practice;

public class StringDemo {

	public static void main(String[] args) {
	
//hello
		int mark = 10;
		char alpha= 'n';
		String name = "computer_mouse_keyboard";
		System.out.println(name);
		//string methods.
		System.out.println(name.length()); //print length
		System.out.println(name.toUpperCase()); //to capital letters
		System.out.println(name.toLowerCase()); //to small letter
		System.out.println(name.startsWith("b")); //starts with
        boolean result =name.endsWith("land");
		System.out.println(result);
		
		System.out.println(name.charAt(2)); //find the character
		System.out.println(name.indexOf("l")); //first index
		System.out.println(name.indexOf("a")); //first occurence index
		System.out.println(name.lastIndexOf("d")); //last occurence
		System.out.println(name.concat(" team")); // appends
		
		System.out.println(name.contains("cot")); //something is present or not
		System.out.println(name.isEmpty());
		System.out.println(name.replace("i", "z"));
		System.out.println(name.replaceFirst("i", "z"));
		System.out.println(name.trim()); // white space removed
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 6)); // part of string
//		System.out.println(name.split("_"));
		
	}

}
