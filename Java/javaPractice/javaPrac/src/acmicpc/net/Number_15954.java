package acmicpc.net;


import java.util.Scanner;

//https://www.acmicpc.net/problem/15954
// 해결
public class Number_15954 {
	
	static double result = Double.MAX_VALUE;
	static int n ;
	static int arr[];
	static int k ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		arr= new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
	
		for(int h =k; h<=n; h++ ) {
			int nums[] = new int[h];
			for(int i=0; i<n-h+1; i++) {
				int p = i;
				for(int j=0; j<h; j++) {
					nums[j] = arr[p++];
				}	
				calc(nums, h);
			}
		}
		
		
		System.out.println(result);
	}
	
	static void calc(int[] arr, int h) {

			//평균구하기
			double sum = 0;		
			for(int i : arr) {
				sum = sum+i;
			}
			double avg = sum /(double)h;
			
			//분산구하기
			// ((a1 - m)2 + (a2 - m)2 + … + (aN - m)2) / N
			sum = 0;
			for(int i : arr) {
				sum = sum+ Math.pow(i-avg, 2);
			}
			
			//표준편차
			double dev = Math.sqrt(sum/(double)h);
			result = Math.min(result, dev);
			return;
		}
		

		
	}
	

