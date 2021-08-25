package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number_42890 {
	

	//https://programmers.co.kr/learn/courses/30/lessons/42890
	// ÇØ°á
	public static void main(String[] args) {
		
		String relation[][] = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		System.out.println(solution(relation));
	}

	static List<ArrayList<Integer>> resultList = new ArrayList<>();
	
	   public static int solution(String[][] relation) {
		   
		   int n = relation.length;
		   int m = relation[0].length;
		   
		   for(int i =1; i<=m; i++) {
			   dfs(relation, new ArrayList<Integer>(), n,  m, 0, i);
		   }
		   
	        return resultList.size();
	    }
	   
	   static void dfs(String[][] relation, ArrayList<Integer> list, int n, int m, int start, int cnt) {
		   
		   if(list.size() == cnt) {			  
			   String data[] = new String[n];
			   for(int i =0; i<list.size(); i++) {
				   
				   for(int k=0; k<n; k++) {
					   data[k] += relation[k][list.get(i)];
				   }
			   }
			   
			   Set<String> set = new HashSet<String>(Arrays.asList(data));
			   
			   if(set.size() == data.length) {
				   
				   if(resultList.size() ==0) {
					   resultList.add(new ArrayList<>(list));
					   return;
				   }
				   else {
					
					   for(int i =0; i<resultList.size(); i++) {
						   int contain =0;
						   for(int j =0; j<resultList.get(i).size(); j++) {
							   if(list.contains(resultList.get(i).get(j))) {
								   contain++;
							   }
						   }   
						   if(contain == resultList.get(i).size())
							   return;
					   }
					   resultList.add(new ArrayList<>(list));
				   	return;
					   
				   }
			   }
			   
			   return;
		   }
		   
		   for(int i =start; i<m; i++) {
			   if(!list.contains(i)) {
				   list.add(i);
				   dfs(relation ,list, n, m, i, cnt);
				   list.remove(list.size()-1);
			   }
		   }
		   
	   }
	   
}
