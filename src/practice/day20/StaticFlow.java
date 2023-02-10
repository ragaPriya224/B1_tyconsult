package day20;


public class StaticFlow{
	static int i = 10; //1 //7
	
	static {//2 
		m1();//8
		System.out.println("1st static block"); //10
	}
	public static void main(String[] args) { //3
		m1();//13
		System.out.println("hellow");//15
	}
	public static void m1(){ //4
		System.out.println(j); //9 //14
	}
	static { //5
		System.out.println("2nd static block"); //11
	}
	static int j = 20; //6 //12
	
}
//output:
//	0
//1st static block
//2nd static block"
//20
//hellow

//static flow:
	
//	1. identify the static members from top to bottom[1-6]
//	2. execution of static variable assignments and static blocks from top to bottom[7-12]
//	3. main method execution