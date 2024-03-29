package Programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/60058
// �ذ�
public class Number_60058 {


	
	public static void main(String[] args) {
		 System.out.println(solution("()))((()"));
	}
	
    public static String solution(String p) {    
    	if(checkRight(p)) {
    		return p;
    	}
  
        return  recursion(p);
    }
    
   static String recursion(String str) {    	
    	
	   if(str.equals(""))
		   return "";
	   
    	String[] uv = divide(str);
    	String u = uv[0];
    	String v = uv[1];
    	
    	 if(checkRight(u)) {       		 
    		 return u+recursion(v);
    	 }
    	 
    	 else {
    		 u= u.substring(1,u.length()-1);
    		 StringBuilder newU = new StringBuilder(); 
    		 char chs[] = u.toCharArray();
    		 for(int i =0; i<chs.length; i++) {
    			 if(chs[i] == '(')
    				 chs[i] = ')';
    			 else if(chs[i] == ')')
				 chs[i] = '(';
    			 
    			 newU.append(chs[i]);
    		 }
    		 
    		 
    		 return "("+recursion(v) + ")" + newU.toString();
    	 }
    }
    
    static String[] divide(String str) {
    	
    	int cnt1=0;
    	int cnt2 =0;
    	StringBuilder u = new StringBuilder();
    	u.append(str.charAt(0));
    	if(str.charAt(0) == '(') {
    		cnt1++;
    	}
    	else if(str.charAt(0) == ')') {
    		cnt2++;
    	}

    	int index= 1;
    	while(cnt1 != cnt2) {	
    	 	if(str.charAt(index) == '(')
        		cnt1++;
        	else if(str.charAt(index) == ')')
        		cnt2++;
    		u.append(str.charAt(index++));
    	}
    	
    	String[] returnStr = new String[2];
    	returnStr[0] = u.toString();
    	returnStr[1] = str.substring(index,str.length());
    	
    	return returnStr;
    }
    
    static boolean checkRight(String str) {
    	Stack<Character> stack = new Stack<>();
    	for(int i =str.length()-1; i>=0; i--) {
    		stack.add(str.charAt(i));
    	}
    	int cnt1=0;
    	int cnt2=0;
    	while(!stack.isEmpty()) {
    		char ch =stack.pop(); 		
    		if(ch == '(')
        		cnt1++;
        	else if(ch== ')')
        		cnt2++;    	
    		
    		if(cnt1 < cnt2)
    			return false;  		
    	}
    	return true;
    }
    
}
