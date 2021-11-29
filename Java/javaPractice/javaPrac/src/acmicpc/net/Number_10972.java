package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

//ÇØ°á
public class Number_10972 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for(int i =n-1; i>0; i--) {
			if(arr[i] > arr[i-1]) {
				
				int min = Integer.MAX_VALUE;
				int minIndex= 0;
				for(int j = n-1; j>=i; j--) {
					if( arr[i-1]  < arr[j] && min > Math.abs(arr[i-1] -arr[j]) ) {
						min = Math.abs(arr[i-1] -arr[j]);
						minIndex = j;
					}
				}
				
				int temp = arr[minIndex];
				arr[minIndex] =arr[i-1];
				arr[i-1] = temp;
				
				Arrays.sort(arr,i,n);
				
				Arrays.stream(arr).forEach(item -> System.out.print(item+" "));
				return;
			}
		}
		
		System.out.println(-1);
		
		bw.flush();
		br.close();
		bw.close();
		}

}
