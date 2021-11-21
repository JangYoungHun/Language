package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Number_67258 {

	public static void main(String[] args) {
		String gems[] = { "AA", "AB", "AC", "AA", "AC" };
		solution(gems);
	}

	public static int[] solution(String[] gems) {
		
		HashSet<String> s = new HashSet<String>();
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		Queue<String> q = new LinkedList<String>();
		
		int start =0;
		int end = Integer.MAX_VALUE;
		int index = 0;
		
		for (String str : gems) {
			s.add(str);
		}

		int n = s.size();

		for(int i =0; i<gems.length; i++) {
			String gem = gems[i];
			h.put(gem, h.getOrDefault(gem, 0)+1);
			q.add(gem);
			
			while(true) {
				String peek = q.peek();
				
				if(h.get(peek) >1) {
					h.put(peek, h.get(peek)-1);
					q.poll();
					index++;
				}
				else {
					break;
				}
			}
			if(h.size() == n && end >q.size()) {
				end = q.size();
				start = index;
			}
		}
		

		return new int[]{start+1, start+end};
	}
}
