package Stack_Queue;

import java.util.NoSuchElementException;

//https://www.youtube.com/watch?v=W3jNbNGyjMs&list=PLjSkJdbr_gFZL2BNnGLvTgMYXptKGIyum&index=2
public class Queue_EX {

	public static void main(String[] args) {
		Queue<Integer> que = new Queue<Integer>();
		que.printQueue();
		System.out.println(que.isEmpty());
		que.add(1);
		que.add(3);
		que.add(8);
		que.add(7);
		System.out.println(que.remove());
		System.out.println(que.peek());

		que.printQueue();
		
	}
}
	
	class Queue<T>{
		
		Node<T> first=null;
		Node<T> last=null;

		class Node<T>{
			T data;
			Node<T> next;		
			Node(){};
			Node(T data){	
				this.data = data;			
			}
		}
		
		void add(T data) {
			Node n = new Node(data);
			if(last != null) {
				last.next = n;		
			}
			last = n;
			if(first == null) {
				first = last;
			
			}
	}
	
		 T remove() {  //  맨앞 데이터 꺼내기		
			if(first == null) throw new NoSuchElementException();
			
			T data = first.data;
			first = first.next;
			if(first == null) {
				last = null;
			}
		return data;
				
		}
		
		 T peek() {
			 if(first == null)
				 throw new NoSuchElementException();		 
			 return first.data;
		 }
		 
		 boolean isEmpty() {
			return first ==null;
		 }
		
		void printQueue() {
			if(first != null) {
			Node n = first;
			while(n.next != null) {
				System.out.print(n.data + " -> ");
				n = n.next;
			}
			System.out.println(n.data );		
		}
			else {
				System.out.println("큐가 비어있습니다" );	
			}
		}
		
	}	

		


