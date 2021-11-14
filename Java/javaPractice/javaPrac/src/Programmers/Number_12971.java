package Programmers;

import java.util.ArrayList;

//ÇØ°á
public class Number_12971 {
	
	
	public static void main(String[] args) {
		int sticker[] = {14, 6, 5, 11, 3, 9, 2, 10};
		System.out.print(solution(sticker));
		
	}
	
    public static  int solution(int sticker[]) {
    	int n = sticker.length;
    	int answer = 0;
    	
    	if(n==1)
    		return sticker[0];
    	
    	else if(n==2)
    		return Math.max( sticker[0],  sticker[1]);
    	
    	int sum1 = sticker[1];
    	
    	for(int i=3; i<n-1; i++) {
    		
    	}
    	
    	int d[][] = new int[n-1][2];
    	d[0][1] =sticker[0] ;
    	d[0][0] = 0;
    	d[1][1] = sticker[1];
    	d[1][0] = Math.max(d[0][1], d[0][0]);
    	
    	for(int i =2; i<n-1; i++) {
    		d[i][0] = Math.max(d[i-1][1] , d[i-1][0]);
    		d[i][1] =  Math.max(d[i-2][1] , d[i-2][0]) + sticker[i];
    	}
    	
    	answer = Math.max(d[n-2][0], d[n-2][1]);
    	
    	n--;
    	int sticker2[] = new int[n];
    	
    	for(int i = 0; i<n; i++) {
    		sticker2[i] = sticker[i+1];
    	}
    	
    	int d2[][] = new int[n][2];
    	d2[0][1] =sticker2[0] ;
    	d2[0][0] = 0;
    	d2[1][1] = sticker2[1];
    	d2[1][0] = Math.max(d2[0][1], d2[0][0]);
    	
    	for(int i =2; i<n; i++) {
    		d2[i][0] = Math.max(d2[i-1][1] , d2[i-1][0]);
    		d2[i][1] =  Math.max(d2[i-2][1] , d2[i-2][0]) + sticker2[i];
    	}
    	
    	answer = Math.max(answer, Math.max(d2[n-1][0], d2[n-1][1]));
    	
        return answer;
    }


}
