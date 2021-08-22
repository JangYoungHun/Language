package Programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42888
//해결
public class Number_42888 {

	public static void main(String[] args) {
		
		String strs[] = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		solution(strs); 
	}
	
	static class Record{
		String id;
		String enter;
		
		public Record(String enter,String id) {
			this.id = id;
			this.enter = enter;
		}
	}
	
	
	 public static String[] solution(String[] record) {
	       
	        HashMap<String, String> h = new HashMap<String, String>();
	        Queue<Record> q = new  LinkedList<Record>();
	        
	        for(String str : record) {	        	
	        	String strs[] = str.split(" ");
	        	if(strs[0].equals("Change")) {
	        	h.put(strs[1], strs[2]);
	        	}
	        	else if(strs[0].equals("Enter")) {
	        	  q.add(new Record(strs[0], strs[1]));
	        			h.put(strs[1], strs[2]);
	        	}
	        	else if(strs[0].equals("Leave")) {
	        		  q.add(new Record(strs[0], strs[1]));
	        		 
	        	}
	        }
	        String[] answer = new String[q.size()];
	        
	        int index =0;
	        
	        while(!q.isEmpty()) {
	        	Record r = q.poll();
	        	if(r.enter.equals("Enter")) {
	        		answer[index++] = h.get(r.id) + "님이 들어왔습니다.";
	        	}
	        	else if(r.enter.equals("Leave")) {
	        		answer[index++] = h.get(r.id) + "님이 나갔습니다.";
	        	}
	        }
	        
	        return answer;  
	    }
	 
}
