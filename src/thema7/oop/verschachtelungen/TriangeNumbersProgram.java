package thema7.oop.verschachtelungen;

public class TriangeNumbersProgram {

	public static void main(String[] args) {
	
		int max = 15;	// Maximalwert für die Dreieckzahlen
		int sum = 0;	// Variable zur Speicherung der aktuellen Dreieckszahl	
		
		/**
		 * Startet eine Schleife, die mit i=1 beginnt und so lange läuft, 
		 * bis die berechnete Dreieckszahl sum die maximale Grenze max überschreitet.
		 */
		for (int i = 1; sum <= max; i++) {
			
			// Dreieck zentriert
			for(int k = 5; k > i-1; k--) {
				System.out.print(" ");
			}
			
			sum += i;
			for (int j = 1; j <= i; j++) {
				if(j == 1) {
					System.out.print(j);
				} else {
					System.out.print("+" + j);
				}
			}
			System.out.println("=" + sum);
		}
	}
}
