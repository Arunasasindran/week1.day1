package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
	
		int inputNum = 5;
		int fact = 1;
		
		for (int i = 1; i<= inputNum; i++) {
			
			fact = fact * i;
			
		
		}
		System.out.println(fact);
	}

}
