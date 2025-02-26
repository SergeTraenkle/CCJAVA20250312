package thema12.oop.datenstrukturen.comparable.loesung2;

import java.util.ArrayList;
import java.util.List;

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
       
        System.out.println("Vergleichsergebnis s1 vs. s2: " + s1.compareTo(s2));
        System.out.println("Vergleichsergebnis s1 vs. s3: " + s1.compareTo(s3));
        System.out.println("Vergleichsergebnis s3 vs. s4: " + s3.compareTo(s4));
        System.out.println("Vergleichsergebnis s1 vs. s4: " + s1.compareTo(s4));
        
        List<Student> studentenListe = new ArrayList<>();
        studentenListe.add(s1);
        studentenListe.add(s2);
        studentenListe.add(s3);
        studentenListe.add(s4);
        studentenListe.sort(null);
        
        for (Student student : studentenListe) {
			System.out.println(student);
		}
	}

}
