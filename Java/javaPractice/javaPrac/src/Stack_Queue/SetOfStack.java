package Stack_Queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;
public class SetOfStack {

	public static void main(String[] args) {


	}

}


class SetStack{
	
	int  capacity;
	ArrayList<Stack<Integer>> arrayList = new ArrayList<Stack<Integer>>() ;
	
	SetStack(int capacity){
		this.capacity = capacity;
	}
	
	 Stack<Integer> getLastStack() {
		 	if(arrayList.size() ==0 )
		 		return null;
	 	
		 	return arrayList.get(arrayList.size()-1);
	 }
	 
	
	 void addStack() {
		 arrayList.add(new Stack<Integer>());
			
		}
	 
	 void removeLastStack() {
		 arrayList.remove(arrayList.get(arrayList.size()-1));
	 }
	 
	 void push(int data) {
		 Stack<Integer> lastStack = getLastStack();
		 if(lastStack == null ||  lastStack.size() == capacity) {
			 addStack();
			 lastStack = getLastStack();			
		 }
		 lastStack.add(data);
	 }
	 
	 public int pop() {
		 											
		 Stack<Integer> lastStack = getLastStack();
		 if(lastStack == null ||  lastStack.size() == 0) 
			 throw new EmptyStackException();
		 
		int data = lastStack.pop();	
		if(lastStack.isEmpty()){
			removeLastStack();
		}
		return data;	

	 }
}
	

