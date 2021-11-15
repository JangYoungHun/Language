package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//ÇØ°á
public class Number_17684 {

	public static void main(String[] args) {
		String msg = "TOBEORNOTTOBEORTOBEORNOT";
		solution(msg); 
	}
	
	 public static int[] solution(String msg) {
	        List<Integer> list = new ArrayList<Integer>(100);
	        int n = msg.length();
	        int num = 27;
	        
	        HashMap<String, Integer> h = new HashMap<String, Integer>();
	        
	        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        for(int i =1; i<27; i++) {
	        	h.put(String.valueOf(str1.charAt(i-1)),i);
	        }
	      
	 
	        for(int i =0; i<n; i++) {
	        	String cur= "";
	            for(int j =i+1; j<n+1; j++) {
	        	   	String str = msg.substring(i,j);
	        	   	if(h.get(str) != null) {
	        	   		cur = str;
	        	   		if(j == n) {
	        	   			list.add(h.get(cur));  
	        	   			i += str.length();
	        	   			break;
	        	   		}
	        	   	}
	        	   	else {
	        	   		list.add(h.get(cur));  
	        	   		h.put(str, num++);	    
	            	   	if(str.length() >1)
	        	   			i += str.length()-2;
	        	   		break;
	        	   	}
		        }   	

	        }
	        
	        int answer[] = new int[list.size()]; 
	        for(int i=0; i<list.size(); i++) {
	        	answer[i] = list.get(i);
	        } 
	        return answer;
	    }
}
