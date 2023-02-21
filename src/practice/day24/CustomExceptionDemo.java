package day24;

public class CustomExceptionDemo {

	public static void checkSalary(int salary) throws CheckedException{  
		int amount=0;
		if(salary>10000) {
			//raise Exception
			throw new CheckedException();
		}else{
			amount=salary+5000;
			System.out.println("Ur total salary is:"+amount);
		}
	}
	public static void main(String[] args) {
		try {
			checkSalary(50000000);
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
