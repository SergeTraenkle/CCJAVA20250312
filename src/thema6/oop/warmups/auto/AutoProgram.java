package thema6.oop.warmups.auto;

public class AutoProgram {

	public static void main(String[] args) {

		Auto auto1 = new Auto("BMW", "X5", 2020);
		auto1.setMotor("XA203");
		Auto auto2 = new Auto("BMW", "X5", 2020);
		auto2.setMotor("XB105");
		
		if(auto1.equals(auto2)) {
			System.out.println("Auto1 ist gleich Auto2");
		} else {
			System.out.println("Auto1 ist ungleich Auto2");
		}
	}

}
