package DoIt;
//100 ���� �Ҽ� ���
//p.74 p.75    //�Ҽ����� üũ
public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i =2; i<=100; i++) {
			int j;
			for(j=2; j < i; j++) {
				if( i%j ==0 )
					break;			
			}	
			if(i==j)
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.print(checkPrimeNum(79));
	}

	
	static boolean checkPrimeNum(int num) {
		boolean primeNum = true;
		if(num < 2)
			primeNum = false;
		for(int i = 2; i<num; i++) {
			if(num % i  == 0) {
				primeNum = false;
				break;
			}
		}
		return primeNum;
	}
	
	
	
}
