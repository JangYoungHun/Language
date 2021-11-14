package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12979
public class Number_12979 {
	public static void main(String args[]) {
	
	}
	  public int solution(int n, int[] stations, int w) {
	        int answer = 0;
	        int start = 1;
	        
	        for(int i : stations) {
	        	int width = i-w-start;
	        	if(width > 0) {
	        		answer += width%(w*2+1) ==0 ? width/(w*2+1) : width/(w*2+1) + 1;
	        	}
	        	start = i+w+1;
	        }
	        
	        int width = n-start+1;
        	if(width > 0) {
        		answer += width%(w*2+1) ==0 ? width/(w*2+1) : width/(w*2+1) + 1;
        	}
     
	        return answer;
	    }
}
