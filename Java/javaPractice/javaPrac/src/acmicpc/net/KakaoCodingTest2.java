package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15953
//���� ���� ���� 
//���ذ� 
public class KakaoCodingTest2 {
	static int[] prize1 = {500,300,200,50,30,10};
	static int[] prize2 = {512,256,128,64,32};
	
	public static void main(String[] args) {
		
		int result =0;     // �� ��� 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();     // ���� Ƚ�� 
		
		for(int i = 0; i<T; i++) {
			
			int rank1 = sc.nextInt();
			int rank2 = sc.nextInt();
			
			//ù ��° ��ȸ ���
			if(rank1 <= 21 && rank1 != 0) {
				for(int j = 1; j <= 6; j++) {
					// �������� ��
					if(rank1<= (j*(j+1))/2) {     
						result +=prize1[j-1];
						break;
					}
				} 			
			}
			
			//�� ��° ��ȸ ���
			if(rank2 <= 31 && rank2 != 0) {
				// ������ ��
				for(int j = 1; j <= 5; j++) {
					if(rank2<= (int)Math.pow(2, j)  - 1 ) {
						result += prize2[j-1];
						break;
					}
				} 			
			}			
			
			
			// ��� ���
			System.out.println(result);
			result =0;		
		}		
	}

}
