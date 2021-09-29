package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/1904
// ÇØ°á
public class Number_1904 {

	public static void main(String[] args)  throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long arr[] = new long[n+1];

		
		long result = pibo(arr, n);
		
		
		bw.write(String.valueOf(result%15746));
		
		
		bw.close();
		br.close();

	}

	static long pibo(long arr[], int n) {
		if(n ==0 || n== 1)
			return 1;
		if(arr[n] !=0)
			return arr[n];
		else
			return arr[n] =  (pibo(arr,n-1)+pibo(arr,n-2))%15746;			
	}
	
}
