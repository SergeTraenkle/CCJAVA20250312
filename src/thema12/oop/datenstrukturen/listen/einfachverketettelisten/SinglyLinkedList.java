package thema12.oop.datenstrukturen.listen.einfachverketettelisten;

/**
 * Einfach-verkettete Liste
 */
public class SinglyLinkedList {

	private Node head;
	
	/**
	 * Methode fügt einen neuen Knoten (Node) am Ende der verketteten Liste ein.
	 * @param data
	 */
	public void add(int data) {
		
		Node newNode = new Node(data);	// temporäres Objekt wird definiert
		if(head == null) {	
			head = newNode; // setze das erste Element (head), falls es noch nicht gesetzt war
		} else {
			Node current = head;
			while(current.next != null) { // such nach dem Ende der verkette Liste
				current = current.next;
			}
			current.next = newNode; // setzt das neue Element an das Ende der Liste
		}
	}
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
