package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/72410
//ÇØ°á
public class Number_72410 {

	public static void main(String[] args) {
		
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm") );

	}
	
	   public static String solution(String new_id) {
	        String answer = new_id.toLowerCase();
	        
	   
	       answer =  answer.replaceAll("[[^0-9a-z_.-]]", "");
	       
	       while(answer.contains("..")) {
	       answer =  answer.replace("..", ".");									
	       }
	       answer = removeFEDot(answer);	       
        
	       
	       if(answer.equals(""))  {
	        	answer = "a";
	        }
	        
	        if(answer.length()>15) {
	        	answer = answer.substring(0,15);
	        	answer = removeFEDot(answer);	    
	        }
	        
	        if(answer.length() <3) {
	        	
	        	while(answer.length() <3) {
	        		answer += answer.charAt(answer.length()-1);
	        	}
	        }
	        
	        return answer;
	        
	  }
	   
	   static String  removeFEDot(String answer){
	       if(answer.length() >0 && answer.charAt(0) == '.') {
	    	   answer = answer.substring(1, answer.length());
	       }
	       
	       if(answer.length() >0 && answer.charAt(answer.length()-1) == '.') {
	    	   answer = answer.substring(0, answer.length()-1);
	       }	       
	       return answer;
	   }
	   
}
