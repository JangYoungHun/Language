package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/14889
// 시간초과 해결X

public class Number_14889 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int team1[];
	static int N;
	static int arr[][];
	static int result=Integer.MAX_VALUE;
	static boolean visited[];
	public static void main(String[] args) throws IOException{
		
	
		N = Integer.parseInt(br.readLine());
		team1 = new int[N/2];
		arr = new int[N][N];
		visited = new boolean[N];
		StringTokenizer st ;
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
		select(0,  0);
		
		bw.write(String.valueOf(result));
		br.close();
		bw.close();
		
	}
	
	
	static void select(int start, int count) {
		
		if(count == N/2) {
			int team2[] = new int[N/2];
			int index =0;
			for(int i=0; i< visited.length; i++) {
				if(!visited[i])
					team2[index++] =i;
			}	
			int ability1 =0;
			int ability2 =0;
			
			for(int i =0; i<N/2; i++) {
				for(int j =i+1; j<N/2; j++) {
					ability1 += arr[team1[i]][team1[j]] +  arr[team1[j]][team1[i]];
					ability2 +=  arr[team2[i]][team2[j]] +  arr[team2[j]][team2[i]];
				}			
			}
			
			int diff = Math.abs(ability1 - ability2);
			result = Math.min(result, diff);
			
			return;
		}
		
		for(int i =start; i<N; i++) {
			
			if(!visited[i] ) {
				visited[i] =true;
				team1[count] =i; 
				select(start+1,count+1); 
				visited[i] =false;
			}
			
		}
		
	}
	


}
