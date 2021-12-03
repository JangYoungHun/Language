package Programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://programmers.co.kr/learn/courses/30/lessons/67257
// ÇØ°á
public class Number_67257 {

	public static void main(String[] args) {
		String str = "2-990-5+2";
		System.out.println(solution(str));
	}
	
	 public static long solution(String expression) {
	        long answer = 0;
	        int n = 6;
	        int m = 3;
	        // + : -1,  -  :  -2,   * : -3
	        int[][] op = {
	        		{-1, -2, -3},
	        		{-1, -3, -2},
	        		{-2, -1, -3},
	        		{-2, -3, -1},
	        		{-3, -2, -1},
	        		{-3, -1, -2}
	        };
	        List<Long> list = new ArrayList<Long>();

	        String pattern = "([0-9]+)([-*+]*)";
	        Pattern p = Pattern.compile(pattern);
	        Matcher matcher = p.matcher(expression);
	        while(matcher.find()) {
	        	list.add(Long.parseLong(matcher.group(1)));
	        	
	        	switch(matcher.group(2)) {        		
	        	case "+" : list.add(-1L);  break;
	        	case "-" :  list.add(-2L); break;
	        	case "*" :  list.add(-3L); break;
	        	}       	
	        }
       
	        for(int i=0; i<n; i++) {
	        	Deque<Long> q1 = new ArrayDeque<Long>();
	        	Deque<Long> q2 = new ArrayDeque<Long>();
	        	
	        	
	        	q1.addAll(list);
	        	
	        	for(int j=0; j<m; j++) {
	        		int operator = op[i][j];
	        		while(!q1.isEmpty()) {
	        			long top =q1.poll();
	        			if(top == operator) {
	        				long  top1 = q2.pollLast();
	        				long top2 = q1.poll();
	        				long result = 0;
	        				switch(operator) {        			
	        					case -1 : result = top1+top2; break; 
	        					case -2 : result =top1-top2; break;
	        					case -3 : result = top1*top2; break;
	        				}
	        				q2.add(result);
	        			}
	        			else {
	        				q2.add(top);
	        			}
	        		}    		
	        		Deque<Long> temp = q1;
	        		q1 = q2;
	        		q2 = temp;        	

	        	}	        	
	        	answer = Math.max(answer, Math.abs(q1.poll()));
	        	
	        }    
	        return answer;
	    }
}
