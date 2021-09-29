package Tree_Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//https://www.youtube.com/watch?v=F-tkqjUiik0&t=1897s
//위 주소 영상에서의 노드 정보 사용

public class Dijkstra  {
	
	static class Node implements Comparable<Node>{
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
		
		// 6개 노드  0~5;
		int n= 6;
		double d[] = new double[n];
		Arrays.fill(d, Double.POSITIVE_INFINITY);
		//출발점 0
		 d[0] = 0;
		 List<List<Node>> conection = new ArrayList<List<Node>>();
		 for(int i =0; i < n; i++) {
			 conection.add(new ArrayList<Node>());
		 }	
		 conection.get(0).add(new Node(2, 1));
		 conection.get(0).add(new Node(5, 2));
		 conection.get(0).add(new Node(1, 3));
		 
		 conection.get(1).add(new Node(3, 2));
		 conection.get(1).add(new Node(2, 3));
		
		 conection.get(2).add(new Node(3, 1));
		 conection.get(2).add(new Node(5, 5));
		 
		 conection.get(3).add(new Node(3, 2));
		 conection.get(3).add(new Node(1, 4));
		 
		 conection.get(4).add(new Node(1, 2));
		 conection.get(4).add(new Node(2, 5));
		 
		 
		 PriorityQueue<Node> q = new PriorityQueue<Node>();
		 
		 q.add(new Node(0, 0));
		 
		 while(!q.isEmpty()) {
			 
			 Node node = q.poll();
			 int curDis = node.dis;
			 int curIndex = node.index;
					 
			 if(d[curIndex] < curDis)
				 continue;
			 
			 for(int i =0; i<conection.get(curIndex).size(); i++) {		
				 int distance = curDis + conection.get(curIndex).get(i).dis;
				 int nextIndex =  conection.get(curIndex).get(i).index;
				 if(d[nextIndex] > distance) {
					 d[nextIndex] = distance;
					 q.add(new Node(distance,nextIndex));
				 }
			 }
			 
			 
		 }	
		 
		 
		 System.out.println(Arrays.toString(d));
	}

}
