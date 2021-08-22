package study;



//https://www.youtube.com/watch?v=vuJk2JZd3fI
public class LinkedList6 {

	public static void main(String ars[]) {
		
		LinkedListNode4 linkedListNode1 = new LinkedListNode4();
		LinkedListNode4 linkedListNode2 = new LinkedListNode4();
		linkedListNode1.append(1);
		linkedListNode1.append(4);
		linkedListNode1.append(3);
		linkedListNode2.append(2);
		linkedListNode2.append(5);
		linkedListNode2.append(7);
		Node sumResult =  LinkedListNode4.sumList(linkedListNode1.header.next, linkedListNode2.header.next, 0);
		
		linkedListNode1.printList();
		linkedListNode2.printList();
		while(sumResult.next != null) {
			System.out.print(sumResult.data + " -> ");
			sumResult = sumResult.next;
		}
		System.out.println(sumResult.data );
	}
}
	class  LinkedListNode4{	
		
		Node header;
		
		public LinkedListNode4() {
			header = new Node();
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
			Node n = header;  // n ºñ±³°ª 
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
			

		static Node sumList(Node n1, Node n2, int carry) {
		
		
		if(n1 == null && n2 == null && carry == 0)
			return null;
		
		int value = carry;
		Node result= new Node() ;
		
		if(n1 != null)
			value += n1.data;

		if(n2 != null)
			value += n2.data;
		
		result.data = value % 10;
		if(n1 != null || n2 != null)
		result.next = sumList(n1 ==null ? null : n1.next, n2 ==null ? null : n2.next,  value>=10 ? 1 : 0  );
		
		return result;
	}
	
	}

	class Node{
		int data;
		Node next = null;
		Node(){}
		Node(int d){
			this.data = d;
		}	
	}
	





