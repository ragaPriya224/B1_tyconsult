package tyconsult22.java.DAY29.runnableInterface;

public class ThreadDemo {

	public static void main(String[] args) { // main thread
		MyRunnable r = new MyRunnable(); //creating myrunnable object
		Thread t1 = new Thread(r); //target is runnable
		t1.start(); //starting my thread
//start method internally calls the run method
		for(int i = 0; i<10;i++) {  
			System.out.println("main thread"+ Thread.currentThread().getName());
		}

	}

}
