package thema12.oop.datenstrukturen.listen.einfachverketettelisten;

public class MainProgram {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(10);
		sll.add(20);
		sll.add(30);
		
		System.out.println("Inhalt der einfach verketteten Liste");
		sll.display();
	}

}
