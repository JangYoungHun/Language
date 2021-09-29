package acmicpc.net;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1431
//ÇØ°á
public class Number_1431 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		for(int i=0; i<n; i++) {
			strs[i] = sc.next();
		}
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return o1.length() > o2.length() ? 1 : -1;					
				}
				else {		
					int sum1 =0;
					int sum2 =0;
					
					for(int i=0; i<o1.length(); i++) {
						try {
							sum1 += Integer.parseInt(o1.substring(i ,i+1));
						}
						catch(Exception e) {
							continue;
						}
					}
					
					for(int i=0; i<o2.length(); i++) {
						try {
							sum2 += Integer.parseInt(o2.substring(i ,i+1));
						}
						catch(Exception e) {
							continue;
						}
					}
					
					if(sum1 == sum2) {
						return o1.compareTo(o2);
					}
					else
						return sum1 >sum2 ? 1 :-1;
				}			
			};
			
		};
		
		Arrays.sort(strs, comparator);
		
		for(int i=0; i<n; i++) {
			System.out.println(strs[i]);
		}
		
	
	}
	
}
