package Programmers;

public class Number_12904 {

	public static void main(String[] args) {
		solution("abacde");

	}
	
    public static int solution(String s)
    {
        int answer = 1;
        int n = s.length();
        
        for(int i =n; i>=2; i--) {
        	for(int start =0; start+i<=n; start++) {
        		int len = check(s, start, start+i-1);
        		if(len != -1) {
        			return len;
        		}
            }
        }
        return answer;
    }
    
   public static int check(String str, int left, int right) {
	   int len = right - left+1;
	   while(left<right) {
		   if(str.charAt(left) != str.charAt(right))
			   return -1;
		   
		   left ++;
		   right --;
	   }
	   return len;
   }
}
