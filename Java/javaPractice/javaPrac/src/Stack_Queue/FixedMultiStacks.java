package Stack_Queue;
import java.lang.Exception;
import java.util.EmptyStackException;

class FullStackException extends Exception{
	
	public FullStackException() {
		super();
	}
	public FullStackException(String msg) {
		super(msg);
	}
}


public class FixedMultiStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FMS{
	
	int numOfStacks = 3;
	int stackSize;
	int[] value;
	int[] sizes;
	
	FMS(int stackSize){
		this.stackSize = stackSize;
		sizes = new int[numOfStacks];
		value = new int[stackSize * numOfStacks];

	}
	boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0; 		
	}
	boolean isFull(int stackNum) {
		return sizes[stackNum] == stackSize; 		
	}
	
	int getTopIndexint (int stackNum) {
		int offset = stackSize + stackNum;
		int size = sizes[stackNum];
		return offset+size-1;
	}
	
	void push(int stackNum, int data) throws FullStackException {
		
		if(isFull(stackNum)) {
			throw new FullStackException();
		}
			
		int index = getTopIndexint(stackNum);
		value[getTopIndexint(stackNum)+1] = data;
		sizes[stackNum] ++;
	}
	int pop(int stackNum) {
		if(isEmpty(stackNum)) {
			throw new EmptyStackException();			
		}
		int top = getTopIndexint(stackNum);
		int data = value[top];
		value[top] = 0;
		sizes[stackNum]--;
		return data;
	}
	
	int peek(int stackNum) {
		if(isEmpty(stackNum))
			throw new EmptyStackException();
		
		return value[getTopIndexint(stackNum)];
		
	}
	
	
	
	
	
	
	
	
	
}