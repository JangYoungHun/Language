package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_9371 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		int n = Integer.parseInt(br.readLine());
		char arr[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		for(int i =0; i<n; i++) {
			for(int j =0; j<n-1; j++) {
				if(arr[i][j] != arr[i][j+1]) {
					swap(arr, i, j, j+1);
					result =Math.max(result, solution(arr, n));
					swap(arr, i, j, j+1);
				}
			}
		}
		
		for(int j =0; j<n-1; j++) {
			for(int i =0; i<n; i++) {
				if(arr[i][j] != arr[i][j+1]) {
					swap(arr, i, j, j+1);
					result =Math.max(result, solution(arr, n));
					swap(arr, i, j, j+1);
				}
			}
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void swap(char arr[][],int index , int num1, int num2 ) {
		char temp = arr[index][num1];
		arr[index][num1] = arr[index][num2];
		arr[index][num2] = temp;
	}
	
	public static int solution(char a[][], int n) {

		int max = 0;	
		int cnt = 0;
		
		for (int j = 0; j < n; j++) {			
			max = Math.max(cnt, max);
			char ch = a[j][0];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				if (ch == a[j][i])
					cnt++;
				else {
					
					cnt = 1;
					ch = a[j][i];
				}
			}
		}
		
		for (int j = 0; j < n; j++) {
			max = Math.max(cnt, max);
			char ch = a[0][j];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				if (ch == a[i][j])
					cnt++;
				else {
					cnt = 1;
					ch = a[i][j];
				}
			}
		}
		
		
		return max;
	}
}
