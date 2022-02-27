package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//ÇØ°á
public class Number_2352 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		for(int i =1; i<n; i++) {
			int cri =list.get(list.size()-1);
			if(cri < arr[i]) {
				list.add(arr[i]);
			}else if(cri > arr[i]) {
				list.set(binarySearch(list, arr[i]), arr[i]);
			}
		}
		
		bw.write(String.valueOf(list.size()));
		bw.flush();
		br.close();
		bw.close();
		}
	
		public static int binarySearch(List<Integer> list, int num) {
			int left = 0;
			 int right = list.size()-1;
			 
			 while(left <= right) {
				 int mid = (left+right)/2;
				 
				 int n = list.get(mid);
				 if( n< num) {
					 left = mid+1; 
				 }else if(n > num) {
					 right = mid-1;
				 }else {
					 return mid;
				 }
			 }
			 
			 return left;
		}
}
