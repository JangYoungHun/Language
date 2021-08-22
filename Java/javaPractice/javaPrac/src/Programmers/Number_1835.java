package Programmers;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/1835
//ÇØ°á
public class Number_1835 {
	static char character[] = {'A', 'C', 'F', 'J', 'M', 'N','R', 'T'};
	static int cnt =0;
	
	public static void main(String[] args) {
		String data[] = {"N~F=0", "R~T>2"};
		solution(2,data);
		System.out.println(cnt);

	}
	
    public static int solution(int n, String[] data) {
        int answer = 0;
       
       List<Character> list = new ArrayList<Character>();
        order(n, data, list);        			
        return answer;    	
    }
 
    public static void  order(int n, String[] data, List<Character> list) {
    	
    	if(list.size() == 8) {
    		
    		for(int i =0; i<n; i++) {
    			char ch1 = data[i].charAt(0);
    			char ch2 = data[i].charAt(2);
    			char operator = data[i].charAt(3);
    			int dis1 = (int)(data[i].charAt(4)-'0');
    			
    			int index1 = list.indexOf(ch1);
    			int index2 = list.indexOf(ch2);
    			int dis2 = Math.abs(index1-index2)-1;
    			
    			if(operator == '>') {
    				if( dis1 >= dis2)
    					return;
    				
    				if(dis2 > dis1 && i==n-1) {
    					cnt++;
    				}
    			}
    				
    			else if(operator == '<') {
    				if( dis1 <= dis2)
    					return;
    				
    				if(dis2 < dis1 && i==n-1) {
    					cnt++;
    				}
    			}
    				
    			else if(operator == '=') {
    				if( dis1 != dis2)
    					return;
    				
    				if(dis2 == dis1 && i==n-1) {
    					cnt++;
    				}
    			}    			
    		}
		
    		return;
    	}
    	
    	for(int i=0; i<8; i++) {
    		if(!list.contains(character[i])) {
    			list.add(character[i]);
    			order( n,data,  list);
    			list.remove(list.size()-1);
    		}
    	}
   
    	
    }
    
}
