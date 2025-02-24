package thema8.oop.einfacheaufgabe.banksystem;

public class Darlehensvertrag {

	private String vertragId;
	
	private Kunde kreditNehmer;
	
	private double kreditBetrag;
	
	private double zinsSatz;
	
	int laufzeit;
	
	public Darlehensvertrag(String vertragId, Kunde kreditNehmer, double kreditBetrag, double zinsSatz, int laufzeit) {
		this.vertragId = vertragId;
		this.kreditNehmer = kreditNehmer;
		this.kreditBetrag = kreditBetrag;
		this.zinsSatz = zinsSatz;
		this.laufzeit = laufzeit;
	}

	public double berechneMonatlicheRate() {
		double monatlicherZins = zinsSatz / 100 / 12;
		return kreditBetrag * monatlicherZins / (1 - Math.pow(1 + monatlicherZins, -laufzeit));
	}


	@Override
	public String toString() {
		return "Darlehensvertrag [vertragId=" + vertragId + ", kreditNehmer=" + kreditNehmer + ", kreditBetrag="
				+ kreditBetrag + ", zinsSatz=" + zinsSatz + ", laufzeit=" + laufzeit + "]";
	}
	
}
