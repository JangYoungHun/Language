package Programmers;

public class Number_12938 {

    public static int[] solution(int n, int s) {
    	int[] answer = new int[n];
        int base = s/n;
        int left = s%n;
        if(base == 0) {
        	return new int[] {-1};
        }
        
        for(int i =0; i<n; i++) {
        	if(i < n-left) {
        		answer[i] = base;
        	} else {
        		answer[i] = base+1;
        	}      	
        }
        return answer;
    }
}
