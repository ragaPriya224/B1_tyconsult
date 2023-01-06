package practice;

public class SwitchDemo {

	public static void main(String[] args) {
		int day = 3;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		  case 3:
		    System.out.println("weekday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			 System.out.println("try again");
			 break;
		}

	}
//fail safe mechanism
}
