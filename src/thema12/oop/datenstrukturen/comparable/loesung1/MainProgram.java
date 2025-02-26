package thema12.oop.datenstrukturen.comparable.loesung1;

public class MainProgram {

	public static void main(String[] args) {
		
		Student s1 = new Student(1001, "Max", "Müller", "max.mueller@example.com");
        s1.setAge(22);
		Student s2 = new Student(1002, "Anna", "Schmidt", "anna.schmidt@example.com");
		s2.setAge(25);
		Student s3 = new Student(1003, "Tom", "Meier", "tom.meier@example.com");
		s3.setAge(35);

		Student s4 = new Student(1004, "Lisa", "Meier", "lisa.meier@example.com");
        s4.setAge(22);
        
		/**
		 * Werte von der Methode compareTo()
		 * <0, wenn aktuelle Objekt kleiner ist als das übergebene Objekt
		 * =0, wenn beide Objekte gleich sind
		 * >0, wenn das aktuelle Objekt größer als das übergebene Objekt ist.
		 */
		int result = s1.compareTo(s4);
		if(result < 0) {
			System.out.println("Student " 
			        + s1.getMatrikelNummer() 
			        + " kommt vor Student " 
			        + s4.getMatrikelNummer() + " in der Sortierung.");
		} else if(result == 0) {
			System.out.println("Student " 
					+ s1.getMatrikelNummer()
					+ "und Student " 
					+ s4.getMatrikelNummer()
					+ " sind gleich in der Sortierung");
		} else {
			 System.out.println("Student " 
				        + s1.getMatrikelNummer() 
				        + " kommt nach Student " 
				        + s4.getMatrikelNummer() + " in der Sortierung.");
		}
	}

}
