package tyconsult22.java.DAY29;

public class MyThread extends Thread{ //defining thread


	public void run() { //overriding the run method
		for(int i = 0; i<10;i++) {   //job of thread
			System.out.println("child thread" + Thread.currentThread().getName());
		}
	}
	
	public void run(int j) { //overriding the run method
		System.out.println("overloaded run ");
	}
	
}
