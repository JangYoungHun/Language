package Programmers;

import java.util.HashMap;
import java.util.Map;

//¹ÌÇØ°á
public class Number_77486 {
	
	
	public static void main(String[] args) {
		String[] enroll ={"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral ={"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller  ={"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		solution(enroll, referral, seller, amount);
	}
	
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
      
        for(int i =0; i<referral.length; i++) {
        	if(referral[i].equals("-") ) {
        		dfs(i, enroll, referral, seller, amount,answer);
        	}
        }
              
        return answer;
    }
    
    
    
    public static int dfs(int index, String[] enroll, String[] referral, String[] seller, int[] amount, int[] answer) {  	
    	
    	String referralName = enroll[index];
    	int pay =0;
    	int mine =0;
    	
    	for(int i=0; i<seller.length; i++) {
    		if(referralName.equals(seller[i])) {
        		int revenue =  amount[i] * 100;   
            	pay += revenue / 10;
            	mine += revenue - pay ;
    		}

    	}

    	for(int i =0; i<referral.length; i++) {
    		if(referral[i].equals(referralName)) {
    			int money = dfs(i, enroll, referral, seller, amount, answer);
    				pay += money/10;
        			mine += money - money/10;
    			 		
    		}
    	}
    	
    	answer[index] = mine;
    	
    	return pay;
    	
    }
}
