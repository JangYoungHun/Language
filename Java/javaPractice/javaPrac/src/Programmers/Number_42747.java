package Programmers;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42747
//해결

public class Number_42747 {

	class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations);
	        
	        int index = citations.length -1;
	        
	        while(index >= 0){
	            // 0 1 3 5 6 
	            if(answer <  citations[index]){
	                System.out.println("확인");
	                 answer ++;
	            }
	            else{
	                break;
	            }           
	            index--;
	        }
        return answer;
	    }
	}
}
