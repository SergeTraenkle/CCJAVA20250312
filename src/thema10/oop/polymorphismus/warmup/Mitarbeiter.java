package thema10.oop.polymorphismus.warmup;

public  class Mitarbeiter {

	public void arbeite() {
		System.out.println("Mitarbeiter arbeitet");
	}
	
	public static double gibGehalt(Mitarbeiter mitarbeiter) {
		if(mitarbeiter instanceof Entwickler) {
			return 80000.0;
		} else if(mitarbeiter instanceof Manager) {
			return 100000.0;
		}
		else {
			return 0.0;
		}
	}
}
