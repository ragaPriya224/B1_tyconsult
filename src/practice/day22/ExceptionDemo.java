package day22;


public class ExceptionDemo{
	
	public static void main(String[] args) {
try
System.out.println("hello");
		catch(Exception e) {
			
		}
		
		
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
		catch(ArithmeticException e ){
//			
			a.toUpperCase();
			System.out.println("welcome");//will not be printed
		}
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
