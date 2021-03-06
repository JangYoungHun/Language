package acmicpc.net;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_11725 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Node nodes[] = new Node[N+1];
		for(int i=0; i<N+1; i++) {
			nodes[i] = new Node(i);	
		}
		
		for(int i=0; i<N-1; i++) {
			int index1 = sc.nextInt();
			int index2 = sc.nextInt();
			nodes[index1].list.add(nodes[index2]);	
			nodes[index2].list.add(nodes[index1]);	
		}
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(nodes[1]);
		nodes[1].visited = true;
		
		while(!q.isEmpty()) {
			Node topNode = q.poll();
			for(Node n : topNode.list ) {
				if(!n.visited) {
				n.parent = topNode;
				q.add(n);
				n.visited = true;
			}
			}
		}
		
		
		for(int i =2; i<N+1; i++) {
			
			System.out.println(nodes[i].parent.data);
		}
		
		
		
	}
	
	static class Node{
		int data;
		Node parent ;
		LinkedList<Node> list ;
		boolean visited = false;
		
		Node(int data){
			this.data = data;
			parent = null;
			list = new LinkedList<>();
		}
		
	}

}
