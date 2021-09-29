package acmicpc.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15650
//ÇØ°á

public class Number_15651 {
	static int M;
	static int N ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     N = sc.nextInt();
		M = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		Solution(list,1, 0);
		
		
	}

	static void Solution(List list, int start, int count) {
		if(count == M) {
			System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
		}
		for(int i =start; i<=N; i++) {
			if(!list.contains(i)) {
				list.add(i);			
				Solution(list,i, count+1);
				list.remove(list.size()-1);
			}
		}
			
	}

	
}
