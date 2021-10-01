package acmicpc.net;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1744
//ÇØ°á
public class Number_1744 { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		PriorityQueue<Integer> qp = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> qm = new PriorityQueue<Integer>();
		
		int result =0;
		
		for(int i =0; i<n; i++) {
			int num = sc.nextInt();
			if(num >0)
				qp.add(num);
			else
				qm.add(num);		
		}
		
		while(qm.size()>1) {
			result += qm.poll() * qm.poll() ;
		}
		if(qm.size() !=0)
			result+=qm.poll();
		
		while(qp.size()>1) {
			int num1 = qp.poll();
			int num2 = qp.poll();
			if(num1==1 || num2==1)
				result += num1 + num2 ;
			else
				result += num1 * num2 ;
		
		}
		if(qp.size() !=0)
			result+=qp.poll();
		
		System.out.println(result);
	}

	

}
