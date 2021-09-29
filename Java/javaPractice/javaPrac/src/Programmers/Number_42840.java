package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42840
//해결
public class Number_42840 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		System.out.println( Arrays.toString( solution(arr))  ); 
		

	}
    
	   
    public static int[] solution(int[] answers) {
        int[] answer;
        
        // 수포자 1번 1 2 3 4 5 반복
        // 수포자 2번 2 1 2 3 2 4 2 5 반복
        // 수포자 3번 3 3 1 1 2 2 4 4 5 5 반복 
        
        int p1[] = {1,2,3,4,5};
        int p2[] = {2,1,2,3,2,4,2,5};
        int p3[] = {3,3,1,1,2,2,4,4,5,5};
        
        int corrects[] = {0,0,0};
     
        for(int i=0; i<answers.length; i++){              
            if(answers[i] == p1[i%p1.length])
                corrects[0] += 1;
            if(answers[i] == p2[i%p2.length])
                corrects[1] += 1;      
            if(answers[i] == p3[i%p3.length])
                corrects[2] += 1;    
        }
        
        int max =0;
        for(int i=0; i<3; i++){ 
        	max  = Math.max(max , corrects[i]);
        }		
        
        int cnt = 0;
        for(int i=0; i<3; i++){ 
        	if(max == corrects[i])
        		cnt++;   		
        }		
        
        answer = new int[cnt];
        int index = 0;
        for(int i=0; i<corrects.length; i++){ 
        	if(max == corrects[i])
        		answer[index++] = i+1;   		
        }	
        
        
        return answer;
    }
}
