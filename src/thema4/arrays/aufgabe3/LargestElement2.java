package thema4.arrays.aufgabe3;

/**
 * Suchen von Array-Elementen
 * Teil 2) Finde die Index für das größte Element.
 */
public class LargestElement2 {

	public static void main(String[] args) {
		int [] numbers = {5, 12, 7, 19, 12, 170};
		int largestElementIndex = findLargestElementIndex(numbers);	// Teil 2
		
		System.out.println("The index of the largest element is: " 
		+ largestElementIndex);
	}
	
	private static int findLargestElementIndex(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}		
		return maxIndex;
	}
}
