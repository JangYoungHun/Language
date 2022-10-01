package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;


public class Number_12927 {

	public static void main(String[] args) {
			System.out.println(solution(10, new int [] {7,9,9,9,9,9,9,9}));
	}
    public static long solution(int n, int[] works) {
    	PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder()); 
    	for(int i : works) {
    		q.add(i);
    	}
    	
    	for(int i =0; i<n; i++) {
        	int num = q.poll();
        	q.add(num-1);
    	}
    	
    	return q.stream().filter(it -> it >0).mapToLong(it -> it*it).sum();
    	
    }
}
