package acmicpc.net;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1697
//ÇØ°á
public class Number_1697 {

	static int n ;
	static int m ;
	static int arr[];
	static int result = Integer.MAX_VALUE;
	static boolean visited[];
	
	public static void main(String[] args) {
		
		class Node{
			int num;
			int cnt;
			Node(int num, int cnt){
				this.num = num;
				this.cnt = cnt;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		visited = new boolean[1000001];
		arr = new int[1000001];
		Arrays.fill(arr, Integer.MAX_VALUE);
		
		n = sc.nextInt();
		m = sc.nextInt();
		visited[n] = true;

		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(n, 0));
		

		while(!q.isEmpty()) {
			int qsize = q.size();
			for(int i = 0; i<qsize; i++) {
				Node top =  q.poll();
				int curPos = top.num;
				int cnt = top.cnt;
				
				if(curPos == m) {
					result = cnt;
				}
				
				if(curPos+1 <= 100000 && !visited[curPos+1]) {
					visited[curPos+1] = true;
					q.add(new Node(curPos+1, cnt+1));
				}
				if(curPos-1 >= 0 && !visited[curPos-1]) {
					visited[curPos-1] = true;
					q.add(new Node(curPos-1, cnt+1));
				}
				if(curPos*2 <= 100000 && !visited[curPos*2]) {
					visited[curPos*2] = true;
					q.add(new Node(curPos*2, cnt+1));
				}
			}
}
		
		
		System.out.println(result);
		
	}
	

} 
	

