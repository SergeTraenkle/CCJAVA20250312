package thema8.oop.einfacheaufgabe.banksystem;

public class Kunde {

	private String kundenId;
	
	private String firstName;
	
	private String lastName;
	
	private String adresse;

	
	public Kunde(String kundenId, String firstName, String lastName) {
		this.kundenId = kundenId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Kunde [kundenId=" + kundenId + ", firstName=" + firstName + ", lastName=" + lastName + ", adresse="
				+ adresse + "]";
	}
	
	
}
