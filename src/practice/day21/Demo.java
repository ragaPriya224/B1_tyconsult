package day21;

import java.io.PrintWriter;

public class Demo{
	
	public static void main(String[] args) {
int []marks = new int[5];
marks[1]= 22;
marks[2]=44;
marks[11]= 22;
		
		//unchecked exception
//		System.out.println("hello");
//		int result = 10/0;
//		System.out.println("bye");
		
		//checked exception
		PrintWriter pw = new PrintWriter("/abc.txt");
	}
}

//try {
//	//read file from remote location
//} catch(FileNotFoundException e) {
//	//use localfile 
//}