package study;

public class LinkedList3 {

	public static void main(String ars[]) {
		
		LinkedListNode1 linkedListNode = new LinkedListNode1();
		linkedListNode.append(1);
		linkedListNode.append(4);
		linkedListNode.append(3);
		linkedListNode.append(2);
		linkedListNode.append(2);
		linkedListNode.append(4);
		linkedListNode.append(3);
		linkedListNode.append(5);
		linkedListNode.printList();
		linkedListNode.removeDups();
		linkedListNode.printList();
		
	}
	
}


class  LinkedListNode1{	
	
	Node header;
	
	public LinkedListNode1() {
		header = new Node();
	}

	class Node{
		int data;
		Node next = null;
		Node(){}
		Node(int d){
			this.data = d;
		}	
	}
	
	void append(int d) {
		Node n = header;
		Node end = new Node(d);
		while	(n.next != null) {
			n = n.next;			
		}
		n.next = end;
	}	

	void delete(int d) {
		Node n = header;
		while	(n.next != null) {
			if(n.next.data == d)
				n.next =n.next.next;
			else
				n = n.next;
		}
	}
	void printList() {
		Node n = header.next;
		while	(n.next != null) {				
			System.out.print( n.data + "->" );		
			n = n.next;			
		}
		System.out.println( n.data  );		
	}	
	
	void removeDups() {
		Node n = header;  // n �񱳰� 
		while( n != null && n.next != null) {
			Node r = n;
			while(r.next != null) {
				
				if(n.data == r.next.data)
					r.next = r.next.next;				
				else
					r = r.next;
			}
			n = n.next;
		}
		
		
		
	}	
	

	
}
