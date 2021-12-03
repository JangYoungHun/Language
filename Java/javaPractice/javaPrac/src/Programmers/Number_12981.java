package Programmers;

import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/12981
//ÇØ°á
public class Number_12981 {

	public static void main(String[] args) {
		
	}
	   public int[] solution(int n, String[] words) {
		   int[] answer = {0,0};
	        
	        int player = 1;
	        int m = words.length;
	        int round =1;
	        String last = "";
	        
	        HashMap<String, Boolean> h = new HashMap<String, Boolean>();
	        
	       for(String word : words) {
	    	   if(h.get(word) != null)
	    		   break;
	    	  if(!word.startsWith(last))
	    		  break;
	    	  
	    	   h.put(word, true);
	    	   
	    	   last = word.substring(word.length()-1,word.length());
	    	   
	    	   player++;
	    	   if(player > n) {
	    		   player -= n;
	    		   round ++;
	    	   }
	       }
	      
	       if(player == 1 && round > words.length/n)
	    	   return answer;
	       
	       answer[0] = player;
	        answer[1] = round;
	        return answer;
	    }
}
