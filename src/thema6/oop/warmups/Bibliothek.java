package thema6.oop.warmups;

public class Bibliothek {
	
	public static final int MAXIMALE_BUECHER = 2000;
	
	public int aktuellerBestand;
	
	public void buchHinzufuegen() {
		System.out.println("Ein Buch wurde hinzugefügt.");
	}
	
	public void buchEnternen() {
		System.out.println("Ein Buch wurde entfernt.");
	}
}
