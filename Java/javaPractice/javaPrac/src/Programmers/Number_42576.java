package Programmers;

import java.util.HashMap;
//https://programmers.co.kr/learn/courses/30/lessons/42576
//ÇØ°á
public class Number_42576 {

	public static void main(String[] args) {
		System.out.println( solution(new String[]{"mislav", "stanko", "mislav", "ana","mislav"},new String[]{"stanko","mislav", "ana", "mislav"} ));
		
	}
	
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        HashMap<String, Integer> h = new HashMap<>();
	        
	        for(int i=0; i<participant.length;i++) {
	        	h.put(participant[i], 0);
	        }
	        
	        for(int i=0; i<completion.length;i++) {
	        	h.put(completion[i], h.get(completion[i])+1);
	        }
	        
	        for(int i=0; i<participant.length;i++) {
	        	if(h.containsKey(participant[i]) && h.get(participant[i]) >0) {
	        		h.put(participant[i], h.get(participant[i])-1);
	        		
	        	}       	
	        	else
	        		answer = participant[i];
	            }
	        

	        return answer; 
	    }

}
