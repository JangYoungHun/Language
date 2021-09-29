package study;

import study.LinkedListNode2.Node;

//https://www.youtube.com/watch?v=Vb24scNDAVg&list=PLjSkJdbr_gFZQp0KEoo0Y4KkCI5YqxtjZ&index=7
//https://www.youtube.com/watch?v=xI4iPEmkHlc
public class LinkedList4 {

	public static void main(String ars[]) {
		
		LinkedListNode2 linkedListNode = new LinkedListNode2();
		linkedListNode.append(1);
		linkedListNode.append(4);
		linkedListNode.append(3);
		linkedListNode.append(2);
		linkedListNode.append(5);
		linkedListNode.append(7);
		linkedListNode.append(9);
		linkedListNode.printList();
		int k =2;
		Reference r = new  Reference();
		Node n = linkedListNode.backIndexOf2(linkedListNode.header.next, k, r);
		System.out.println("뒤에서" + k +"번째 노드의 값 : "+ n.data);
	}
	
}


class  LinkedListNode2{	
	
	Node header;
	
	public LinkedListNode2() {
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
		Node n = header;  // n 비교값 
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
			
	Node backIndexOf(int k) {
		Node n = this.header.next; 
		int total = 1;  // 마지막 노드는 while문에서 안가기에 +1 아래 while문 참조
		while(n.next != null) {
			total++;
			n = n.next;			
		}
		n = this.header.next; 
	System.out.println("total : " + total);
		for(int i =1; i < total-k+1; i++) {
			n = n.next;			
		}
		return n;
	}
	
		Node backIndexOf2(Node n ,int k, Reference r) {   //맨처음 해더 비어있는거 빼줘야함
				if(n == null) {
					return null;				
				}
				Node node = backIndexOf2(n.next ,k, r);
				r.count++;
				if (k == r.count)												
					return n;
					
				return node;				
	}
	
	
		
		
	}	
	 class Reference{
		public  int count =0;
	 }

	


