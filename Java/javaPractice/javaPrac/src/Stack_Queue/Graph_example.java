package Stack_Queue;
//https://www.youtube.com/watch?v=_hxFgg7TLZQ
import Stack_Queue.Queue;
import java.util.ArrayList;
import java.util.Stack;

public class Graph_example {

	public static void main(String[] args) {
		
		Graph g = new Graph(9);  //��� ���� 9
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);	
		g.dfsR();
	}

}


class Graph{
	
	Node[] nodes;  // �׷��� �� ��� ������ ����
	
	class Node{	
		int data;
		ArrayList<Node> adjacent;
		boolean marked;
		
		Node(int data){
			adjacent = new ArrayList<Node>();
			marked = false;
			this.data = data;		
		}	
	}
	
	Graph(int num){
		nodes = new Node[num];
		for(int i =0; i < num; i++) {      //���Ǹ� ���� ����忡  �ε�����ȣ�� ������ �� 0~num-1 ���� 
			nodes[i] = new Node(i);
		}
	}
	
	void addEdge(int n1, int n2){
		Node node1 = nodes[n1];
		Node node2 = nodes[n2];
		
		if(!node1.adjacent.contains(node2)) {
			node1.adjacent.add(node2);
		}
		
		if(!node2.adjacent.contains(node1)) {
			node2.adjacent.add(node1);
		}
		
	}
	
	void dfs() {
		dfs(0);
	}
	
	void dfs(int index) {
		Node root =nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true;
		while(!stack.isEmpty()) {
			Node r = stack.pop();
			for(Node i : r.adjacent) {			
				if(i.marked == false) {
					i.marked = true;
					stack.push(i);
				}							
			}		
			visit(r);
		}

	}
	
	void visit(Node r) {
		System.out.print(r.data + " ");
	}
	
	void bfs(){
		bfs(0);
	}
	
	void bfs(int index){
		Queue<Node> queue = new Queue<Node>();       //Queue_EX ���� ���� import
		Node root = nodes[index];
		queue.add(root);
		root.marked = true;
		while(!queue.isEmpty()) {
			Node r = queue.remove();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					queue.add(n);
				}			
			}
			visit(r);
		
		}
		
	}
	
	void dfsR() {//���ȣ���� �̿��� DFS
		dfsR(0);
	}
	
	void dfsR(int index) {//���ȣ���� �̿��� DFS
		Node root = nodes[index];
		dfsR(root);
	}
	
	void dfsR(Node r) {  //���ȣ���� �̿��� DFS
		
		if(r == null) return;
		r.marked = true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked == false)
			dfsR(n);
		}
		
	}
	
	
	
	
	
	
}