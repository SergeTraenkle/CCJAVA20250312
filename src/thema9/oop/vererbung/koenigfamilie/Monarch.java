package thema9.oop.vererbung.koenigfamilie;

public class Monarch {

	protected String title = "King/Queen";
	
	public String familyName = "Windsor";
	
	public Monarch() {
	}
	
	public void displayInfo() {
		System.out.println("Title: " + title + ", Family Name: " + familyName);
	}
}

