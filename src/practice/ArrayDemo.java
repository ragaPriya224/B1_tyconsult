package practice;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		type []var-name = new type [size];
		int []marks = new int [8]; //array 
		marks[1] = 80;
		marks[0] = 90;
		marks[2] = 60;
		marks[3] = 70;
		marks[4] = 50;
		//		marks[12] = 20;
		System.out.println(marks);//address
		System.out.println(marks[3]); //retrieve get values 	
		System.out.println(marks.length); // to get size of array
		
		// can't change size, once created
		// datatype must be uni
		
		
		//		int subject1 = 80,subject2 = 90,subject3 = 60;
		//		int subject4 = 90;
		//		int subject5 = 40;
		//		subject = 40;
	}

}

