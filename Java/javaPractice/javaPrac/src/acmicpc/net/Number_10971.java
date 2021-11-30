package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Number_10971 {
	static int arr[][];
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][];
		for(int i =0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		 pick(new ArrayList<Integer>(),n);
		 
		 bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}

	
	public static void pick(ArrayList<Integer> list, int n) {
		if(list.size() == n) {
			int sum = 0;
			for(int i =0; i<n-1; i++) {
				int dis = arr[list.get(i)][list.get(i+1)];
				
				if(dis ==0)
					return;				
				sum += arr[list.get(i)][list.get(i+1)];		
			}
			int dis2  = arr[list.get(n-1)][list.get(0)];	
			
			if(dis2 ==0)
				return;			
			sum += 	dis2;
			result = Math.min(result, sum);
			return;
		}
		
		for(int i =0; i<n; i++) {
			
			if(!list.contains(i)) {
				list.add(i);
				pick(list, n);
				list.remove(list.size()-1);
			}
		}
	}
	
}
