package study;

import java.util.EmptyStackException;

public class Queue<T> {
	
	int max;
	int num;
	int rear;
	int front;
	T[] arr;
	
	@SuppressWarnings("unchecked")
	public Queue(int max) {
		num =0;
		rear = 0;
		front =0;
		this.max = max;
		arr = (T[])new Object[max];
		
	}
	
	boolean isEmpty() {
		return front==rear && num ==0;
	}
	boolean isFull() {
		return front==rear && num == max;
	}
	void push(T value) {
		if(isFull()) 
			throw new OutOfMemoryError();			
		arr[rear++] = value;
		num++;
		if(rear >= max )
			rear =0;
	}
	T pop() {
		if(isEmpty())
			throw new EmptyStackException();		
		num -= 1;
		T t = arr[front++];
		
		if(front >= max)
			front = 0;
		
		return t;
	}
	T peek() {
		return arr[front];
	}


}
