package thema4.arrays.warmup.random;

public class RandomProgram {

	public static void main(String[] args) {

		int [] randomValues = new int[50];
		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = (int) (Math.random() * 10); 
		}
		
		for (int i = 0; i < randomValues.length; i++) {
			System.out.println(randomValues[i] + " ");
		}
	}
}
