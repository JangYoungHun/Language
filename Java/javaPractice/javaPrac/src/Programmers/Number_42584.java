package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42584
//ÇØ°á
public class Number_42584 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 3};
		
		System.out.println( Arrays.toString( solution(arr))  ); 
	}

	
    public static  int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {     	   
        	int cnt =0;
            for(int j=i+1; j<prices.length; j++) {
            	cnt++;
            	if(prices[i] > prices[j])
            			break;   		
      	
            }
            answer[i] = cnt;   	
        }
    
        
        return answer;
    }

}
