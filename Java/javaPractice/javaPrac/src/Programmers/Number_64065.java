package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


//https://programmers.co.kr/learn/courses/30/lessons/64065
//ÇØ°á
public class Number_64065 {

	public static void main(String[] args) {
		
		String str = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		solution(str); 
	}

	
    public static int[] solution(String s) {
    	
    	
    	String str = s.replace("}", "");
    	str = str.replace("{", "");
    	
    	String strs[] = str.split(",");
    	
    	HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i<strs.length; i++) {
    		int num = Integer.parseInt(strs[i]);
    		if(h.get(num) == null) {
    			h.put(num, 1);
    		}
    		else
    			h.put(num, h.get(num)+1);  				
    	}
    	
    	
    	
    	
    	List<Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(h.entrySet());
    	Collections.sort(list,new Comparator<Entry<Integer, Integer>>() {
    		@Override
    		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
    			// TODO Auto-generated method stub
    			return o2.getValue() - o1.getValue();
    		}
		});

        int[] answer = new int[list.size()];
        
        for(int i =0; i<list.size(); i++) {
        	answer[i] = list.get(i).getKey();
        }
 
        return answer;
    }
    
}
