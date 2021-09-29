package Programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12973
//ÇØ°á
public class Number_12973 {

	public static void main(String[] args) {
		 solution("baabaa");

	}
	 public static int solution(String s)
	    {
		 	Stack<Character> stack1 = new Stack<Character>();
			Stack<Character> stack2 = new Stack<Character>();
			
			for(char ch : s.toCharArray()) {
				stack1.add(ch);
			}
			
			while(!stack1.isEmpty()) {
				
				char top1 = stack1.pop();
			
			 if(!stack2.isEmpty() && stack2.peek() == top1) {
					stack2.pop();
					continue;
				}
			 else {
				 stack2.add(top1);
			 }	
			
			}
			
			 if(stack2.size() == 0)
				 return 1;
			 else
				 return 0;
			 
			
	    }
	 

	 
}
