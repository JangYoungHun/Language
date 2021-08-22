package acmicpc.net;

public class Number7_Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			}
			
			
	static int solution(String s) {
		
		
		int answer = s.length();
		int cnt =0;
		
		for(int i=1; i<s.length()/2; i++) 
		{
		 int pos = 0;	
		int len = s.length();
		
		for(; pos < s.length(); ) {
			
			String unit = s.substring(pos,pos+i);
			
			pos += i;
			
			
			if(unit.equals(s.substring(pos,pos+i)))
				cnt++;
				
			
			if(cnt >0) {
			len -= cnt*i;
			
			if(cnt < 9)
				len += 1;
			if(cnt < 99)
				len += 2;
			if(cnt < 999)
				len += 3;
			else len += 4;
			
			}
		
			len = Math.min(len, answer);
		}
	
			}
			
			
			return answer;
	}

}
