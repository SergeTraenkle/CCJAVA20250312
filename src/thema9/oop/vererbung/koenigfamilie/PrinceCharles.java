package thema9.oop.vererbung.koenigfamilie;

public class PrinceCharles extends QueenElisabeth {

	private String firstName = "Charles";
	
	public void displayFullname() {
		System.out.println("Name: " + firstName + " " + familyName);
	}
}
