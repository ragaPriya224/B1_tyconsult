package practice.day11;

public class Samsung extends Mobile{ 
	// inheriting abstract class na, 
//		inherited abstract method should be implemented

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung samsung = new Samsung();
		samsung.call();
	}

	@Override
	public void welcomeText() {
		System.out.println("welcome samsung user");

	}

	@Override
	public void gamingNotification() {
		
	}
	
//	@Override
//	public void call() {
//		System.out.println("calling from samsung");
//	}

}
