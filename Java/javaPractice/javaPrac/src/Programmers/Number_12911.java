package Programmers;

public class Number_12911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(int n) {
      
        int answer= Integer.bitCount(n);
        answer++;
        while(answer != Integer.bitCount(n)) {
        	n++;
        }
        
        return n;
    }
}
