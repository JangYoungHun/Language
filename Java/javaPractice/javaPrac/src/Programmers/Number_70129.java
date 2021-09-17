package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/70129
//ÇØ°á
public class Number_70129 {

	public static void main(String[] args) {
		solution("110010101001");

	}

	   public static int[] solution(String s) {
	       
	        int result1 = 0;
	        int result2= 0;
	        while(!s.equals("1")) {
	        	int cnt =0;
	        	
	        	for(int i =0; i< s.length(); i++) {
	        		if(s.charAt(i) == '1') {
	        			cnt++;
	        		}
	        	}
	        	 result2 += s.length()-cnt;
	        	StringBuilder sb = new StringBuilder();
	        	
	        	while(cnt !=0) {
	        		   sb.append(cnt%2);
	        		   cnt  /= 2;
	        	}
	        	s= sb.toString();
	        	result1++;
	        }
	        
	        int[] answer = {result1, result2};
	        return answer;
	    }
}
