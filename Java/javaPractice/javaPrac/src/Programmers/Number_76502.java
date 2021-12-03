package Programmers;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/76502
//ÇØ°á
public class Number_76502 {

	public static void main(String[] args) {
		String s = "[](){}";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		
		Queue<Character> q = new LinkedList<Character>();
		
		int n = s.length();
		
		for(int i =0; i<n; i++) {
			q.add(s.charAt(i));
		}
		
		int answer = 0;
	
		for(int i =0; i<n; i++) {
			if(check(q))
				answer++;
			
			q.add(q.poll());
			
		}

	    return answer;
	}
	
	static boolean check(Queue<Character> q) {
		
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		stack1.addAll(q);
		
		
		while(!stack1.isEmpty()) {
			
			if(stack2.isEmpty()) {
				stack2.add(stack1.pop());
			}
			else {
				if(stack1.peek() == '(' && stack2.peek() == ')'
						|| stack1.peek() == '{' && stack2.peek() == '}'
						|| stack1.peek() == '[' && stack2.peek() == ']') {
					stack1.pop();
					stack2.pop();
				}
				else
					stack2.add(stack1.pop());
			}
			
		}
		if(stack1.isEmpty() && stack2.isEmpty())
			return true;
		
		else
			return false;
	}

	

	
}
















