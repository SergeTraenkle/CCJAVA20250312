package thema1.grundlagen.helloworld;

public class PostPreIncrementProgramm {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("i = " + i--);	// 0
		System.out.println("i = " + i);		// -1
		System.out.println("i = " + i);		// -1
		System.out.println("i = " + i);		// -1
	}

}
