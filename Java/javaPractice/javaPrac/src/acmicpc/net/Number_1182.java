package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

//ÇØ°á
public class Number_1182 {
	static int result =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] ns = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = ns[0];
		int s = ns[1];
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		recur(new ArrayList<Integer>(), arr, 0, s, n);
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}
	
	public static void recur(ArrayList<Integer> list, int[] arr, int start, int s, int n) {
	
		if(list.size() !=0) {
			int sum = 0;
			for(int i : list) {
			sum += arr[i];	
			}
			
			if(sum == s) {
				result ++;
			}
		}
		for(int i =start; i<n; i++) {
			list.add(i);
			recur(list, arr, i+1, s, n);
			list.remove(list.size()-1);
		}
	}
}
