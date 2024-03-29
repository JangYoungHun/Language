package acmicpc.net;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

//https://www.acmicpc.net/problem/2468
//�ذ�
public class Number_2468 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int map[][] = new int[n][n];

		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int num =sc.nextInt();
				map[i][j] = num;
				set.add(num);
			}
		}
		
	int result =1;	
	 Iterator<Integer> it = set.iterator();
	 while(it.hasNext()) {
		 int num = it.next();
		 result = Math.max(solution(map,num), result);
	 }
		
	 System.out.println(result);
	}

	static int solution(int[][] map, int height) {
		int cnt =0;
		int n = map.length;
		boolean visited[][] = new boolean[n][n];
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] > height && !visited[i][j]) {
					qx.add(i);
					qy.add(j);			
					visited[i][j] = true;
					cnt++;
				}			
				while(!qx.isEmpty()) {

						int x = qx.poll();
						int y =qy.poll();
						
						if(0<=x-1 && !visited[x-1][y] && map[x-1][y] > height) {
							qx.add(x-1);
							qy.add(y);
							visited[x-1][y] = true;
						}
						if(0<=y-1 && !visited[x][y-1] && map[x][y-1] > height) {
							qx.add(x);
							qy.add(y-1);
							visited[x][y-1] = true;
						}
						
						if(x+1<n && !visited[x+1][y] && map[x+1][y] > height) {
							qx.add(x+1);
							qy.add(y);
							visited[x+1][y] = true;
						}
						
						if(y+1<n && !visited[x][y+1] && map[x][y+1] > height) {
							qx.add(x);
							qy.add(y+1);
							visited[x][y+1] = true;					
					}
				}
			}
		}
		return cnt;
	}
	
}
