package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2110
//ÇØ°á
public class Number_2110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result =0;
		int n = sc.nextInt();
		int c = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = 1;
		int max = arr[n-1] - arr[0];
		
		while(min<=max) {
			int pre = arr[0];
			int cnt =1;			
			int mid = (min+max)/2;
			
			for(int i =0; i<n; i++) {
				if(arr[i] - pre >=mid) {
					pre = arr[i];
					cnt++;
				}
			}
			
			if(cnt >=c) {
				min = mid+1;
				result = mid;
			}
			else
				max = mid-1;
		}
		
		System.out.println(result);
	}

}
