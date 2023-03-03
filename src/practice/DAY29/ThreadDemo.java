package tyconsult22.java.DAY29;

public class ThreadDemo {

	public static void main(String[] args) { // main thread
		MyThread t = new MyThread(); //thread instantion
		t.start(); //starting my thread
//start method internally calls the run method
		for(int i = 0; i<10;i++) {  
			System.out.println("main thread"+ Thread.currentThread().getName());
		}

	}

}
