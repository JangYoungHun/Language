package Programmers;

import java.util.Arrays;
import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/42577
//ÇØ°á
public class Number_42577 {

	public static void main(String[] args) {
	
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
	}
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
       
        HashMap<String, Boolean> h = new HashMap<String, Boolean>();
        
        for(int i=0; i<phone_book.length; i++) {
        	 h.put(phone_book[i], true);
        }
        
       
        for(int i=0; i<phone_book.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j=0; j<phone_book[i].length(); j++) {
        		
              	 sb.append(phone_book[i].charAt(j));
              	 String str =sb.toString();
              	 if(h.containsKey(str) && !str.equals(phone_book[i])  ) {
              		  answer = false;
              		  break;
              	 }
            
        	}
       }
       
        return answer;
    }
}
