package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12985
//ÇØ°á
public class Number_12985 {

	public static void main(String[] args) {
		 solution( 8,  4, 7);
	}

    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        int A = a;
        int B =b;
        
        while(true) {
         answer ++;
         int num1 = A/2;
         int num2 = B/2;
         A = (A > 2*num1)? num1+1 : num1;
         B = (B > 2*num2)? num2+1 : num2;

         
         if(A==B)
        	 break;
        }
        
        return answer;
    }
}
