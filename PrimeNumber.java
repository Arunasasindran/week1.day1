package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int inputNum = 13;
		boolean flag = false;
		int remNum = 0;
		for(int i = 2; i<=6; i++)
		{
			remNum = inputNum % i;
			
			if (remNum == 0)
			{
				flag = true;
				break;
			}
			
		}
		if (flag == true) {
			
			System.out.println(inputNum +" is not a Prime Number");
		}
		else
			System.out.println(inputNum +" is a Prime Number");
		
		
	}

}
