package Programmers;

public class Number_82612 {
//https://programmers.co.kr/learn/courses/30/lessons/82612
//ÇØ°á
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2500, 1000000,2500));
	}
	public static  long solution(int price, int money, int count)
	{
	    long answer = (long)money;
	    
	    												
	    long total = (long)price*((long)count*(count+1))/2;									
	    
	    
	    return total >answer ? total - answer : 0;
	}
}
