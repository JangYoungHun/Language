package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1922
//해결
public class Number_1922 {

	static class Edge {

		int node1;
		int node2;
		int dis;

		public Edge(int node1, int node2, int dis) {
			this.node1 = node1;
			this.node2 = node2;
			this.dis = dis;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 컴퓨터 수
		int n = Integer.parseInt(br.readLine());
		// 입력 수
		int m = Integer.parseInt(br.readLine());

		int sum = 0;
		List<Edge> list = new ArrayList<Edge>();

		for (int i = 0; i < m; i++) {
			int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			list.add(new Edge(arr[0], arr[1], arr[2]));
		}

		list.sort(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				// TODO Auto-generated method stub
				return o1.dis - o2.dis;
			}
		});
		
		int p[] = new int[n+1];
		for(int i =1; i<n+1; i++) {
			p[i] = i;
		}
		
		for(int i =0; i<list.size(); i++) {
			Edge edge = list.get(i);
			if(!isUnion(p, edge.node1, edge.node2)) {
				sum += edge.dis;
				union(p, edge.node1, edge.node2);
			}
		}
		
		System.out.println(sum);
		
		bw.flush();
		bw.close();
		br.close();
	}

	static int getParent(int p[], int node1) {

		if (p[node1] == node1)
			return node1;

		return getParent(p, p[node1]);

	}

	static void union(int p[], int node1, int node2) {
		
		int parent1 = getParent(p, node1);
		int parent2 = getParent(p, node2);
		if(parent1 < parent2) 
			p[parent2] = parent1;
		else
			p[parent1] = parent2;	
	}
	
	static boolean isUnion(int p[], int node1, int node2) {
		if(getParent(p, node1) == getParent(p, node2))
			return true;
		
		return false;
	}
	
	
}
