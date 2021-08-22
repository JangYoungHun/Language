package acmicpc.net;

import java.util.Scanner;

// https://www.acmicpc.net/problem/16953
//ÇØ°á

public class Number_16953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int cnt =0;
		while(true) {
			if(B==A) {
				cnt++;
				break;
			}
			else if(B<A) {
				cnt = -1;
				break;
			}
			
			if(B%10 ==1 )  {
				B /= 10;	
				cnt++;
			}
			else if(B%2 == 0) {
				B /= 2;	
				cnt++;
			}
			
			else {
				cnt = -1;
				break;
			}
	
		}
		System.out.println(cnt);
	}

}
