package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_3085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		int n = Integer.parseInt(br.readLine());
		char arr[][] = new char[n][n];
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		for (int i = 0; i < n ; i++) {
			int cnt = 0;
			for (int j = 0; j < n-1 ; j++) {
				if(arr[i][j] != arr[i][j+1]) {
					cnt++;
					swapR(arr, i, j, j+1);
					 result = Math.max(result, solution(arr, n)) ;
					swapR(arr, i, j, j+1);
				}
			}
			if(cnt == 0)
				result = n;
		}
		

		
		for (int i = 0; i < n ; i++) {
			int cnt = 0;
			for (int j = 0; j < n-1 ; j++) {
				if(arr[j][i] != arr[j+1][i]) {
					cnt++;
					swapC(arr, i, j, j+1);
					 result = Math.max(result, solution(arr,  n)) ;
					swapC(arr, i, j, j+1);
				}
			}
			if(cnt == 0)
				result = n;
		}
		
		bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
		br.close();
	}
	
	public static void swapR(char[][] arr, int index,int n1, int n2) {
		char temp = arr[index][n1];
		arr[index][n1] = arr[index][n2];
		arr[index][n2] = temp;
	}
	
	public static void swapC(char[][] arr, int index,int n1, int n2) {
		char temp = arr[n1][index];
		arr[n1][index] = arr[n2][index];
		arr[n2][index] = temp;
	}
	
	public static int solution(char a[][], int n) {

		int max = 0;	
		int cnt = 0;
		
		for (int j = 0; j < n; j++) {					
			char ch = a[j][0];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				if (ch == a[j][i])
					cnt++;
				else {		
					max = Math.max(cnt, max);
					cnt = 1;		
					ch = a[j][i];
				}
			}
			max = Math.max(cnt, max);
		}
		
		for (int j = 0; j < n; j++) {

			char ch = a[0][j];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				if (ch == a[i][j])
					cnt++;
				else {
					max = Math.max(cnt, max);
					cnt = 1;
					ch = a[i][j];
				}
			}
			max = Math.max(cnt, max);
		}
		
		
		return max;
	}
}

