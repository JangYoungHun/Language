package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Number_14002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
 		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		int[] result = new int[n];
		
		for(int i =1; i<n; i++) {
			int last = list.get(list.size()-1);
			if(last < arr[i]) {
				list.add(arr[i]);
				result[i] = list.size()-1;
			}else {
				int pos = search(list,arr[i]);
					list.set(pos, arr[i]);
					result[i] = pos;
			}
		}
		
		int len = list.size();
		bw.write(String.valueOf(len));
		bw.write("\n");

		StringBuilder sb = new StringBuilder();
		
		List<Integer> li = new ArrayList<Integer>();
		for(int i = n-1; i>=0; i--) {
			if(result[i] == len -1) {
				li.add(arr[i]);
				len --;
			}
		}

		li.sort(null);
		
		for(int i : li) {
			bw.write(String.valueOf(i));
			bw.write(" ");
		}
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	
	
	public static int search(List<Integer> list, int find) {
		
		int left =0;
		int right=list.size()-1;
		
		while(left <= right) {
			int mid = (right+left)/2;
			
			if(list.get(mid) > find) {
				right = mid -1;
			}else if(list.get(mid) < find) {
				left = mid +1;
			}else {
				return mid;
			}		
		}
		
		return left;
		
	}
	
	
	
	
}
