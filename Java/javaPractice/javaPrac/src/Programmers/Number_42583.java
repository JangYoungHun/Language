package Programmers;

import java.util.LinkedList;
import java.util.Queue;
//https://programmers.co.kr/learn/courses/30/lessons/42583
//해결
public class Number_42583 {

	public static void main(String[] args) {
		System.out.println(solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));

	}
	   public static  int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        
	        Queue<Integer> q1 = new LinkedList<>(); //다리 건너는 트럭 무게
	        Queue<Integer> q2 = new LinkedList<>();   //다리 건너는 트럭 시간
	        Queue<Integer> q3 = new LinkedList<>();   //대기 트럭
	        
	        for(int i : truck_weights) {
	        	q3.add(i);    
	        }				
	        int curTime =0;

	        int curWeight =0;
	        int curLength =0;
	        
	        while(!q3.isEmpty() || !q2.isEmpty() ) {	
	        	
	        	curTime ++;
	        	
   	
	        	if(!q2.isEmpty() && !q1.isEmpty()) {
	        		int top2 = q2.peek();
	        		if((curTime - top2) == bridge_length) {
	        			q2.poll();
	        			curLength--; 
	        			curWeight -= q1.poll();
	        		}
	        	}
	        	
	        	if(!q3.isEmpty()) {
	        	int top3 = q3.peek();
	        	
	        	if(curWeight + top3 <= weight &&  curLength <  bridge_length) {
	        		q3.poll();
	        		q2.add(curTime);
	        		q1.add(top3);
	        		curWeight += top3 ;
	        		curLength++;   		
	        	}
	        	
	        	}
     	
	        }
	        
	        
	        answer = curTime;
	        return answer;
	        
	        
	        
	                
	    }
}
