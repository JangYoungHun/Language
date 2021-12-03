package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1780
public class Number_1780 {
	static int n;
	static int arr[][];
	static int result0 = 0;
	static int result1 = 0;
	static int result_1 = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr =  new int[n][n];
		
		for(int i =0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		recur(n, 0, 0, n-1, n-1);
		System.out.println(result_1);
		System.out.println(result0);
		System.out.println(result1);
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	static void recur(int n, int x1, int y1, int x2, int y2){
		
		int val = arr[x1][y1];
		for(int i=x1; i<x2; i++) {
			for(int j=y1; j<y2; j++) {
				if(val != arr[i][j]) {
					for(int k=x1; k<x1+n; k+=n/3) {
						for(int p=y1; p<y1+n; p+=n/3) {		
							recur(n/3, k,p , k+n/3, p+n/3);
						}
					}
					return;
				}				
			}
		}
		
		if(val ==0)
			result0 ++;
		else if(val ==1)
			result1 ++;
		else
			result_1 ++;
	}
	
}
