package study;
//p.67
//���� ��ȯ 
public class CardConvRev {
	static final String dChar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
	public static void main(String[] args) {
		char[] arr = new char[32];  // �ִ� 32bit
		int x = 128;
		int length = cardConvR(arr,x,2);
		for(char c : arr) {
			System.out.print(c);
		}
	}

	static int cardConvR(char[] arr, int x, int r) {     // x ��ȯ ��� �� , r ���� 
		
		int index =0;
		do {
		arr[index++] = dChar.charAt(x%r);
		x /= r;
		}while(x!=0);
		
		return index;
		
	}
}
