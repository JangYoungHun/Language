package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1712
// �ذ�
public class Number_1712 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		int A = scanner.nextInt();  // �������
		int B = scanner.nextInt();  // ���� + �ΰǺ�
		int C = scanner.nextInt();  // ��ǰ �ǸŰ���
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
