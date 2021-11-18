package Programmers;

//ÇØ°á
public class Number_17687 {

	public static void main(String[] args) {

		solution(16, 16, 2, 1);
	}
	
    public static String solution(int n, int t, int m, int p) {
    	char chs[] = {'A','B','C','D','E','F'};
    	StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        while(sb.length() < m*t) {
        	int num = i;
        	StringBuilder sb2 = new StringBuilder();
        	while(true) {
        		if(num%n >9)
        			sb2.append(chs[num%n - 10]);
        		
        		else
        			sb2.append(num%n);
        			
         		if(num/n <n) {
         			
        			if(num/n != 0) {
        				if(num/n >9)
        					sb2.append(chs[num/n-10]);
        				else
        					sb2.append(num/n);          			
        			}		
        			break;
        		}
         		num/=n;
        	}       	
        	sb.append(sb2.reverse());
        		i++;
        }
        
        
        int index = p-1;
        for(int j =1; j<=t; j++) {
        	answer.append(sb.charAt(index));
        	index += m;
        }
        
        
        return answer.toString();
   }
    

}
