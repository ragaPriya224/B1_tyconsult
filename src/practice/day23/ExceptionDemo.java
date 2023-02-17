package day23;


public class ExceptionDemo{

	public static void main(String[] args) {

		
		try {
			System.out.println("s1");//s1
			int result = 10/0;
			System.out.println("s3");//s1
		}catch(NullPointerException e) {
			System.out.println("s4");
		}
		System.out.println("s5");
		
		
		
		
		
		
		
		
		
		
		
		//unchecked exception
		//		System.out.println("hello");
		//		int result = 10/0;
		//		System.out.println("bye");



		//		System.out.println("hello");
		//		try {
		//			
		//			int result = 10/5;
		//			System.out.println("welcome");//will not be printed
		//		}catch(Exception e) {
		//			//alternate code 
		//			System.out.println("exception catched, try some other" );
		//		}finally {
		//			//whatever code is in this block , will definitely get executed 
		//			// close the resources
		//			System.out.println("finally block");
		//		}
		//		
		//		System.out.println("bye");
		String a = null;
		

		//		}catch(NullPointerException e) { //parent
		//			//alternate code 
		//			System.out.println("exception catched, try some other" );
		//		}catch(NullPointerException e) { //child
		//			//alternate code 
		//			System.out.println("null pointer happened" );
		//		}
		//		System.out.println("bye");
	}
}
