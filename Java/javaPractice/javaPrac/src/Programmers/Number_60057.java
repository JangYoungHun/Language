package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/60057

public class Number_60057 {
	public static void main(String args[]) {
		solution("aabbaccc");
	}

	 public static int solution(String s) {
	        
		 	int answer = s.length();

		 	
		 	for(int i=1; i<= s.length()/2; i++) {
	
		 		 int len = s.length();
		 		 int pos = 0;
		 		
		 		for(; pos + i <= s.length();) {
		 			String str1 = s.substring(pos,pos+i);
		 			pos+=i;
		 			int cnt =0;
		 			for(;pos+i<=s.length();) {
		 				if(str1.equals(s.substring(pos,pos+i))) {
		 					pos += i;
		 					cnt++;
		 				}
		 				else
		 					break;			
		 			}
		 			
		 			if(cnt >0) {
		 				len -= cnt*i;
		 				
			 			if(cnt<9)
			 				len+=1;
			 			else if(cnt<99)
			 				len+=2;
			 			else if(cnt<999)
			 				len+=3;
			 			else
			 				len+=4;
		 			}
		 			
		 		}
		 		
		 		answer = Math.min(answer, len);
		 		
		 	}
		 	
		 	
	        
	        return answer;
	    }
	 
}
