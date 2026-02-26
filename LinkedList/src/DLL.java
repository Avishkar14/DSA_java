public class DLL {
 
	private Node head; //By default its null.
 
	public void insertFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		newNode.prev = null;
 
		// Null pointer exception handling :
		if( head != null ) {
			head.prev = newNode;
		}
 
		head = newNode;
	}

	public void insertLast(int value){
		Node newNode = new Node(value);
		newNode.next = null;
		if( head == null){
			insertFirst(value);
			return;
		}

		Node temp = head;
		while( temp.next != null){
			temp = temp.next;
		}
		//We reached at last node:
		temp.next = newNode;
		newNode.prev = temp;

	}

	public void insert(int value, int index){
		if(head == null){
			if( index == 0 ){
				insertFirst(value);
				return;
			}
		}

		int size = 1; //size = 1 as it has atleast 1 node as it passes above condition
		Node last = head;
		while( last.next != null  ){
			last = last.next;
			size++;
		}
		if(index > size){
			throw new IndexOutOfBoundsException();
		}
		if( size == index ){
			//i.e; insert in last index;
			insertLast(value);
			return;
		}

		Node temp = head;
		for( int i = 0; i < index - 1; i++){
			temp = temp.next;
		}
		//We have temp on index - 1:
		//creating new Node;
		Node newNode = new Node(value);

		temp.next.prev = newNode;
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
	}
 
	public void display() {
		Node temp = head;
 
		while( temp != null ) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.println(" END ");
	}
 
	public void displayRev() {
		Node temp = head;
		Node last = null;
		while( temp != null ) {
			last = temp;
			temp = temp.next;
		}
		//now reached at last node:
		//so start with :
		while( last != null) {
//  	And move back using prev pointer.
			System.out.print( last.value + " -> ");
			last = last.prev;
		}
		System.out.println(" START ");
 
	}

	private class Node{
		int value;
		Node next;
		Node prev;
 
		public Node(int value) {
			this.value = value;
		}
 
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev= prev;
		}
 
	}
 
}