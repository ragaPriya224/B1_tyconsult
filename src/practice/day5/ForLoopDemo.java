package practice.day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		//		for(initialization; condition; increment/decrement){    
		//			//statement or code to be executed    
		//		}    

		for(int i = 1; i < 6; i++){
			if(i == 3) {
				System.out.println("the value is 3");
				//				break;
//				continue;
			}
			System.out.println(i);  
		}    
		//break -> come out of the loop
		//continue -> skip that particular iteration

	}

}
