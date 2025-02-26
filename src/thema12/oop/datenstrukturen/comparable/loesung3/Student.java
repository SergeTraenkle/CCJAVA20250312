package thema12.oop.datenstrukturen.comparable.loesung3;

public class Student implements Comparable<Student> {

	int matrikelNummer;

	String vorname;

	String nachname;

	String email;

	int age;

	public Student(int matrikelNummer, String vorname, String nachname, String email) {
		this.matrikelNummer = matrikelNummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
	}

	public int getMatrikelNummer() {
		return matrikelNummer;
	}

	public void setMatrikelNummer(int matrikelNummer) {
		this.matrikelNummer = matrikelNummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student other) {
		
		int ageComparison = Integer.compare(this.age, other.age);
		if(ageComparison != 0) {
			return ageComparison;
		} else {		
			return this.vorname.compareTo(other.vorname);
		}
	}

	@Override
	public String toString() {
		return "Student [matrikelNummer=" + matrikelNummer + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", email=" + email + ", age=" + age + "]";
	}
}
