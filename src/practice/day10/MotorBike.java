package practice.day10;

public class MotorBike extends Bike{ //bike is parent, motorbike is child

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MotorBike mb = new MotorBike();
mb.printName();
	}
	
	public void printName() { //overriding
		System.out.println("welcome to coding world");
	}
	
	@Override
	public void stop() {
		System.out.println("motorbike  stopped");
		
	}
}
