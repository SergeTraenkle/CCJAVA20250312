package thema12.oop.datenstrukturen.banksystem.arraylist;

abstract class Bankkonto {

	protected String kontonummer;
	
	protected double kontostand;
	
	public Bankkonto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}
	
	public abstract void abrechnung();

	public String getKontonummer() {
		return kontonummer;
	}
	
	@Override
	public String toString() {
		return "Bankkonto [kontoNummer=" + kontonummer + ", kontostand=" + kontostand + "]";
	}
	
	
}
