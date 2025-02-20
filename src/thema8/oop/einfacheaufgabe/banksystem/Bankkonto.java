package thema8.oop.einfacheaufgabe.banksystem;

public class Bankkonto {
	
	private String kontoNummer;
	
	private double kontoStand;
	
	private Kunde kontoInhaber;

	
	public Bankkonto(String kontoNummer, double kontoStand, Kunde kontoInhaber) {
		this.kontoNummer = kontoNummer;
		this.kontoStand = kontoStand;
		this.kontoInhaber = kontoInhaber;
	}

	public void einzahlen(double betrag) {
		kontoStand += betrag;
	}
	
	public void abheben(double betrag) {
		if(betrag <= kontoStand) {
			kontoStand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}
	}
	
	@Override
	public String toString() {
		return "Bankkonto [kontoNummer=" 
				+ kontoNummer 
				+ ", kontoStand=" 
				+ kontoStand 
				+ ", kontoInhaber=" 
				+ kontoInhaber
				+ "]";
	}
}
