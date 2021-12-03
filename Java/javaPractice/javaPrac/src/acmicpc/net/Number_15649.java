package acmicpc.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
//ÇØ°á

public class Number_15649 {
	static int M;
	static int N ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     N = sc.nextInt();
		M = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		Solution(list, 0);
		
		
	}

	static void Solution(List list, int count) {
		if(count == M) {
			System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
		}
		for(int i =1; i<=N; i++) {
			if(!list.contains(i)) {
				list.add(i);			
				Solution(list, count+1);
				list.remove(list.size()-1);
			}
		}
			
	}

	
}
