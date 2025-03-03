package thema12.oop.datenstrukturen.banksystem.arraylist;

public class GiroKonto extends Bankkonto {

	private double dispoLimit;

	
	public GiroKonto(String kontonummer, double kontostand, double dispoLimit) {
		
		super(kontonummer, kontostand);
		this.dispoLimit = dispoLimit;
	}


	@Override
	public String toString() {
		return super.toString() + ", DispoLimit: " + this.dispoLimit;
	}


	@Override
	public void abrechnung() {
		if(kontostand < 0) {
			kontostand -= 10;
		}
	}
}
