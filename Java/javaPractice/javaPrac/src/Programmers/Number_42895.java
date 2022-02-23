package Programmers;




public class Number_42895 {
	
	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		int n = 5;
		int number=12;
		solution(n,number);
	}
	
    public static int solution(int N, int number) {
        recur(N, number,0, 0);      
        if(answer==Integer.MAX_VALUE)
        	answer = -1;
        return answer;
    }
    
    
    public static void recur(int n , int number, int num ,int cnt) {
    	if(cnt>8)
    		return;
    	
    	if(num==number)
    		answer=Math.min(answer, cnt);
    	int nn=0;
    	for(int i =0; i<8; i++) {
    		nn= nn*10+n;
    		recur(n ,number, num+nn ,cnt+1+i);
    		recur(n ,number, num-nn ,cnt+1+i);
    		recur(n ,number, num/nn ,cnt+1+i);
    		recur(n ,number, num*nn ,cnt+1+i);
    	}
    	}
    
}
