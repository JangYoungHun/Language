package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42862
//ÇØ°á
public class Number_42862 {

	public static void main(String[] args) {
		int[] lost = {2,3,4};
		int[] reserve = {3,4,5};
		System.out.println(solution(5,lost,reserve ));
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
    	 int answer;
        int index1 =0;
        int index2 =0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int cnt =0;
        for(int i=0; i<lost.length; i++) {
        	 for(int j=0; j<reserve.length; j++) {
        		 if(lost[i] == reserve[j]) {
        			 lost[i] = -1;
        			 reserve[j] = -1;
        			 cnt++;
        		 }
        	 }
        }      
        answer = n-lost.length+cnt;
        
        while(index1<lost.length && index2 < reserve.length) {
        	
        	if(lost[index1]<0) {
        		index1++;
        		continue;
        	}
        	if(reserve[index2]<0) {
        		index2++;
        		continue;
        	}       	
        	if( Math.abs(lost[index1]-reserve[index2]) <= 1) {
        		answer++;
        		index1++;
        		index2++;
        	} 
        	else if(lost[index1] < reserve[index2]) 
        		index1++;
        
        	else
        		index2++;  	
        }

        return answer;
    }

}
