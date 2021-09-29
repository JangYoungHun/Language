package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/42842
//ÇØ°á
public class Number_42842 {

	public static void main(String[] args) {
		

	}
	
	  public int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	        int x =0;
	        int y =0;
	        
	        for(x=1; x<yellow; x++) {
	        	if(yellow%x ==0) {
	        		y = yellow/x;   	
	        		
	        		if((x+2)*(y+2) - yellow == brown) {
	        			break;
	        		}
	        	}        	
	        }
	        
	        answer[0] = (x > y) ? x+2 : y+2;
	        answer[1] = (x > y) ? y+2 : x+2;
      
	        return answer;
	    }
	
}
