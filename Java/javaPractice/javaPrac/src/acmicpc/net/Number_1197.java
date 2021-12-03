package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1197
//ÇØ°á
public class Number_1197 {
	
	static class Node implements Comparable<Node>{	
		int x;
		int y;
		int dis;
		Node(int x,int y	,int dis){
			this.x = x;
			this.y=y;
			this.dis = dis;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dis-o.dis;
		}
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result =0;
		int ve[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int v = ve[0];
		int e = ve[1];
		
		int p[] = new int[v+1];
		for(int i=1; i<v+1; i++) {
			p[i] = i;
		}
		
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		
		for(int i=0; i<e; i++) {
			int info[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			q.add(new Node(info[0], info[1], info[2]));		
		}
		
		while(!q.isEmpty()) {
			Node top = q.poll();
			if(!isUnion(p, top.x, top.y)) {
				result += top.dis;
				union(p, top.x, top.y);		
			}
		}
		
		System.out.println(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	
	static int getParent(int[] p, int node1) {
		if(p[node1] == node1)
			return node1;
		
		return p[node1] = getParent(p,p[node1]);
	}
	
	
	static void union(int[] p, int node1, int node2) {
		int parent1 = p[node1];
		int parent2 = p[node2];
		
		if(parent1 < parent2)
			p[parent2] = parent1;
		else
			p[parent1] = parent2;
	}

	
	static boolean isUnion(int[] p, int node1, int node2) {
		int parent1 = getParent(p, node1);
		int parent2 = getParent(p, node2);
		return parent1==parent2;
	}
	
	
	
	
	
}
