package acmicpc.net;

// https://www.youtube.com/watch?v=HFnyxCQe_2g&t=863s
public class Number7 {

	public static void main(String[] args) {	

	}

	
	public int solution(String s) {
		
		
		int answer = s.length();
		int cnt =0;
		for(int i=1; i<s.length()/2; i++) 
		{
		int pos = 0;	
		int len = s.length();
			
		for(; pos+i < s.length();  )
		{
			String unit = s.substring(pos, pos+i);	
			pos =pos+i;
			
			
			
			for(; pos+i < s.length();  )
			{
				if(unit.equals( s.substring(pos, pos+i))) {
					cnt ++;
			 	pos += i; }
				else {
					break;
				}
			}
			
			if(cnt > 0) {
				len -= i*cnt;
				
				if(cnt < 9) len += 1;
				if(cnt < 99) len += 2;
				if(cnt < 999) len += 3;
				else len += 4;
			}
	
		}
		answer = Math.min(answer, len);	
		
		}				return answer;	
	}		
}
