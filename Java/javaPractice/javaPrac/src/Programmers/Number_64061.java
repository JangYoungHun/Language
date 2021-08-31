package Programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/64061
//ÇØ°á
public class Number_64061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	   public int solution(int[][] board, int[] moves) {
		   
		   Stack<Integer> stack = new Stack<Integer>();
		   
		   int n = board.length;
	        int answer = 0;
	        
		   for(int i : moves) {
			   for(int j = 0; j<n; j++) {
				   if(board[j][i-1] != 0) {					   
					   if(!stack.isEmpty() && stack.peek() == board[j][i-1]) {
						   stack.pop();
						   answer+=2;
					   }
					   else
						   stack.add(board[j][i-1]);
					   
					   board[j][i-1] = 0;
					   break;
				   }  
			   }
		   }
	        return answer;
	    }
}
