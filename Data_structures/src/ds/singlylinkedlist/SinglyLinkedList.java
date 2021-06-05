package ds.singlylinkedlist;

public class SinglyLinkedList {
// this is our abstract data type
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {//it's not that efficient bcz to insert something at the end, we need traverse through the entire list
		Node current = first;
		while(current.next != null ) {
			current = current.next;//we'll loop until current.next is null
		}
		
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
