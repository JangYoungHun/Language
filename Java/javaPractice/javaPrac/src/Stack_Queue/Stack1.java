package Stack_Queue;

import java.util.EmptyStackException;

class Stack2<T>{
	
	class Node<T>{
		 T data;
		Node<T> next;

		Node(T data){
			this.data = data;
		}
	}
	Node<T> top;
	
	public T pop() {
		if(top == null) 
		throw new EmptyStackException();
		
		T empty = top.data;
		top =  top.next;
		return empty;
		
	}
	
	public void push(T data){
		Node<T> n = new Node<T>(data);
		n.next = top;
		top = n;

	}
	
	public T peek() {
		if(top ==null)
			throw new EmptyStackException();
		
		return top.data;
	}
	
	public boolean isEmpty() {
		
		return top==null;
	} 
	
}




public class Stack1 {

	public static void main(String[] args) {
		Stack2<Integer> stack = new Stack2<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}
}
