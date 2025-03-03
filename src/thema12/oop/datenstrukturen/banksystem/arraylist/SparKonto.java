package thema12.oop.datenstrukturen.banksystem.arraylist;

public class SparKonto extends Bankkonto {

	private double zinssatz = 0.02;
	
	public SparKonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}
	
	@Override
	public void abrechnung() {
		this.kontostand += kontostand * zinssatz;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Zinssatz: " + this.zinssatz;
	}
}
