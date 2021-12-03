package acmicpc.net;

// ÇØ°á
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Number_2887 {

	static class Node {
		int num;
		int x;
		int y;
		int z;

		Node(int num,int x, int y, int z) {
			this.num = num;
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static class Bridge implements Comparable<Bridge> {
		int node1;
		int node2;
		int distance;

		public Bridge(int node1, int node2, int distance) {
			this.node1 = node1;
			this.node2 = node2;
			this.distance = distance;
		}

		@Override
		public int compareTo(Bridge o) {
			// TODO Auto-generated method stub
			return this.distance - o.distance;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = i;
		}

		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			nodes[i] = new Node(i, arr[0], arr[1], arr[2]);
		}

		PriorityQueue<Bridge> q = new PriorityQueue<Bridge>();

		Arrays.sort(nodes, (o1, o2) -> (o1.x - o2.x) ); 
		for (int i = 0; i < n - 1; i++) {
			int distance = Math.abs(nodes[i].x - nodes[i + 1].x);
			q.add(new Bridge(nodes[i].num, nodes[i+1].num, distance));
		}
		
		Arrays.sort(nodes, (o1, o2) -> (o1.y - o2.y) ); 
		for (int i = 0; i < n - 1; i++) {
			int distance = Math.abs(nodes[i].y - nodes[i + 1].y);
			q.add(new Bridge(nodes[i].num, nodes[i+1].num, distance));
		}
		
	
		Arrays.sort(nodes, (o1, o2) -> (o1.z - o2.z) ); 
		for (int i = 0; i < n - 1; i++) {
			int distance = Math.abs(nodes[i].z - nodes[i + 1].z);
			q.add(new Bridge(nodes[i].num, nodes[i+1].num, distance));
		}

		long result = 0;
		int cnt = 0;
		while (cnt < n - 1) {

			Bridge bridge = q.poll();
			if (isUnion(p, bridge.node1, bridge.node2)) {
				continue;
			}
			else {
			union(p, bridge.node1, bridge.node2);
			cnt++;
			result += bridge.distance;
			}
		}

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}

	public static void union(int[] p, int index1, int index2) {
		int parent1 = getParent(p, index1);
		int parent2 = getParent(p, index2);

		if (parent1 < parent2)
			p[parent2] = parent1;
		else
			p[parent1] = parent2;
	}

	public static int getParent(int[] p, int index1) {

		if (p[index1] == index1)
			return index1;
		else
			return p[index1] = getParent(p, p[index1]);
	}

	public static boolean isUnion(int[] p, int index1, int index2) {
		return getParent(p, index1) == getParent(p, index2);
	}

}
