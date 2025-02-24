package thema9.oop.vererbung.koenigfamilie;

public class PrinceGeorge extends PrinceWilliam {

	private int anzahlFliegendeAutos = 9;
	
	public void displayAutos() {
		System.out.println("Anzahl Autos: " + (this.anzahlFliegendeAutos + this.anzahlAutos));
	}
}
