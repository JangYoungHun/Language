package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//https://programmers.co.kr/learn/courses/30/lessons/42587
//ÇØ°á

public class Number_42587 {

	public static void main(String[] args) {
		int arr[] = {2, 1, 3, 2};
		 System.out.println(solution(arr, 2));
	}
public static int solution(int[] priorities, int location) {
        
        int answer = 0;
        
        Queue<Integer> q= new LinkedList();
        for(int i=0; i<priorities.length; i++) {
        	q.add(priorities[i]);
        } 

        Arrays.sort(priorities);
        int index =priorities.length-1;

        int order =1;
        while(!q.isEmpty()) {
        	
        	location = location<0 ? location+q.size() : location;
        	
        	int top = q.poll();
       	
        	if(top == priorities[index]) { 	
        		if( location ==0)
        			break;   		
        		index--;
        		order++;
        	}
        	else {
        		q.add(top);
        	}
        	
        	location --;
        }
        answer = order;
        return answer;
    }
}
