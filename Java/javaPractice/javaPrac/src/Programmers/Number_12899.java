package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12899
//ÇØ°á
public class Number_12899 {

	public static void main(String[] args) {
	System.out.println(solution(10));

	}
	
    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
       
        
        while(n>0) {
        	int num = n%3;
        	if(num == 0) {
        		n = n/3 -1;
        	}
        	else
        		n=n/3;
        	
        	switch(num) {
        	case 0 : answer.append("4"); break;
        	case 1 : answer.append("1"); break;
        	case 2 : answer.append("2"); break;
        	}
        }
        
        answer = answer.reverse();
        return answer.toString();
    }
    
}
