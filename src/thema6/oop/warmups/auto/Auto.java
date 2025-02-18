package thema6.oop.warmups.auto;

public class Auto {

	private String marke;
	
	private String modell;
	 
	private int baujahr;

	private String motor; 
	
	public Auto() {
	}
	

	public Auto(String marke) {
		this.marke = marke;
	}	
	
	public Auto(String marke, String modell, int baujahr) {
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	@Override
	public String toString() {
		return "Auto [marke=" + marke + ", modell=" + modell + ", baujahr=" + baujahr + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Auto tmpAuto = (Auto) obj;
		return 
			this.marke.equals(tmpAuto.getMarke()) 
			&& this.baujahr == tmpAuto.getBaujahr() 
			&& this.modell.equals(tmpAuto.getModell());
	}
}
