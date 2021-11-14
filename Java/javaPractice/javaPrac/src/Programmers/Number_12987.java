package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

//ÇØ°á
public class Number_12987 {
	
	public static void main(String args[]) {
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		solution(A, B); 
	}
	
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        
        PriorityQueue<Integer> q1 = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i : A) {
        	q1.add(i);
        }
        
        for(int i : B) {
        	q2.add(i);
        }
  
        while(!q1.isEmpty() && !q2.isEmpty()) {
        	
        	int num1 = q1.poll();
        	int num2 = q2.peek();
        	
        	if(num1 < num2) {
        		q2.poll();
        		answer++;
        	}

        }
        
        return answer;
    }
}
