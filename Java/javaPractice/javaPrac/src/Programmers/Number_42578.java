package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/42578
//ÇØ°á
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Number_42578 {

	public static void main(String[] args) {
		String str[][] = { {"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}   };
		System.out.println(solution(str));
		
	}
	
    public static int solution(String[][] clothes) {
    	
        int answer = 0;
        
    	HashMap<String, Integer> h = new  HashMap<String, Integer>();
    
    	for(int i=0; i<clothes.length; i++) {
    		if(h.containsKey(clothes[i][1]) ){
    			h.put( clothes[i][1], h.get(clothes[i][1])+1);
    		}
    		else
    			h.put( clothes[i][1],1);
    	}
    	
      
        Iterator it = h.values().iterator();

        int nums[] = new int[h.size()];
        int mul =1;
        while(it.hasNext()) {    	
        	mul *= (int)it.next() +1;
        }
       answer = mul-1;
    
        return answer;
    }

}
