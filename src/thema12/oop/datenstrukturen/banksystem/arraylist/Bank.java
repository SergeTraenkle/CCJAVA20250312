package thema12.oop.datenstrukturen.banksystem.arraylist;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Bankkonto> konten;	// null
	
	public Bank() {
		konten = new ArrayList<Bankkonto>();	// Vermeidung des NullPointerException Fehler
	}
	
	
	public void zeigeAlleKonten() {
		for (Bankkonto bankkonto : konten) {
			System.out.println(bankkonto);
		}
	}
	
	public void kontoEntfernen(String kontonummer) {
		for (int i = 0; i < konten.size(); i++) {
			if(konten.get(i).getKontonummer().equals(kontonummer)) {
				konten.remove(i);
				System.out.println("Konto mit Kontonummer: " + kontonummer + " wurde entfernt.");
				return;
			}
		}
	}
	
	
	public Bankkonto getKonto(String kontonummer) {
		for (Bankkonto bankkonto : konten) {
			if(bankkonto.getKontonummer().equals(kontonummer)) {
				return bankkonto;
			}
		}
		
		return null;
	}
	
	public void kontoHinzufuegen(Bankkonto konto) {
		konten.add(konto);
		System.out.println("Konto hinzugefügt: " + konto);
	}
	
}
