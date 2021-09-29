package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

// https://www.acmicpc.net/problem/1912
// ÇØ°á
public class Number_1912 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		long arr[] = Stream.of(br.readLine().split(" ")).mapToLong(Long :: parseLong).toArray();
		long result = arr[0];
		
		
		for(int i =1; i<n; i++) {
			arr[i] = Math.max(arr[i], arr[i]+arr[i-1]);
			result = Math.max(result, arr[i]);
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}

		
	}
	
