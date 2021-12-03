package Programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//미해결
public class Number_1837 {

	public static void main(String[] args) throws IOException {
		int n = 7;
		int m = 10;
		int[][] edge_list = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 6 }, { 5, 6 }, { 5, 7 },
				{ 6, 7 } };
		int k = 6;
		int[] gps_log = { 1, 2, 3, 3, 6, 7 };

		solution(n, m, edge_list, k, gps_log);
	}

	static class Node {
		int node;
		int fix;
		ArrayList<Integer> visited;
		public Node(int node, int fix, ArrayList<Integer> list) {
			this.visited = new ArrayList<>(list);
			this.node = node;
			this.fix = fix;
		}

	}

	public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
		int answer = Integer.MAX_VALUE;

		// n 거점 갯수

		boolean bridge[][] = new boolean[n + 1][n + 1];

		// 다리 연결
		for (int[] i : edge_list) {
			bridge[i[0]][i[1]] = true;
			bridge[i[1]][i[0]] = true;
		}

		boolean visited[] = new boolean[n + 1];

		int cnt = 0;

		int t = 1;
		Queue<Node> q = new LinkedList<Node>();
		int startNode = gps_log[0];  
		Node node = new Node(startNode, 0, new ArrayList<Integer>());
		node.visited.add(startNode);
		q.add(node);
		

		while (!q.isEmpty()) {
			Node cur = q.poll();
		
			if(cur.visited.size() == k) {
				if(cur.node == gps_log[k-1] ) {
					answer = Math.min(answer, cur.fix);
				}
				continue;
			}
			int next = gps_log[cur.visited.size()]; 
			
			if(cur.node == next) {
				Node nextNode = new Node(next, cur.fix, cur.visited);
				nextNode.visited.add(next);
				q.add(nextNode);
			}
			
			if (bridge[cur.node][next]) {
				Node nextNode = new Node(next, cur.fix, cur.visited);
				nextNode.visited.add(next);
				q.add(nextNode);
			} else {
				for (int i = 1; i < n + 1; i++) {
					if (bridge[cur.node][i] && !cur.visited.contains(i)) {
						Node nextNode = new Node(i, cur.fix+1, cur.visited);
						nextNode.visited.add(i);
						q.add(nextNode);
					}
				}
			}

		}

		return answer;

	}
}
