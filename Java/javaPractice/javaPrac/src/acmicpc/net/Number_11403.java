package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;
//https://www.acmicpc.net/problem/11403
//ÇØ°á
public class Number_11403 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int result[][] = new int[n][n];

		int p[] = new int[n];
		for(int i =0; i<n; i++) {
			p[i] = i;
		}
		
		boolean bridge[][] = new boolean[n][n];
	
		
		for(int i=0; i<n; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();			
			for(int j =0; j<n; j++) {
				if(nums[j] == 1) {
					bridge[i][j] = true;
				}
			}		
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =0; i<n; i++) {
			boolean[] visited = new boolean[n];
			q.add(i);
		while(!q.isEmpty()) {
			int top = q.poll();
			
			for(int j =0; j<n; j++) {
				if(bridge[top][j] && !visited[j]) {
					q.add(j);
					result[i][j] = 1;
					visited[j] = true;
				}
			}
		}
			
		}
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(result[i][j]);
				if(j!=n-1)
					System.out.print(" ");
				else
					System.out.print("\n");
			}
		}
		

		bw.flush();
		bw.close();
		br.close();

	}
	

}
