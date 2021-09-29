package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42839
//ÇØ°á

public class Number_42839 {
	static int N;
	static int cnt =0;
	static List list = new ArrayList<Integer>();
	static List duplication = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		System.out.println(solution("17") );

	}

    public static int solution(String numbers) {
        int answer = 0;
        N =numbers.length();
    	for(int i =1; i<=N; i++) {
    		 pick(numbers,0, i);
    	}
       
        answer = cnt;
        
        return answer;
    }
	
    
    
	static void pick(String numbers, int count, int M) {
		
		if(count == M) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<M; i++) {
				sb.append( numbers.charAt((int)list.get(i)) );
			}
			int num = Integer.parseInt(sb.toString());
			if(!duplication.contains(num)) {
				duplication.add(num);
			if(num ==1 || num ==0)
			  return;		
			
			else if(num == 2) {
				cnt++;
				return;
			}
			
			
			for(int i=2; i < (int)Math.sqrt(num)+1; i++ ) {
				if(num%i == 0)
					return;
			}			
			cnt++;
			}
			
			return;
		}
		
		for(int i =0; i<N; i++) {
			if(!list.contains(i)) {
				list.add(i);			
				pick(numbers,count+1, M);
				list.remove(list.size()-1);
			}
		}
			

		
	}
	
	
	
	
	
}
