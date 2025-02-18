package thema6.oop.warmups.auto;

public class TestString {

	public static void main(String[] args) {
		String a  = "Test";
		String b  = "Test";
		
		String c = new String("Test");
		
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
