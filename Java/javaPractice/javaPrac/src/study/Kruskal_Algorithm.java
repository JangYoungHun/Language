package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//참고 https://www.youtube.com/watch?v=LQ3JHknGy8c&t=520s
public class Kruskal_Algorithm {

	static class Node {
		int num1;
		int num2;
		int distance;

		Node(int num1, int num2, int distance) {
			this.num1 = num1;
			this.num2 = num2;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {
		// 노드의 개수
		int n = 7;
		// 간선 개수
		int m = 11;

		List<Node> list = new ArrayList<Node>();
		list.add(new Node(1, 7, 12));
		list.add(new Node(1, 4, 28));
		list.add(new Node(1, 2, 67));
		list.add(new Node(1, 5, 17));
		list.add(new Node(2, 4, 24));
		list.add(new Node(2, 5, 62));
		list.add(new Node(3, 5, 20));
		list.add(new Node(3, 6, 37));
		list.add(new Node(4, 7, 13));
		list.add(new Node(5, 6, 45));
		list.add(new Node(5, 7, 73));
		list.add(new Node(1, 7, 12));

		// 거리 기준 오름차순 정렬
		list.sort(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.distance - o2.distance;
			}
		});

		int p[] = new int[n + 1];
		for (int i = 1; i < 8; i++) {
			p[i] = i;
		}

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			Node node = list.get(i);
			if (!isUnion(p, node.num1, node.num2)) {
				sum += node.distance;
				union(p, node.num1, node.num2);
			}
		}

		System.out.println(sum);

	}

	static int getParent(int p[], int node1) {
		if (p[node1] == node1)
			return node1;

		return getParent(p, p[node1]);
	}

	static void union(int p[], int node1, int node2) {

		int parent1 = getParent(p, node1);
		int parent2 = getParent(p, node2);

		if (parent1 < parent2) {
			p[parent2] = parent1;
		} else
			p[parent1] = parent2;
	}

	static boolean isUnion(int p[], int node1, int node2) {
		if (getParent(p, node1) == getParent(p, node2))
			return true;

		return false;
	}

}
