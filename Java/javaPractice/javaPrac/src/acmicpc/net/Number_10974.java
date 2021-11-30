package acmicpc.net;

import java.util.ArrayList;
import java.util.Scanner;

//ÇØ°á
public class Number_10974 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 pick(new ArrayList<Integer>(), n);
		
	}
	
	
	public static void pick(ArrayList<Integer> list, int n) {
		if(list.size() == n) {
			list.stream().forEach(item -> System.out.print(item+" "));
			System.out.println();
		}
		
		for(int i =1; i<=n; i++) {
			if(!list.contains(i)) {
				list.add(i);
				pick(list, n);
				list.remove(list.size()-1);
			}
		}
	}
}
