package Programmers;


//https://programmers.co.kr/learn/courses/30/lessons/83201
//ÇØ°á
public class Number_83201 {

	public static void main(String[] args) {
		int scores[][] = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		solution(scores);
	}
			
    public static String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<scores.length; i++) {
        	int max = 0;
        	int min = 101;
        	int maxCnt =0;
        	int minCnt =0;
        	
        	  for(int j = 0; j<scores.length; j++) {
        		  if(max < scores[j][i]) {
        			  max = scores[j][i];
        			  maxCnt =1;
        		  }
        		  else if(max == scores[j][i]) {
        			  maxCnt++;
        		  }
        		  
        		  if(min > scores[j][i]) {
        			  min = scores[j][i];
        			  minCnt=1;
        		  }
        		  else if(min == scores[j][i]) {
        			  minCnt++;
        		  }  
              } 
        	  
        	  float sum =0;
        
        	  float avg =0;
        	  if(max == scores[i][i] && maxCnt ==1) {     		
        		  scores[i][i] = 0;  		
        		  for(int k=0; k<scores.length; k++) {
        			  sum+=scores[k][i];
        		  }
        		  avg = sum/(scores[i].length-1);
        	  }
        	  else  if(min== scores[i][i] && minCnt ==1) {
        		  scores[i][i] = 0;  		
        		  for(int k=0; k<scores.length; k++) {
        			  sum+=scores[k][i];
        		  }
        		 avg = sum/(scores[i].length-1);
        	  }
        	  else {
        		  		
        		  for(int k=0; k<scores.length; k++) {
        			  sum+=scores[k][i];
        		  }
        		  avg = sum/scores[i].length;
        	  }
        	  
        	if(avg>=90) 
        		sb.append("A");
        	else if(avg>=80) 
        		sb.append("B");
        	else if(avg>=70) 
        		sb.append("C");
        	else if(avg>=50) 
        		sb.append("D");
        	else
        		sb.append("F");
        } 
        	
       
        
        return sb.toString();
    }
}
