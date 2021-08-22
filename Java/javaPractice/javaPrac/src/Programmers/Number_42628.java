package Programmers;


import java.util.Collections;

import java.util.PriorityQueue;
//https://programmers.co.kr/learn/courses/30/lessons/42628
//ÇØ°á

public class Number_42628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
	}
	
	  public int[] solution(String[] operations) {
	        int[] answer = new int[2];
			PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
			PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			for(int i =0; i < operations.length; i++) {
				String strs[] = operations[i].split(" ");
				String command  = strs[0];
				int num = Integer.parseInt(strs[1]);
				
				if(command.equals("I")) {
					minQ.add(num);
					maxQ.add(num);
				}
				else if(command.equals("D")) {
					if(!minQ.isEmpty()) {
						if(num == -1) {					
							maxQ.remove(minQ.poll());
						}
						else if(num == 1)
							minQ.remove(maxQ.poll());
					}
				}
			}
			
			
			if(minQ.isEmpty() || maxQ.isEmpty()) {
				answer[0] = 0;
				answer[1] = 0;
			}
			else {
				answer[0] = maxQ.poll();
				answer[1] = minQ.poll();
			}	
			
			
	        return answer;
	    }

}
