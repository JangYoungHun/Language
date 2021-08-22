package Programmers;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/43162
//ÇØ°á

public class Number_43162 {

	public static void main(String[] args) {
		
		
	}

	public int solution(int n, int[][] computers) {
        int answer = 0;
        
        int[] visited = new int[n];
        
        Queue<Integer> q = new LinkedList<Integer>();
      
       for(int i=0; i < n; i++) {
    	   
    	   if(visited[i] ==1) continue; 
    	   
    	   q.add(i);
    	   visited[i] =1;
    		   
    	   answer ++;
    		   
    	   while (!q.isEmpty()) {
    		   int top = q.poll();
    		   for(int j= 0; j<n; j++) {
    			   
    			   if(computers[top][j] == 1 && visited[j] !=1) {
    				   q.add(j);
    				   visited[j] =1;
    			   }
    		   }	   
    	   }   	   
       }     
        return answer;
    }
	
	
}
