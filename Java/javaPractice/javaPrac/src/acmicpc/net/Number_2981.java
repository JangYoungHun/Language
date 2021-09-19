package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=2981&from_mine=1
//ÇØ°á

public class Number_2981 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int gcd = arr[1]- arr[0];
		
		for(int i = 2; i<n; i++) {
			gcd = gcd(gcd,arr[i] - arr[i-1]);
		}		
		
		for(int i =2; i<=gcd; i++) {
			if(gcd%i ==0)
				System.out.print(i+" ");			
		}
		
	}

	static int gcd(int n1, int n2) {

		if (n2 == 0)
			return n1;

		return gcd(n2, n1 % n2);
	}

}
