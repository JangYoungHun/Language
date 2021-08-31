package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/70128
//ÇØ°á
public class Number_70128 {

	public static void main(String[] args) {
	}

	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        int n= a.length;
	        
	        for(int i =0; i<n; i++) {
	        	answer += a[i]*b[i];
	        }
 
	        return answer;
	    }
}
