package study;

public class LinkedList2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode linkedListNode = new LinkedListNode();
		linkedListNode.append(1);
		linkedListNode.append(2);
		linkedListNode.append(3);
		linkedListNode.append(4);
		linkedListNode.append(2);
		linkedListNode.printNode();
		linkedListNode.delete(2);
		linkedListNode.printNode();
	}

}

class LinkedListNode {
	
	 Node haeder;
	
	LinkedListNode (){
	haeder = new Node();
	}

public  class Node {
	int data;
	Node  nextNode = null; 
	
	public Node(){ }
	Node(int d){
		this.data = d;
	}
}

	void append(int d) {
		Node  Node  = new Node (d);
		Node  n = haeder;
		while(n.nextNode  != null ) {
			n = n.nextNode ;
		}
		n.nextNode  = Node ;
	}
	
	void delete(int d) {

		Node  n =haeder;
		while(n.nextNode  != null) {
			if( n.nextNode .data == d) 
				n.nextNode  =  n.nextNode .nextNode ;			
			else
				n = n.nextNode ;
	}
}		
	void printNode() {
		Node  n = haeder.nextNode;		
		while(n.nextNode  != null) {
			System.out.print(n.data + " -> ");
			n = n.nextNode ;
		}
		System.out.println(n.data);
	}


	
}

	