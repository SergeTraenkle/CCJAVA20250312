package thema12.oop.datenstrukturen.listen.doppeltverketettelisten;

public class MainProgram {

	public static void main(String[] args) {

		DoublyLinkedList liste = new DoublyLinkedList();
		liste.add(10);
		liste.add(20);
		liste.add(30);
		
		System.out.println("Inhalt der doppelt verketteten Liste");
		liste.displayForward();
	}

}
