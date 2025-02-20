package thema8.oop.einfacheaufgabe.banksystem;

public class BankProgram {

	public static void main(String[] args) {
		Bank sparkasseBank = new Bank("Sparkasse");
		
		Kunde kundeMax = new Kunde("1234cx", "Max", "Mustermann");
		kundeMax.setAdresse("Mustermannstraße 1");
		Kunde kundeAnna = new Kunde("2893by", "Anna", "Meier");
		
	
		Bankkonto kontoMax = new Bankkonto("123456", 1000, kundeMax);
		Bankkonto kontoAnna = new Bankkonto("654321", 2000, kundeAnna);
		
		
		System.out.println("Ausgaben:");
		sparkasseBank.printBankInfo();
		
		System.out.println("Kundeninformationen:");
		System.out.println(kundeMax);
		System.out.println(kundeAnna);
	}
	
}
