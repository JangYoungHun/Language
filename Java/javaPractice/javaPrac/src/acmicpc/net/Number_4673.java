package acmicpc.net;

//https://www.acmicpc.net/problem/4673
//�ذ�
public class Number_4673 {

	public static void main(String[] args) {
		int arr[] = new int[10001];
		arr[0] = 1;           //index�� ���� ��Ī ��Ű�� ����
		
		int i= 1;
		while(i < 10000) {	
			int num = i/10000 +  (i%10000) /1000 +  (i%1000)/100 +   (i%100)/10 + i%10+i;
			if(num<=10000) {
				arr[num] = 1;       			
			}
			 i++;
		}
		
		
		for(int j =1; j<arr.length; j++) {
			if(arr[j] !=1)
				System.out.println(j);
		}
		
	}

}
