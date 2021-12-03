package Programmers;

import java.util.Arrays;

//해결
public class Number_49191 {

	public static void main(String[] args) {
		int n = 5;
		int[][] result = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
		solution(n,result);
	}
	public static int solution(int n, int[][] results) {
		int answer =0;
		
		int d[][] = new int[n][n];
		
		for(int i =0; i<n; i++) {
			Arrays.fill(d[i], 9999);
		}	
		for(int i =0; i<n; i++) {
			d[i][i] = 0;
		}
		
		for(int[] i : results) {
			d[i[1]-1][i[0]-1] = 1;
		}
		
		//거쳐가는 노드
		for(int i =0; i<n; i++) {
			//출발 노드
			for(int j =0; j<n; j++) {
				//도착 노드
				for(int k =0; k<n; k++) {				
					if(d[j][k] > d[j][i] + d[i][k]) {
						d[j][k] = d[j][i] + d[i][k];
					}

				}
			}
		}
		
		int arr[][] = new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				if(d[i][j] != 9999) {
					arr[i][j] = 1;
					arr[j][i] = 1;
				}
			}
		}
		
		Loop1:
		for(int[] i : arr) {
			for(int j : i) {
				if(j != 1)
					continue Loop1;
			}
			answer++;
		}
		
		
		return answer;
	}
}	
