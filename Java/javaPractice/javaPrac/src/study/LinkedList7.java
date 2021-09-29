package study;

import java.util.LinkedList;

//https://www.youtube.com/watch?v=34zpNdrgnpA&list=PLjSkJdbr_gFZQp0KEoo0Y4KkCI5YqxtjZ&index=11
//회문 판별

public class LinkedList7 {

	public static void main(String ars[]) {
		LinkedListNode7 linkedList = new LinkedListNode7();
		linkedList.append("a");
		linkedList.append("b");
		linkedList.append("b");
		linkedList.append("a");
		linkedList.printNode();
		System.out.println( isPalindrome((Node7) linkedList.haeder.next)  );
		
	}
		
	
	public static boolean  isPalindrome(Node7 n1) {  //두개 노드 동일 비교 n1 기존 list n2 반전 list
		
		Node7 n2 = reversedList(n1);  // 반전된 리스트 반환 
		return  isEqualList(n1, n2);  // 동일한지 비교 
		
	}
	
	static Node7 reversedList(Node7 n1) {
		
		Node7 head = null;
		while(n1 != null) {
			Node7 n = new Node7();
			n.data = n1.data;
			n.next = head;
			head = n;
			n1 = n1.next;		
		}		
		return head;
	}
	
	static boolean isEqualList(Node7 n1, Node7 n2) {
		
		while(n1!=null && n2 != null) {
			if(n1.data != n2.data)
				return false;		
			n1 = n1.next;
			n2 = n2.next;
		}
			return n1 ==null && n2 == null;		
	}
	
}


class LinkedListNode7 {
	
	 Node7 haeder;
	
	LinkedListNode7 (){
	haeder = new Node7();
	}

	void append(String d) {
		Node7  Node  = new Node7 (d);
		Node7  n = haeder;
		while(n.next  != null ) {
			n = n.next ;
		}
		n.next  = Node ;
	}
	
	void delete(String d) {

		Node7  n =haeder;
		while(n.next  != null) {
			if( n.next .data == d) 
				n.next  =  n.next .next ;			
			else
				n = n.next ;
	}
}		
	void printNode() {
		Node7  n = haeder.next;		
		while(n.next  != null) {
			System.out.print(n.data + " -> ");
			n = n.next ;
		}
		System.out.println(n.data);
	}

}

class Node7 {
	String data;
	Node7  next= null; 
	
	Node7(){ }
	Node7(String d){
		this.data = d;
	}
}


