package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1712
// 해결
public class Number_1712 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		int A = scanner.nextInt();  // 고정비용
		int B = scanner.nextInt();  // 재료비 + 인건비
		int C = scanner.nextInt();  // 제품 판매가격
		int count =0;
		try {
		count = A/(C-B) + 1;
		}
		catch (Exception e) {
			count = -1;
		}
		
		System.out.println(count < 0 ? -1 : count);
		
				
	}

}
