package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/76501

public class Number_76501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int solution(int[] absolutes, boolean[] signs) {
		  int n = absolutes.length;
		  
		  int answer = 0;
		  for(int i=0; i<n; i++) {
			  if(signs[i])
				answer += absolutes[i];  
			  else
				 answer += absolutes[i] * (-1);  
		  }
		  
	      
	        return answer;
	    }
	  
}
