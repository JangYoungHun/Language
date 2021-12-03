package Programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1920
//ÇØ°á
public class Number_1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr1[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();		
		Arrays.sort(arr1);
		int m = Integer.parseInt(br.readLine());
		int arr2[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for(int i=0; i<m; i++) {
			int result = binarySearch(arr1, arr2[i]);
			if(result >=0)
				System.out.println(1);
			else
				System.out.println(0);
		}	
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int binarySearch(int[] arr, int num) {
		
		int left = 0;
		int right = arr.length-1;
		int mid = 0;
		while(left<=right) {
			mid = (left+right)/2;
			
			if(arr[mid] == num)
				return mid;		
			else if(arr[mid] > num) 
				right = mid-1;			
			else
				left = mid+1;			
		}		
		return (left+1)*(-1);		
	}	
}
