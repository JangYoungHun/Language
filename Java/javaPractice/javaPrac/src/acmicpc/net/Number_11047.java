package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11047
//ÇØ°á

public class Number_11047 {

	public static void main(String args[]) {
	   
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		int cnt = 0;

		for(int i=0; i < N; i++) {
			A[i] = sc.nextInt();
		}		
		
		int i = N-1;
		
		while(K > 0) {
			
		for(int j=i; j >= 0; j--) {
	
				if(K - A[j] > 0) {
					K -= A[j];
					cnt++;
					i = j;
					break;
				}
				else if((K - A[j]) == 0) {
					K -= A[j];
					cnt ++;
					break;
				}
			}

		}
		System.out.println(cnt);
		
		}

   }

	

