package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//https://programmers.co.kr/learn/courses/30/lessons/42586
//ÇØ°á
public class Number_42586 {

	public static void main(String[] args) {
        int[] answer = {};
        int[] progresses = {95, 90, 99, 99, 80, 99}; 
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int result[] = new int[100]; 
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        int left =0;
        int right = -1;
        for(int i=0; i <progresses.length; i++) {   	
        	list.add(progresses[i]); 
        	right ++;
        }
        
        int cnt = 0;
        int resultCnt=0;
        int index =0;
        while(right>=left) {
        	if(list.get(left) >= 100) {        		
        		cnt++;
        		left++;

        	}
        	else {
        		if(cnt !=0) {
        			result[index++] = cnt;
        			resultCnt++;
        			cnt =0;
        		}
  		
        		for(int i=left; i<=right; i++) {
        			list.set(i, list.get(i)+speeds[i]);
        		}
        		
        	}
        	
        }
        result[index] = cnt;
        answer = new int[resultCnt+1];
        
    
        for(int i=0; i <resultCnt+1; i++) { 
   
        	answer[i] = result[i];
        }
        
        System.out.println(Arrays.toString(answer));
        
	}

        
        
    }
	

