package thema2.datentypen.aufgabe1.bmi;

public class BodyMassIndex1 {

	public static void main(String[] args) {
		System.out.println("** Welcome to my BMI Calculator ** ");
		
		double weight = 80.5;
		double height = 1.75;
		
		double bmi = weight / (height * height);
		System.out.println("BMI is: " + bmi);
	}
}
