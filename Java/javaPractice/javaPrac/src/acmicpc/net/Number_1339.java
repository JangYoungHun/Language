package acmicpc.net;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1339
// ÇØ°á
public class Number_1339 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[30];
		
		int visit[];	
		int N = sc.nextInt();

			
		for(int i=0; i<N; i++) {
			
			String str = sc.next();
			
			int len = str.length();
			
			for(int j=0; j<len; j++) {
				char ch = str.charAt(j);
				arr[(int)(ch-'A')] += (int)Math.pow(10,len-1-j);			
			}
		
		}
		
		Arrays.sort(arr);
	
		int result =0;
		int num =0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] != 0) {
				result += arr[i]*(9-num);		
				num++;
				}
				
		}
		
		System.out.println(result);
	}
}
