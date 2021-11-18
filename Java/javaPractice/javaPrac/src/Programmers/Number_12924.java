package Programmers;

//ÇØ°ás
public class Number_12924 {

	public static void main(String[] args) {
		 solution(15);
	}
	
	   public static int solution(int n) {
	        int answer = 1;
	        
	        for(int i =1; i<=n/2+1; i++) {
	        	int sum = 0;
	        	 for(int j =i; j<=n/2+1; j++) {
	 	        	sum += j;
	 	        	if(sum > n)
	 	        		break;
	 	        	else if(sum == n) {
	 	        		answer ++;
	 	        		break;
	 	        	}
	 	        }
	        }
	        return answer;
	    }
}
