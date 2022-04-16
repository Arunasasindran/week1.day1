package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// initialize the int variables
		
		int fstNum = 0;
		int secNum = 1;		
		int range = 6;	
		int sumNum = 0;
		
		//print first and second number
		
		System.out.println(fstNum);
		System.out.println(secNum);
		
		//
		for (int i=1; i<=range; i++) {
			
			sumNum = fstNum + secNum; 
			fstNum = secNum;
			secNum= sumNum;
			System.out.println(sumNum);
			
			
		}

	}

}
