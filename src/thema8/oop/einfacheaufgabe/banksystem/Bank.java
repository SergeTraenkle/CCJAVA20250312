package thema8.oop.einfacheaufgabe.banksystem;

public class Bank {

	private String name;
	
	private int anzahlKonten = 2;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public void printBankInfo() {
		System.out.println("Name: " 
				+ this.name 
				+ ", anzahlKonten: " 
				+ anzahlKonten);
	}
}
