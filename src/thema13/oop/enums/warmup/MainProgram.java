package thema13.oop.enums.warmup;

public class MainProgram {
	
	public static void main(String[] args) {
		CoffeeType type = CoffeeType.LATTE;
		displayTypeInfo(type);
	}

	
	public static void displayTypeInfo(CoffeeType type) {
		switch (type) {
		case LATTE: {
			System.out.println("LATTE wurde ausgewählt.");
			break;
		}
		case CAPPUCCINO:
			System.out.println("CAPPUCCINO wurde ausgewählt.");
			break;
		case ESPRESSO:
			System.out.println("ESPRESSO wurde ausgewählt.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}	
}
