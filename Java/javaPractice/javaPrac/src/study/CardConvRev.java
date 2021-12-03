package study;
//p.67
//진수 변환 
public class CardConvRev {
	static final String dChar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
	public static void main(String[] args) {
		char[] arr = new char[32];  // 최대 32bit
		int x = 128;
		int length = cardConvR(arr,x,2);
		for(char c : arr) {
			System.out.print(c);
		}
	}

	static int cardConvR(char[] arr, int x, int r) {     // x 변환 대상 값 , r 진수 
		
		int index =0;
		do {
		arr[index++] = dChar.charAt(x%r);
		x /= r;
		}while(x!=0);
		
		return index;
		
	}
}
