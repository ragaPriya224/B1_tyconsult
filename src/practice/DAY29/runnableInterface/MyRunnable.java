package tyconsult22.java.DAY29.runnableInterface;

public class MyRunnable implements Runnable{ //defining thread


	public void run() { //overriding the run method
		for(int i = 0; i<10;i++) {   //job of thread
			System.out.println("child thread" + Thread.currentThread().getName());
		}
	}
	
	
}
