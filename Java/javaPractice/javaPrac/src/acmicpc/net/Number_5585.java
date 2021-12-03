package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/5585
//해결
public class Number_5585 {

//잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int changes[] = {500,100,50,10,5,1};
		int money = 1000 - scanner.nextInt();
		
		int count =0;
		int index =0;
		
		while(money != 0) {
			
			if(money >= changes[index]) {
				count += money / changes[index];
				money = money % changes[index];
			}
			
			index++;
		}

		System.out.println(count);
	}

}
