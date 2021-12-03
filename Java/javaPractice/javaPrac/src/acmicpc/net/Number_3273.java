package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/3273
// 해결
// Scanner 시간초과
// BufferedReader  해결
public class Number_3273 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n =Integer.parseInt( br.readLine());				
		int nums[] = Stream.of( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = Integer.parseInt( br.readLine());	
		Arrays.sort(nums);
		
		int cnt =0;
		
		for(int i =0; i<n-1; i++ ) {
			if(nums[i]*2 > x )
				break;
			
			for(int j =i+1; j<n; j++ ) {		
				if((nums[i] + nums[j]) > x) {
				
					break;
				}
				else if(nums[i]+nums[j] == x)
					cnt++;
				}
		} 
		
		System.out.println(cnt);
		br.close();
		bw.close();
	}

}
