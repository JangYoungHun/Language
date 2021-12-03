package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//https://programmers.co.kr/learn/courses/30/lessons/42883
// 마지막 12 번 테스트케이스 시간초과 
// 다른 풀이 Number_42883_2 확인
public class Number_42883 {

	public static void main(String[] args) {
		 solution("4177252841", 4);
	}

    public static String solution(String number, int k) {
    	
    	StringBuilder sb = new StringBuilder();
    	char chs[] = number.toCharArray();
    	Arrays.sort(chs);
    	
    	int start =0;
    	int end = number.length();
    	while(k!=0) {	
    		Loop1:
    	for(int i = chs.length-1; i>=0; i--) {
    		for(int j =start; j<end; j++) {
    			if(chs[i] == number.charAt(j)) {
    				if(j-start <= k) {
    					k -= j-start;
    					start = j+1;
    					sb.append(chs[i]);
    					if(k==0) {
    						for(int p=j+1; p<end; p++) {
    							sb.append(number.charAt(p));
    						}
    					}
    					break Loop1;
    				}
    				else
    					break;
    			}
    		}
    	}
    	
    	}
    
    	return sb.toString();
    }
    

    
}