package Stack_Queue;
import java.util.Stack;
//https://www.youtube.com/watch?v=atPGriLDP9E
public class MinStack2 {

	public static void main(String[] args) {
		MinOfStack2 ms = new MinOfStack2();
		System.out.println(ms.isEmpty());
		
	
		ms.push(3);
		ms.push(5);
		ms.push(1);	
		ms.push(2);
		System.out.println("min : " + ms.min());
		System.out.println("pop : " + ms.pop());
		System.out.println("min : " + ms.min());
		System.out.println("pop : " + ms.pop());
		System.out.println("min : " + ms.min());
		System.out.println("pop : " + ms.pop());
	}


	
}


class MinOfStack2 extends Stack<Integer>{
	
	Stack<Integer> s2 ;
	public MinOfStack2() {
		s2 = new Stack<Integer>();
	}
		
	public int min() {
		if(s2.isEmpty())
			return Integer.MAX_VALUE ;
		
		return s2.peek();
	}	
	
	public void push(int value) {
		if(value < min()) {
		s2.push(value);
		}
		super.push(value);
	}

	public Integer pop() {
		
		int value = super.pop();
		if(min() == value)

			s2.pop();
		
		return value;
	
	}
	
	
	
	
	
	
	
}