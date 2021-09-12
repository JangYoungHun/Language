package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/12978
//다익스트라 해결
public class Number_12978 {

	
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		solution(5,arr,3);
	}
	
	static class Node implements Comparable<Node>{
		int dis;
		int next;
		Node(int next, int dis){
			this.dis = dis;
			this.next = next;
		}		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dis - o.dis;
		}
	}
	
	 public static int solution(int N, int[][] road, int K) {
	        int answer = 0;
	        int d[] = new int[N+1];
	        Arrays.fill(d, Integer.MAX_VALUE);
	        d[1]=0; 
	        ArrayList<ArrayList<Node>> list = new ArrayList<ArrayList<Node>>();
	        for(int i=0; i<=N; i++) {
	        	list.add(new ArrayList<>());
	        }
	        
	        
	        for(int i[] : road) {
	        	list.get(i[0]).add(new Node(i[1], i[2]));
	        	list.get(i[1]).add(new Node(i[0], i[2]));
	        }
	        
	        PriorityQueue<Node> q = new PriorityQueue<Node>();
	        q.add(new Node(1,0));
	       
	        while(!q.isEmpty()) {
	        	Node node = q.poll();
	        	int curdis = node.dis;
	        	int curpos = node.next;
	        	
	        	if(d[curpos] < curdis)
	        		continue;
	        	
	        	for(int i =0; i<list.get(curpos).size(); i++) {
	        		int distance = list.get(curpos).get(i).dis + curdis; 
	        		int nextPos = list.get(curpos).get(i).next;
	        		if(d[nextPos] > distance) {
	        			d[nextPos] = distance;
	        			q.add(new Node(nextPos, distance));
	        		}
	        	} 

	        }

	        
	        for(int i =1; i<N+1; i++) {
	        	if(d[i]<=K )
	        		answer++;
	        }
	        
	        return answer;
	    }
}
