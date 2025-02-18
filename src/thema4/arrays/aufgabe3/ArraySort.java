package thema4.arrays.aufgabe3;

import java.util.Arrays;

/**
 * Aufgabe 3.2 ArraySort für zwei Arrays der Länge 20
 */
public class ArraySort {

	public static void main(String[] args) {
		
		int arrayLength = 20;
		int[] eventNumbers = new int[arrayLength];			// Array mit zufälligen geraden Zahlen 
		int[] ascendingNumbers = new int[arrayLength];		// Array zum Sortieren
		
		
		for (int i = 0; i < eventNumbers.length; i++) {
			eventNumbers[i] = (int) (Math.random() * 50) * 2;
		}
		
		System.out.println("Ascending elements before sorting:");
		for (int i = 0; i < eventNumbers.length; i++) {
			ascendingNumbers[i] = (int) (Math.random() * 100);
		}
		printArrayElements(ascendingNumbers);
		
		
		Arrays.sort(ascendingNumbers);
		
		System.out.println("\nAscending elements after sorting:");
		printArrayElements(ascendingNumbers);
	}
	
	private static void printArrayElements(int[] numbers) {
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}
}
