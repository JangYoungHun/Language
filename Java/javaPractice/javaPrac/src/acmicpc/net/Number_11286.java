package acmicpc.net;

import java.util.PriorityQueue;
import java.util.Scanner;


//https://www.acmicpc.net/submit/11286
//ÇØ°á
public class Number_11286 {

	static class Node implements Comparable<Node>{	
		int num;	
		Node(int num){
			this.num = num;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if(Math.abs(this.num) == Math.abs(o.num))
				return this.num - o.num;
			
			return Math.abs(this.num) - Math.abs(o.num);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			int x = sc.nextInt();
			if(x==0) {	
				try {
					System.out.println(q.poll().num);
				} catch (Exception e) {
					System.out.println(0);
				}				
			}
			else {
				q.add(new Node(x));
			}
			
		}
		
	}

}
