package P_recursion;

public class Prime {

	public static void main(String[] args) {
		
		boolean prime = testPrime(5,2);
		System.out.println(prime);
	
	}


public static boolean testPrime(int dividend, int divisor) {
		
		if (divisor  > dividend/2) {
			return true;	
		}
		
		else {
			if (dividend % divisor == 0) {
				return false; 
				
			}
			else {
				
				return testPrime(dividend, divisor +1);
			}

		}
	}
	
	
	
}// end
