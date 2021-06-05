package ds.linkedlist;

public class Application {

	public static void main(String[] args) {

		Node nodea = new Node();
		nodea.data = 4;

		Node nodeb = new Node();
		nodeb.data = 3;

		Node nodec = new Node();
		nodec.data = 7;

		Node noded = new Node();
		noded.data = 8;

		nodea.next = nodeb;
		nodeb.next = nodec;
		nodec.next = noded;

		System.out.println(listLength(nodea));// 4
		System.out.println(listLength(nodeb));// 3
	}

	public static int listLength(Node anode) {
		
		int length = 0;
		Node currentNode = anode;
		while(currentNode !=null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
