package Programmers;

import java.util.ArrayList;
import java.util.List;

//ÇØ°á
public class Number_17676 {
	
	static class Node{
		int start;
		int end;
		public Node(int start, int end) {
			this.start = start;
			this.end = end;
		}	
	}
	
	public static void main(String[] args) {
		String lines[] = { "2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s" };
		System.out.println(solution(lines));
	}

	public static int solution(String[] lines) {
		int answer = 0;

		List<Node> list = new ArrayList<Node>();
		for (String line : lines) {
			String strs[] = line.split(" ");
			String hms[] = strs[1].split(":");
			int spent = (int) (Double.parseDouble(strs[2].substring(0, strs[2].length() - 1)) * 1000);
			int sec = (Integer.parseInt(hms[0]) * 3600 + Integer.parseInt(hms[1]) * 60)*1000
					+ (int) (Double.parseDouble(hms[2]) * 1000) ;			
			list.add(new Node(sec - spent+1,sec));		
		}
		
		list.sort((Node n1, Node n2)->{
			if(n1.start == n2.start)
				return n1.end - n2.end;
			else
				return n1.start - n2.start;
			});

		for(Node node : list) {
			int start = node.start;
			int end = start+999;
			int cnt = 0;
			
			for(int i =0; i<list.size(); i++) {
				if(( start<= list.get(i).start && list.get(i).start<= end) || ( start<= list.get(i).end && list.get(i).end<= end) || ( start>= list.get(i).start&& list.get(i).end>= end) )
					cnt++;	
			}
			answer = Math.max(cnt, answer);
			
			start = node.end;
			end = start+999;
			cnt = 0;
			for(int i =0; i<list.size(); i++) {
				if(( start<= list.get(i).start && list.get(i).start<= end) || ( start<= list.get(i).end && list.get(i).end<= end) || ( start>= list.get(i).start&& list.get(i).end>= end) )
					cnt++;

			}
			answer = Math.max(cnt, answer);
		}
		
		
		return answer;
	}
	}
