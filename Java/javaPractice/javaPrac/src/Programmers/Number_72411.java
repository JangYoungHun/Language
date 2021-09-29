package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//https://programmers.co.kr/learn/courses/30/lessons/72411
//ÇØ°á
public class Number_72411 {

	static HashMap<String, Integer> h = new HashMap<String, Integer>();
	public static void main(String[] args) {
		String strs[] = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int course[] = {2,3,4};
		System.out.println(Arrays.toString(solution(strs, course))) ;
	}
	
    public static  String[] solution(String[] orders, int[] course) {
       
        
        for(int i=0; i<orders.length; i++) {
        	char[] ch = orders[i].toCharArray();
        	Arrays.sort(ch);
        	String order = new String(ch);
        	 getOrder(order, course);
        }
        
        List<String> menuList = new ArrayList<String>();
    
         for(int i =0; i<course.length; i++) {
        	 int max = 0;
        	
             for(Entry<String, Integer> e : h.entrySet()) {
            	if(e.getKey().length() == course[i] && e.getValue() >= 2) {
            		max= Math.max(max, e.getValue());
            	}
             }
             for(Entry<String, Integer> e : h.entrySet()) {
             	if(e.getKey().length() == course[i] && e.getValue() == max) {
             		menuList.add(e.getKey());
             	}
              }
             
         }
         
         
         menuList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
         });

        
         
        return menuList.toArray(new String[menuList.size()]);
    }
    
    
    static void getOrder(String order, int course[]) {
    	
    	for(int i =0; i<course.length; i++) {
    	
    		List<Integer> list = new ArrayList<Integer>();
     		createSet(list,order,order.length(),course[i],0,0);
    	
    	}
    	
    }
    
    static void createSet(List<Integer> list, String order , int n, int m, int start,  int count){
    	
    	if(count == m) {
    		StringBuilder sb = new StringBuilder();
    		for(Integer i : list) {
    			sb.append(order.charAt(i));
    		}
    		String key = sb.toString();
    		if(h.get(key) == null) {
    			h.put(key, 1);
    		}
    		else
    			h.put(key, h.get(key) + 1);  	
    		
    		return;
    	}
    	
    	for(int i =start; i<n; i++) {
    		if(!list.contains(i)) {
    			list.add(i);
    			createSet(list,order,n,m,i,count+1);
    			list.remove(list.size()-1);
    		}
    	}
 	
    }

    
}
