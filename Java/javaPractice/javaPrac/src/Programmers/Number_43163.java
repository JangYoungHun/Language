package Programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/43163
// ÇØ°á
public class Number_43163 {
	
	boolean visited[];
	int result =0;
	
	 public int solution(String begin, String target, String[] words) {
	       
		 int n =  words.length;
		 
	     visited = new boolean[n+1]; 
	     dfs( begin,target,words,0);
	     int answer = result;
	        return answer;
	    }
	 
	 
	 void dfs(String current, String target, String words[], int cnt) {
		 
		 if(target.equals(current)) {
			 if(result ==0)
				 result = cnt;
			 result = Math.min(result, cnt);
		 }
		 for(int i=0; i<words.length; i++) {
			 int dup = 0;
			 if(visited[i]) continue;
			 for(int j=0; j<current.length(); j++) {
				 if(current.charAt(j) != words[i].charAt(j))
					 dup++;
				 if(dup >1) break;
			 }
			 
			 if(dup == 1)
				 if(!visited[i]) {
					 visited[i] =true;
					 dfs(words[i], target, words, cnt+1);
					 visited[i] =false;
				 }		
			 }
		 
	 }
	 
	 
	 
	 
}
