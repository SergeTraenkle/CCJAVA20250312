package thema6.oop.warmups.banksystem;

public class Konto {

	private int kontoNummer;
	
	private double kontoStand;
	
	public void einzahlen(double betrag) {
		kontoStand += betrag;
	}
}
