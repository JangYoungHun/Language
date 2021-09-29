		package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2869
// 해결
public class Number_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//속도 문제
//		Scanner scanner = new Scanner(System.in);
//		int A =scanner.nextInt();
//		int B =scanner.nextInt();
//		int V =scanner.nextInt();
		
		String str[] = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		int days = 0;
		
		//(A-B)* i + A
		//  (A-B)*days+A >= V 
		//  days >= (V-A)/(A-B)
		days = (V-A)/(A-B);
		if( (V-A)%(A-B) != 0)
			days++;

		bw.write(String.valueOf(days+1));
		
		br.close();
		bw.close();
	}

}
