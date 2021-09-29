package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/43164
//ÇØ°á
public class Number_43164 {
	
	static String result ="";
	public static void main(String[] args) {
		String[][] tickets = 	{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};

		System.out.println(Arrays.toString(solution(tickets)));
	}
	
    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        boolean visited[] = new boolean[tickets.length];
       
        for(int i =0; i<tickets.length; i++) {
        	if(tickets[i][0].equals("ICN")) {
        		visited[i] = true;
        		list.add("ICN");
        		dfs(tickets, list, visited, i , 1 , tickets.length);
        		list.clear();
        		visited[i] =false;
        	}
        }
        answer = result.split(" ");
        return answer;
    }
    
    
    
    public static void dfs(String[][] tickets, List list, boolean visited[], int index , int cnt, int n) {
    	
     	list.add(tickets[index][1]);
     	
    	if(cnt == n) {
    		StringBuilder sb = new StringBuilder();
    		
    		for(int i=0; i< list.size(); i++) {
    			sb.append(list.get(i));
    			sb.append(" ");
    		}
    		String str = sb.toString().trim();
    				
    		if(result.equals("")) {  	
    			result = str;
    		}
    		else {  			
    			if(result.compareTo(str) > 0 )
    				result = str;
    		}
    		return;
    	}
    	  	
   
    	
    	for(int i =0; i<n; i++) {
    		if(tickets[index][1].equals(tickets[i][0] ) && !visited[i]) {
    			visited[i] = true;
    			dfs(tickets, list, visited, i ,cnt+1,  n);
    			visited[i] = false;
    			list.remove(list.size()-1);
    		}
    	}	
    }

}
