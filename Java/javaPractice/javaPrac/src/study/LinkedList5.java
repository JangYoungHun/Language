package study;

import study.LinkedListNode2;
import study.LinkedListNode2.Node;


//https://www.youtube.com/watch?v=xufv1LUy42E&list=PLjSkJdbr_gFZQp0KEoo0Y4KkCI5YqxtjZ&index=9
public class LinkedList5 {

	public static void main(String ars[]) {
		
		LinkedListNode2 linkedListNode = new LinkedListNode2();
		linkedListNode.append(1);
		linkedListNode.append(4);
		linkedListNode.append(3);
		linkedListNode.append(2);
		linkedListNode.append(5);
		linkedListNode.append(7);
		linkedListNode.append(9);
	
		Node n = Partition2(linkedListNode.header.next, 5);
		
		while(n.next != null) {
			System.out.print( n.data  + "->");
			n = n.next;
		}
		System.out.println( n.data);
	}
		
	private static Node Partition1(Node n, int k) //첫번째노드 , 정렬 기준값  ex) k 기준 같거나 작은값 오른쪽  큰값 오른쪽 
	{
		
		Node s1 = null;
		Node e1 = null;
		Node s2 = null;
		Node e2 = null;
		
		while( n!= null ) {
			Node next = n.next;
			n.next = null;
			if(n.data > k) {
				
				if(s1 == null) {
					s1 = n;
					e1 = s1;
				}
				else {
					e1.next = n;
					e1 = n;
				}
			}
			else {
				if(s2 == null) {
					s2 = n;
					e2 = s2;
				}
				else {
					e2.next = n;
					e2 = n;
					
				}
			}
			n = next;
		}
		if(s1 == null)
			return s2;
		
		e1.next = s2;
		return s1;
	}
	
	private static Node Partition2(Node n, int k) {
							
		Node b= n;   //Bigger
		Node s= n;   // Smaller
		
		while(n != null) {
			Node next = n.next;
			n.next = null;
			
				if(n.data > k ) {
			      b.next =n;
			      b =n;
				}
				else {
					n.next = s;
					s= n;				
				}
			n = next;			
		}
		
	
		return s;
		
	}
	
}




