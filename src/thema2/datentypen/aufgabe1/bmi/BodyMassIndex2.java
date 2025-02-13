package thema2.datentypen.aufgabe1.bmi;


import java.util.Scanner;

public class BodyMassIndex2 {

	public static void main(String[] args) {
		
		System.out.println("** Welcome to my BMI Calculator ** ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your weight: ");
		double weight = scanner.nextDouble();
		
		System.out.println("Your height: ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("Your calculated BMI is: " + bmi);
		
		scanner.close();
	}


}

