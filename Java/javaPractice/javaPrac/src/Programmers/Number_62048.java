package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/42576
//ÇØ°á
public class Number_62048 {

	public static void main(String[] args) {

	}

	
	 public long solution(int w, int h) {
	        long answer = 1;
	        long bcd = bcd(w,h);
	        answer = (long)w*(long)h -  ((long)w+(long)h - bcd);
	        return answer;
	    }
	 
	public static int bcd(int a, int b) {
		if(a%b ==0)
			return b;	
		return bcd(b, a%b);		
	}
	
}
