package Programmers;

import java.util.Arrays;


//https://programmers.co.kr/learn/courses/30/lessons/42885
// �ذ�
public class Number_42885 {

	public static void main(String[] args) {
		
		int nums[] = {30,40,40,40 , 70, 80};
		solution(nums, 100);
	}
	
    public static int solution(int[] people, int limit) {
    	
    	
    	Arrays.sort(people); 
  
    	int n = people.length;
    	int answer = 0;
  		
    	int j =0;
    	for(int i =n-1; i>=0; i--) {
    		if(people[i] <= limit/2) {
    			answer += (i-j+1)/2 +  (i-j+1)%2;
    			break;
    		}
    		if(people[i] + people[j] <=limit) {
    			j++;  		
    		}
    		answer++;
    	}
    

    	return answer;
    }
}
