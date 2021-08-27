package Programmers;

import java.util.Stack;
//https://programmers.co.kr/learn/courses/30/lessons/42883
//ÇØ°á
public class Number_42883_2 {

	public static void main(String[] args) {
		 solution("99989999", 4);

	}
	  public static String solution(String number, int k) {
		  
		  Stack<Character> stack = new Stack<>();
		  char[] chs = number.toCharArray();
		  
		  int n = k;
		  
		  for(char ch : chs) {
			if(stack.isEmpty()) {
				stack.add(ch);
				continue;
			}
			
			while(k>0 &&!stack.isEmpty() && stack.peek() < ch) {
					stack.pop();
					k--;
			}		
			stack.add(ch);		
		  }
		  
		  StringBuilder sb = new StringBuilder();
		  while(!stack.isEmpty()) {
			  sb.append(stack.pop());
		  }
		  if(sb.length() > number.length()-k )
			  return sb.reverse().substring(0,number.length()-k).toString();
		  return sb.reverse().toString();
	  }
}
