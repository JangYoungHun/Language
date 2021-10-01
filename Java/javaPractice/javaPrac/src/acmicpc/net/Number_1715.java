package acmicpc.net;

import java.util.PriorityQueue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1715
//ÇØ°á
public class Number_1715 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long result = 0;
		int n =sc.nextInt();
		PriorityQueue<Long> q = new PriorityQueue<Long>();
		
		for(int i =0; i<n; i++) {
			q.add((long)(sc.nextInt()));
		}
		
		while(q.size()>1) {
		long sum = q.poll() + q.poll();
		result += sum;
		q.add(sum);
		}
		
		System.out.println(result);
	}

}
