package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1012
// ÇØ°á
public class Number_1012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase =Integer.parseInt( br.readLine());				
		
		for(int p=0; p<testCase; p++) {
			
		int result = 0;
		int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		int M = nums[0];
		int N =nums[1];	
		int K =nums[2];
		boolean cab[][] = new boolean[M][N];
		boolean visited[][] =  new boolean[M][N];
		
		for(int i=0; i<K; i++) {
			int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
			cab[arr[0]][arr[1]] = true;
		}
	
		for(int i=0; i <M; i++) {
			for(int j=0; j<N; j++) {
				if(cab[i][j] && !visited[i][j]) {
					visited[i][j] = true;
					recursion(cab, visited,M, N, i, j);
					result ++;
				}		
			}		
		}
		System.out.println(result);
		}
		
		br.close();
		bw.close();
	}
	
	static void recursion(boolean[][] arr, boolean[][] visited, int M, int N,int index1, int index2) {
		
		if(index1>=0 && index1 < M-1 &&  index2>=0 && index2 <N)  {
			if(arr[index1+1][index2] && !visited[index1+1][index2]) {
			visited[index1+1][index2] = true;
			recursion(arr, visited,M,N, index1+1, index2);
			}
		}
		
		if(index1>=1&& index1 < M+1 && index2>=0&& index2 <N) {
			if(arr[index1-1][index2] && !visited[index1-1][index2]) {
			visited[index1-1][index2] = true;
			recursion(arr, visited,M,N, index1-1, index2);
			}
		}
		
		if(index1>=0&& index1 < M && index2>=0&& index2 <N-1) {
			if(arr[index1][index2+1] && !visited[index1][index2+1]) {
			visited[index1][index2+1] = true;
			recursion(arr, visited,M,N, index1, index2+1);
			}
		}
		
		if(index1>=1&& index1 < M && index2>=1&& index2 <N+1) {
			if(arr[index1][index2-1] && !visited[index1][index2-1]) {
			visited[index1][index2-1] = true;
			recursion(arr, visited,M,N, index1, index2-1);
			}
		}
		return;
	}
	
}
