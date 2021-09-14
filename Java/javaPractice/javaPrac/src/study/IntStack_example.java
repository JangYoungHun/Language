package study;

import java.util.EmptyStackException;

//p.136
//Stack ����
public class IntStack_example {

	public static void main(String[] args) {
		
		

	}
}
	

	class  IntStack {
		int max;   // ���� �ִ� ���� ����
		int ptr;    //���� ������
		int[] stk;   //���� ��ü
		
		public IntStack(int max) {
			this.max =max;
			ptr =0;
			try {
				stk = new int[max];
			} catch (OutOfMemoryError e) {
				max =0;
			}
			
		}
		public void push(int value) {
			if(ptr == 8)	{
				throw new StackOverflowError();
			}
			stk[ptr++] = value;			
		}
		int pop() {
			if(ptr<= 0 ) {
				throw new EmptyStackException();				
			}
			return stk[--ptr];
		}
		int peek() {
			if(ptr<=0) 
				throw new EmptyStackException();
			return stk[ptr-1];
		}
		
		
	}

