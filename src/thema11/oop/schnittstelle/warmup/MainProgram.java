package thema11.oop.schnittstelle.warmup;

public class MainProgram {

	public static void main(String[] args) {
		
		Hund maxHund = new Hund();
		Katze lottiKatze = new Katze();
		Person xPerson = new Person();
		
		SauegeTier[] sauegeTiere = {
				maxHund,
				lottiKatze,
				xPerson
		};
		
		// Iterieren und ausgeben
		
		Zeichnen[] zeichnenObjekte= {
				maxHund,
				xPerson
		};
		
		// Iterieren und ausgeben
	}

}
