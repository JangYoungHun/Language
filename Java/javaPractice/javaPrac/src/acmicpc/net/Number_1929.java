package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class Number_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int start = nums[0];
		int end = nums[1];
		int arr[] = new int[end+1];
		
		arr[1] = 1;
		arr[0] = 1;
		
		for(int i = 2; i<end/2+1; i++) {
			for(int j = 2; i*j<=end; j++) {
				arr[i*j] = 1;
			}
		}
		
		for(int i = start; i<=end; i++) {
			if(arr[i] == 0)
				System.out.println(i);
		}
		

		bw.flush();
		bw.close();
		br.close();
	}

}
