package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/43238
//참고 https://iamheesoo.github.io/blog/algo-prog43238
//해결 
public class Number_43238 {

	public static void main(String[] args) {
		
		int n =6;
		int times[] = {7,10};
		solution(n, times);

	}
	   public static long solution(int n, int[] times) {
	       
	       Arrays.sort(times);
	   
	       long left = 0;
	       long right =(long)times[times.length-1]*(long)n;
	       long mid=0;
	       long answer = right;
		   long sum;
		 
		   
	       while(left <=right) {
	    	   sum = 0;
	    	  mid = (right+left)/2;
	    	   
	    	  for(int i =0; i<times.length; i++) {
	    		  sum += mid/times[i];
	    	  }
	    	  if(sum >=n) {	    	
	    		  answer = Math.min(answer,mid);
	    		  right = mid-1;		
	    	  }
	    	  else {
	    		  left = mid+1;
	    	  }	   
	       }	   
	        return answer;
	    }
	   
	   
}
