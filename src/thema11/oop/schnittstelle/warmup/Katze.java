package thema11.oop.schnittstelle.warmup;

public class Katze extends SauegeTier {
	
	@Override
	public void laufen() {
		System.out.println("Katze läuft.");
	}

	@Override
	public void fressen() {
		System.out.println("Katze frisst.");
	}
	
}
