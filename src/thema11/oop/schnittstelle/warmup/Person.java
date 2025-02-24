package thema11.oop.schnittstelle.warmup;

public class Person extends SauegeTier implements Zeichnen {

	@Override
	public void laufen() {
		System.out.println("Person läuft.");
	}

	@Override
	public void fressen() {
		System.out.println("Person frisst.");
	}

	@Override
	public void zeichneRechteck() {
		System.out.println("Person zeichnet Rechteck");
		
	}

	@Override
	public void zeichneKreis() {
		System.out.println("Person zeichnet Kreis");
		
	}

	@Override
	public void zeichneDreieck() {
		System.out.println("Person zeichnet Dreieck");
		
	}
	

}
