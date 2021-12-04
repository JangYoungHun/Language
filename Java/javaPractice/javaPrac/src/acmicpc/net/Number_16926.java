package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.stream.Stream;

//ÇØ°á
public class Number_16926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nums[0];
		int m = nums[1];
		int r= nums[2];
		
		int arr[][] = new int[n][m];
		
		for(int i =0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		for(int i =0; i<r; i++) {
			arr = rotate(arr, n, m);
		}
		
		for(int i =0; i<n; i++) {	
			for(int j =0; j<m; j++) {
				bw.write(String.valueOf(arr[i][j] + " "));
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	public static int[][] rotate(int[][] arr, int n, int m) {
		
		int group = Math.min(n/2, m/2);
		int arr2[][] = new int [n][m];
		
		for(int i=0; i<group; i++) {
	
			for(int j=i+1; j<m-i; j++) {
				arr2[i][j-1] = arr[i][j];
			}

			for(int j=i+1; j<n-i; j++) {
				arr2[j-1][m-1-i] = arr[j][m-1-i];
			}		
			
			for(int j=m-2-i; j>=i; j--) {
				arr2[n-1-i][j+1] = arr[n-1-i][j];
			}
			
			for(int j=n-2-i; j>=i; j--) {
				arr2[j+1][i] = arr[j][i];
			}
			
		}
		return arr2;
		}

	
}










