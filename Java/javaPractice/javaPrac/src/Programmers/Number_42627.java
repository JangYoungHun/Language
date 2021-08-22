package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42627
//ÇØ°á
public class Number_42627  {
	
	static class Node implements Comparable<Node>{
		int start;
		int duration;

		Node(int start, int duration){
			this.start = start;
			this.duration = duration;	
		}
		@Override
		public int compareTo(Node o) {
				return this.duration - o.duration;
		}
	}
	
	public static void main(String[] args) {
		
		int num[][] = {
				{24, 10}, {18, 39}, {34, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}
		};
		
		System.out.println(solution(num)); 
	}

    public static int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs,new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		// TODO Auto-generated method stub
        		return o1[0] - o2[0];
        	}
		});
        
        PriorityQueue<Node> q = new PriorityQueue<Node>( );
        
        int i=0;
        int pos=0;
        while(i<jobs.length || !q.isEmpty()) {
        	while(i<jobs.length && jobs[i][0] <= pos ) {
        		q.add(new Node(jobs[i][0], jobs[i][1]));
        		i++;      	
        	}
        	if(!q.isEmpty()) {
        		Node n = q.poll();
        		answer += n.duration+pos-n.start ;
        		pos += n.duration;
        	}
        	else {
        		if (i<jobs.length)
        		pos = jobs[i][0];
        	}
        }
    

        return answer/jobs.length;
    }
}
