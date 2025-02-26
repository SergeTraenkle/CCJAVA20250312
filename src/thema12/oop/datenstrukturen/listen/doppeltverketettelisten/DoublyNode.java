package thema12.oop.datenstrukturen.listen.doppeltverketettelisten;

public class DoublyNode {

	int data;
	
	DoublyNode next;
	
	DoublyNode prev;
	
	public DoublyNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
