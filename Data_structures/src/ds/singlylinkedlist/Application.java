package ds.singlylinkedlist;

public class Application {

	public static void main(String[] args) {

		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(99);
		mylist.insertFirst(88);
		mylist.insertFirst(77);
		
		mylist.insertLast(66666);
		
		mylist.displayList();
	}

}
