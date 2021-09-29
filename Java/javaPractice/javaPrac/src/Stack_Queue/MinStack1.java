package Stack_Queue;
import java.util.Stack;
//https://www.youtube.com/watch?v=atPGriLDP9E
public class MinStack1 {

	public static void main(String[] args) {
		MinOfStack1 ms = new MinOfStack1();
		System.out.println(ms.isEmpty());
		
	
		ms.push(4);
		System.out.println(ms.min());
		ms.push(3);
		ms.push(2);	
		ms.push(1);
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.min());

	}


	
}

class MinNode1{
	int data;
	int min;
	MinNode1(int value, int min){
		data = value;
		this.min = min;
	}
}


class MinOfStack1 extends	Stack<MinNode1>{
	
		
	public int min() {
		
		if(this.isEmpty())
			return Integer.MAX_VALUE;
		else
		return this.peek().data;
		
	}	
	

	public void push(int value) {
		
		int newMin = Math.min(value, min() );
		MinNode1 node = new MinNode1(value,newMin);
		super.push(node);
	}

	
}