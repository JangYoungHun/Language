package Programmers;


import java.util.HashMap;
import java.util.regex.Pattern;

//https://programmers.co.kr/learn/courses/30/lessons/17677
//ÇØ°á
public class Number_17677 {

	public static void main(String[] args) {
	 
	
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		 solution(str1, str2);
	}
    public static int solution(String str1, String str2) {
    	
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();
    	
        
        HashMap<String, Integer> h1 = new HashMap<String, Integer>();  
        HashMap<String, Integer> h2 = new HashMap<String, Integer>();
        
        String pattern = ".{2}";

         for(int i=0; i<str1.length()-1;i++) {
        	 String str = str1.substring(i,i+2);
        	 if(Pattern.matches("[a-z]{2}", str)) {
        	 	if(h1.get(str) == null) {
        	 		h1.put(str, 1);
        	 		continue;
        	 }
        	 h1.put(str, h1.get(str)+1);
        	 }
         }
         for(int i=0; i<str2.length()-1;i++) {
        	 String str = str2.substring(i,i+2);
        	 if(Pattern.matches("[a-z]{2}", str)) {
        	 if(h2.get(str) == null) {
        		 h2.put(str, 1);
        		 continue;
        	 }
        	 h2.put(str, h2.get(str)+1);
        	 }
         }
        
         if(h1.size()==0 && h2.size() ==0) {
        	 return 65536;
         }
         
       
         float num1 = 0;
         float num2 = 0;
         
         for(String key : h1.keySet()) {
        	 try {
        	num1+= Math.min(h1.get(key), h2.get(key));
        	num2 += Math.max(h1.get(key), h2.get(key));
        	 }
        	 catch(Exception e){
        		 num2 += h1.get(key);
        		 continue;
        	 }
         }
   
         for(String key : h2.keySet()) {
        	 if(h1.get(key) ==null) {
        		 num2 += h2.get(key);
        	 }
         }

        int answer = (int)((num1/num2)*65536);
         
        return answer;
    }
}
