package thema4.arrays.aufgabe3;

/**
 * Aufgabe 3.1
 */
public class ArraySum {

	public static void main(String[] args) {

		int [] numbers = {3, 7 , 2, 8, 1};
		printArraySum(numbers);
		
		int [] numbers2 = {33, 22, 1, 100, 15};
		printArraySum(numbers2);
	}
	
	private static int sumArrayElements(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	private static void printArraySum(int[] numbers) {
		System.out.println("Sum is: " + sumArrayElements(numbers));
	}

}
