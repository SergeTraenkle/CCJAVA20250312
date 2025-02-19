package thema7.oop.verschachtelungen;

public class StarPyramidProgram {

	public static void main(String[] args) {
			
		int height = 5;
		
		for (int i = 1; i <= height; i++) {
			// height-i: Anzahl der Leerzeichen
			for (int j = 1; j <= height-i; j++) {
				System.out.print(" ");
			}
								
			// Drucken von den Sternen
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}

}
