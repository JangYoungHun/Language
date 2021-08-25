package Programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/76502
//�ذ�

public class Number_76502_2 {

	public static void main(String[] args) {
		String s = "[)(]";
		System.out.println(solution(s));
	}
	
public static int solution(String s) {

		int n = s.length();

		int answer = 0;
	
		for(int i =0; i<n; i++) {
			if(check(s,i))
				answer++;
		}

	    return answer;
	}
	

static boolean check(String s, int start) {
	int n = s.length();
	Stack<Character> stack = new Stack<Character>();
	for(int i = start; i<start+n; i++) {
		if(stack.isEmpty()) {
			stack.add(s.charAt(i%n));
		}
		else {
			if(stack.peek() == '(' && s.charAt(i%n) == ')'
					||stack.peek() == '{' && s.charAt(i%n) == '}'
					||stack.peek() == '[' && s.charAt(i%n) == ']') {
				stack.pop();
			}
			else
				stack.add(s.charAt(i%n));
		}
	}
	
	if(stack.isEmpty())
		return true;
	else
		return false;
}


}
