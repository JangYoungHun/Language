package acmicpc.net;

import java.util.ArrayList;
import java.util.Scanner;
//ÇØ°á
public class Number_15652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		solution(new ArrayList<Integer>(), 1, n, m);
	}

	public static void solution(ArrayList<Integer> list, int start,int n, int m) {
		if(list.size() == m) {
			for(int i =0; i<list.size()-1; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println(list.get(list.size()-1));
			return;
		}
		
		for(int i = start; i<n+1 ;i++) {
			list.add(i);
			solution(list, i, n, m);
			list.remove(list.size()-1);
		}
		
	}
}
