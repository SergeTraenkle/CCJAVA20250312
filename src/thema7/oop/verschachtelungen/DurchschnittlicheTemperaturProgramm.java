package thema7.oop.verschachtelungen;

public class DurchschnittlicheTemperaturProgramm {

	public static void main(String[] args) {

		double[][] temperaturen = {
            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
            {25.1, 26.3, 24.8, 26.0, 27.5, 25.7, 24.9}  // Stadt 3
        };
		
		for (int i = 0; i < temperaturen.length; i++) {
			double summe = 0;
			for (int j = 0; j < temperaturen[i].length; j++) {
				summe += temperaturen[i][j];
			}
			
			double durchschnitt = summe / temperaturen[i].length;
			System.out.println("Durchschnittliche Temperatur für Stadt " 
			+ (i+1) 
			+ ": " + durchschnitt);
		}
	}
}
