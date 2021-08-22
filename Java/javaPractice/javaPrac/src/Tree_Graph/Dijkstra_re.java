package Tree_Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra_re {

	static class Node implements Comparable<Node> {
		int dis;
		int index;
		Node(int dis, int index){
			this.dis = dis;
			this.index = index;			
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dis - o.dis;
		}
		
	}
	public static void main(String[] args) {	
		
		int n =6;
		
		int d[] = new int[n];
		
		Arrays.fill(d, Integer.MAX_VALUE);
		ArrayList<ArrayList<Node>> con = new ArrayList<ArrayList<Node>>();
		for(int i =0; i<n; i++) {
			con.add(new ArrayList<Node>());
		}
		
		con.get(0).add(new Node(2,1));
		con.get(0).add(new Node(3,2));
		con.get(0).add(new Node(1,3));
		
		con.get(1).add(new Node(3,2));
		con.get(1).add(new Node(2,3));
		
		con.get(2).add(new Node(5,5));
		con.get(2).add(new Node(3,1));
		
		con.get(3).add(new Node(1,4));	
		con.get(3).add(new Node(3,2));	
		
		con.get(4).add(new Node(1,2));
		con.get(4).add(new Node(2,5));
		
		
		int start = 0;
		
		PriorityQueue<Node> q = new PriorityQueue<Node>();		
		
		q.add(new Node(start,0));
		d[start] = 0;
		
		while(!q.isEmpty()) {
			
			Node node = q.poll();
			int destination = node.index;
			int curdis = node.dis;
	
			if(curdis > d[destination]) 
				continue;
			
			for(int i =0; i<con.get(destination).size(); i++) {
				int next = con.get(destination).get(i).index;
				int nextdis = con.get(destination).get(i).dis;
				if(curdis+nextdis < d[next]) {
					d[next] = curdis+nextdis;
					q.add(new Node(curdis+nextdis, next));
				}
			}		
		}
		
		
		System.out.println(Arrays.toString(d));
	}

}
