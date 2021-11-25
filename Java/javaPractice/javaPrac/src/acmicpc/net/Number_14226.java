package acmicpc.net;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//ÇØ°á
public class Number_14226 {
	
	static class Node{
		int display;
		int time;
		int clipBoard;
		public Node(int display, int clipBoard, int time) {
			this.display = display;
			this.time = time;
			this.clipBoard = clipBoard;
		}

		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean visited[][] = new boolean[1001][1001];
		
		int s = sc.nextInt();
		int result = Integer.MAX_VALUE;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(1, 0, 0));
		visited[1][0] = true;
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node.display == s)
				result = Math.min(node.time, result);
			
			if(node.time >= 1000)
				continue;
			
			if(node.display != node.clipBoard && !visited[node.display][node.display] ) {
				Node node1 = new Node(node.display, node.display, node.time+1);
				visited[node.display][node.display] = true;
				q.add(node1);
			}
			
			if(node.display+node.clipBoard < 1001 && !visited[node.display+node.clipBoard][node.clipBoard]) {
				Node node2 = new Node(node.display+node.clipBoard, node.clipBoard, node.time+1);
				visited[node.display+node.clipBoard][node.clipBoard] = true;
				q.add(node2);
			}
			
			if(node.display >1 &&!visited[node.display-1][node.clipBoard]) {
			Node node3 = new Node(node.display-1, node.clipBoard, node.time+1);
			visited[node.display-1][node.clipBoard] = true;
			q.add(node3);
			
			}

		}
		
		System.out.println(result);
	}
}
