package acmicpc.net;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1707
//검색 해결 
//이분 그래프 중요
public class Number_1707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int t = sc.nextInt();
		Loop1:
		for(int i =0; i<t; i++) {
			
			int v = sc.nextInt();
			int e = sc.nextInt();
			int visited[] = new int[v+1];
	
			ArrayList<Integer>[] bridge = new ArrayList[v+1];
			for(int m = 1; m <= v; m++)
				bridge[m] = new ArrayList<Integer>();
			
			for(int j =0; j<e; j++) {				
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();		
				bridge[index1].add(index2);
				bridge[index2].add(index1);
			}

			Queue<Integer> q = new LinkedList<Integer>();

			for(int k =1; k<=v; k++) {
			
				if(visited[k] == 0) {
					q.add(k);
					visited[k] = 1;
				}

				while(!q.isEmpty()) {
					int top = q.poll();
					
					for(int j =0; j<bridge[top].size(); j++) {
						
						if(visited[top] == visited[bridge[top].get(j)] ) {
							System.out.println("NO");
							continue Loop1;
						}				
						if(visited[top] == 1 && visited[bridge[top].get(j)] == 0) {
							q.add(bridge[top].get(j));				
							 visited[bridge[top].get(j)]  = 2;
						}
						if(visited[top] == 2 && visited[bridge[top].get(j)] == 0) {
							q.add(bridge[top].get(j));				
							 visited[bridge[top].get(j)]  = 1;
						}
					}
					
				}
		}
			System.out.println("YES");
		}
		}
	}


