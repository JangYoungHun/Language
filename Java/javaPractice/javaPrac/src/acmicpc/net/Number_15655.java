package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Number_15655 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		int arr[] =  Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(arr);
		
		solution(new ArrayList<Integer>(), arr, m, 0);
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void solution(ArrayList<Integer> list, int arr[], int m, int start) {
		if(list.size() == m) {
			
			list.stream().map(item -> arr[item]).forEach(item -> System.out.print(item+ " "));		
			System.out.println();
			return;
		}
		
		for(int i =start; i<arr.length; i++) {
			list.add(i);
			solution(list, arr, m, i+1);
			list.remove(list.size()-1);
		}
	}

}
