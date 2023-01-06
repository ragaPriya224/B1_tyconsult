package practice;

public class IfDemo {

	public static void main(String[] args) {
	
		int money = 10;
		int pen = 50;
		int pencil = 25;
		int colorPen = 10;
		
		if(money > pen) {
			System.out.println(" i can buy pen ");
		}else if(money > pencil) {
			System.out.println(" i can buy pencil ");
		}else if(money > pencil) {
			System.out.println(" i can buy pencil ");
		}else { //optional
			System.out.println("go home  ");
		}
		
	
	}

}
