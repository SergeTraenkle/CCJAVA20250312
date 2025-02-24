package thema10.oop.polymorphismus.warmup;

public class MainProgram {

	public static void main(String[] args) {
		
		// Mitarbeiter manager;
//		Mitarbeiter manager = new Manager(); // manager -> Manager
//		manager = new Entwickler();		// manager -> Entwickler
		
//		Mitarbeiter mitarbeiter = new Entwickler();
//		System.out.println(Mitarbeiter.gibGehalt(mitarbeiter));
//		
//		mitarbeiter = new Manager();
//		System.out.println(Mitarbeiter.gibGehalt(mitarbeiter));
//		
		
		
		Manager manager = new Manager();
		Mitarbeiter mitarbeiter = new Mitarbeiter();
		
		mitarbeiter = manager; // Upcasting
		
		if(mitarbeiter instanceof Mitarbeiter) {
			manager = (Manager)mitarbeiter; // Downcasting
		}
	}
}
