package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;


//https://www.acmicpc.net/problem/14889
// ÇØ°á


public class Number_14889 {
	
	static ArrayList<String> visitList = new ArrayList<String>();
	static int[][] arr;
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][];
		for(int i =0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
	
		select(new ArrayList<Integer>(), 0, n);
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	static void select(ArrayList<Integer> list,int start, int n) {

		if(list.size() == n/2) {
			list.sort(null);
			if(visitList.contains(list.toString()))
				return;

			ArrayList<Integer> team2 = new ArrayList<Integer>();
			for(int i =0; i<n; i++){
				if(!list.contains(i))
					team2.add(i);
			}
			
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i<n/2-1; i++) {
				for(int j = i+1; j<n/2; j++) {
					sum1 += arr[list.get(i)][list.get(j)];
					sum1 += arr[list.get(j)][list.get(i)];
					sum2 += arr[team2.get(i)][team2.get(j)];
					sum2 += arr[team2.get(j)][team2.get(i)];
				} 
			}
			
			result = Math.min(result, Math.abs(sum1-sum2));
			
			return;
		}
		
		for(int i =start; i<n; i++) {
			list.add(i);
			select(list, i+1, n);
			list.remove(list.size()-1);
		}
		
	}
	


}
