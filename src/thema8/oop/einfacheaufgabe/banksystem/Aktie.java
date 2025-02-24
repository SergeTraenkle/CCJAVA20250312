package thema8.oop.einfacheaufgabe.banksystem;

public class Aktie {

	private String isin;
	
	private String unternehmensName;
	
	private double preis;
	
	
	public void aktualisierePreis(double neuerPreis) {
		this.preis = neuerPreis;
	}


	public Aktie(String isin, String unternehmensName, double preis) {
		this.isin = isin;
		this.unternehmensName = unternehmensName;
		this.preis = preis;
	}


	@Override
	public String toString() {
		return "Aktie [isin=" + isin + ", unternehmensName=" + unternehmensName + ", preis=" + preis + "]";
	}
	
	
}
