package P_recursion;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int arr []= {4,7,9};
		int greatest = greatestNumber(arr, 0, arr[0]);
		System.out.println(greatest);
}	

public static int greatestNumber(int array[], int position, int comparator) {
		
		if (position==array.length) {
			return comparator;
		}
		else {
			if(array[position] > comparator) {
				comparator = array [position];
			}
			return greatestNumber(array, position+1 , comparator);
		}

	}

}
