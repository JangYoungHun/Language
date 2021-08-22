package acmicpc.net;

import java.util.Scanner;

public class Number_13413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int result =0;
		
		for(int j=0; j<testCase; j++) {
		int coinNum = sc.nextInt();
		String str1 = sc.next();
		String str2 = sc.next();
		int cnt1 = 0;        //현상태와 목표가 다를 때 현상태가  W
		int cnt2 = 0; 		//현상태와 목표가 다를 때 목표가 W 
		for(int i=0; i<coinNum; i++) {
			if(str1.charAt(i) != str2.charAt	(i) ) {
				if(str1.charAt(i) == 'W')
					cnt1++;
				else
					cnt2++;
				
			}
			
		}
	
		System.out.println(Math.max(cnt1, cnt2));
	
		}

	}

}
