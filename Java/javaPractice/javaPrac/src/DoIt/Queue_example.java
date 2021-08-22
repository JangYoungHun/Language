package DoIt;
import DoIt.Queue;
public class Queue_example {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(8);
		
	
		queue.push(55);
		queue.push(10);
		queue.push(95);		
		queue.push(75);
		queue.push(64);
		queue.push(64);
		queue.push(64);
		queue.push(64);
		
		System.out.println(queue.isFull());
		System.out.println(queue.num);
		System.out.println(queue.pop());
		System.out.println(queue.num);
		
	}

}

