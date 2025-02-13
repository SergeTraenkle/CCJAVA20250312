package thema2.datentypen.aufgabe1.bmi;


import utils.IO;

public class BodyMassIndex3 {

	public static void main(String[] args) {
		
		System.out.println("** Welcome to my BMI Calculator ** ");
		
		
//		System.out.println("Your weight: ");
//		double weight = scanner.nextDouble();
		double weight = IO.promptAndReadDouble("Your weight: ");
		
//		System.out.println("Your height: ");
//		double height = scanner.nextDouble();
		double height = IO.promptAndReadDouble("Your weight: ");
		
		double bmi = weight / (height * height);
		System.out.println("Your calculated BMI is: " + bmi);
	}


}

