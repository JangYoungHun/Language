package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class Number_10819 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);
		int result = 0;
		int start=1;
		int end=arr.length-1;
		// true : 濛擎熱 false : 贖熱
		boolean small = false;
		int pre = arr[0];
		int next = 0;
		
		while(start <= end) {
			// n檜 �汝� 
			if(start == end) {
				result += Math.max(Math.abs(arr[0]-arr[start]), Math.abs(pre-arr[start]));
				break;
			}
			// n檜 礎熱 
			else {
				if(small) {
					next = arr[start++];
				}
				else {
					next = arr[end--];
				}
				
				result += Math.abs(next-pre);
				small = !small;
				pre = next;
			}
			
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
		}

}
