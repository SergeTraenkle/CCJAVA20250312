package thema12.oop.datenstrukturen.listen.warmup;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {

		// Schnittstelle -> Vertrag
		// Schnittstelle -> Typ
		// Schnittstelle -> mehrere Vererbung
		List<String> namenListe = new ArrayList<String>();
		namenListe.add("Serge");
		namenListe.add("Peter");
		namenListe.add("Markus");
		namenListe.add("Lisa");
		namenListe.add("Serge");

		System.out.println(namenListe.get(0));
		System.out.println(namenListe.get(4));		
	}
}
