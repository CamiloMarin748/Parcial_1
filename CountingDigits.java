package P_recursion;

public class CountingDigits {

	public static void main(String[] args) {
		int digitQ = countingDigits(9, 0);
		System.out.println(digitQ);
		}	

public static int countingDigits(int number, int counter) {
		
		if (number == 0) {
			if (counter == 0) {
				counter = 1;
			}
			return counter;
	
		}
		else {
			return countingDigits (number/10, counter+1);
		}
	}


}
