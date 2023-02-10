package day20;

public class InstanceFlow {
    int i = 10;   //3 //9
    
    {  //4
        m1(); //10
        System.out.println("first block"); //12
    }

    InstanceFlow() {  //5
        System.out.println("CONSTRUCTOR"); //15
    }

    public static void main(String[] args) {//1
        InstanceFlow i = new InstanceFlow(); //2
        System.out.println("main method");  //16
        InstanceFlow i2 = new InstanceFlow(); //17
    }
    static {//2 
		m1();//8
		System.out.println("1st static block"); //10
	}
    public void m1() {    //6
        System.out.println(j); //11
    }

    {  //7
        System.out.println("second block"); //13
    }
    int j = 20; //8 //14
}
//normally static flow only once, but instance flow, based on number of object creation.
//a. static flow will happen [1,2]
//instance flow starts
///	1. identify the instance members from top to bottom3-8
//		2. execution of instance variable assignments and
//				instance blocks from top to bottom 9-14
//		3. constructor  execution

//output:
//0
//firstblock
//second block
//CONSTRUCTOR
//main method
//AGAIN repeated


//instance flow starts
///	1. identify the instance members from top to bottom3-8
//		2. execution of instance variable assignments and
//				instance blocks from top to bottom 9-14
//		3. constructor  execution