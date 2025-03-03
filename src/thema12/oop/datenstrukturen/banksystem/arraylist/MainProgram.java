package thema12.oop.datenstrukturen.banksystem.arraylist;

import java.util.Random;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {
			String kontonummer = String.valueOf(1000 + random.nextInt(9000));
			double betrag = 1000 + random.nextInt(9000);
			if(random.nextBoolean()) {
				bank.kontoHinzufuegen(new SparKonto(kontonummer, betrag));
			} else {
				bank.kontoHinzufuegen(new GiroKonto(kontonummer, betrag, 500));
			}
		}
		
        int option;
        do {
            System.out.println("\n1. Konto hinzufügen");
            System.out.println("2. Konto anzeigen");
            System.out.println("3. Alle Konten anzeigen");
            System.out.println("4. Konto löschen");
            System.out.println("5. Beenden");
            System.out.print("Wählen Sie eine Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Kontonummer: ");
                    String kn = scanner.next();
                    System.out.print("Betrag: ");
                    double betrag = scanner.nextDouble();
                    bank.kontoHinzufuegen(new SparKonto(kn, betrag));
                    break;
                case 2:
                    System.out.print("Kontonummer: ");
                    kn = scanner.next();
                    Bankkonto konto = bank.getKonto(kn);
                    if (konto != null) {
                        System.out.println(konto);
                    } else {
                        System.out.println("Konto nicht gefunden.");
                    }
                    break;
                case 3:
                    bank.zeigeAlleKonten();
                    break;
                case 4:
                    System.out.print("Kontonummer: ");
                    kn = scanner.next();
                    bank.kontoEntfernen(kn);
                    break;
                case 5:
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Option.");
            }
        } while (option != 5);

        scanner.close();
	}
}
