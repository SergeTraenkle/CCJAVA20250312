package thema11.oop.schnittstelle.warmup;

/**
 * Mit implements Tier 
 * -> Hund bekommt den Typen "Zeichnen"
 * -> Hund schließt einen Zeichnen-Vertrag
 * -> Hund bekomment alle Eigenschaften von Zeichnen
 */
public class Hund extends SauegeTier implements Zeichnen {

	@Override
	public void laufen() {
		System.out.println("Hund läuft.");
	}

	@Override
	public void fressen() {
		System.out.println("Hund frisst.");
	}

	@Override
	public void zeichneRechteck() {
		System.out.println("Hund zeichnet Rechteck");
		
	}

	@Override
	public void zeichneKreis() {
		System.out.println("Hund zeichnet Kreis");
		
	}

	@Override
	public void zeichneDreieck() {
		System.out.println("Hund zeichnet Dreieck");
		
	}
	
}
