package acmicpc.net;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2164
//ÇØ°á
public class Number_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		int result = 0;;
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			if(q.size() ==1) {
				result = q.poll();
				break;
			}		
			q.poll();
			int top = q.poll();
			q.add(top);	
		}
		
		System.out.println(result);
	}

}
