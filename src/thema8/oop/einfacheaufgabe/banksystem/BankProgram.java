package thema8.oop.einfacheaufgabe.banksystem;

public class BankProgram {

	public static void main(String[] args) {
		Bank sparkasseBank = new Bank("Sparkasse");
		
		Kunde kundeMax = new Kunde("K001", "Max", "Mustermann");
		kundeMax.setAdresse("Mustermannstraße 1");
		Kunde kundeAnna = new Kunde("K002", "Anna", "Meier");
		kundeAnna.setAdresse("Meierweg 2");
		
	
		Bankkonto kontoMax = new Bankkonto("123456", 1000, kundeMax);
		Bankkonto kontoAnna = new Bankkonto("654321", 2000, kundeAnna);
		
		
		System.out.println("Ausgaben:");
		sparkasseBank.printBankInfo();
		
		System.out.println("Kundeninformationen:");
		System.out.println(kundeMax);
		System.out.println(kundeAnna);
		
		System.out.println("Aktieninformationen:");
		Aktie aktie1 = new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
		System.out.println(aktie1);
		System.out.println(aktie2);
		
		// Aufgabe 3
		Darlehensvertrag darlehen = new Darlehensvertrag(
				"D001", kundeMax, 10000.0, 5.0, 12);
		System.out.println(darlehen);
		System.out.println(
			String.format("Monatliche Rate: %.2f EURO", 
					darlehen.berechneMonatlicheRate()));
	}
	
}
