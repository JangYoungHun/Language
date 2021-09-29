package Format;

public class fibonacci_Format {

	public static void main(String[] args) {
		
		// 숫자 넣기 
		int n = 0;
		
		int d[] = new int[1001] ;
		
		for(int i =1; i<20; i++) {
		System.out.println(pibonacci(d, i));
	    }
	}
	
	static int pibonacci(int d[], int num) {		
			if(num==0) {
				return 0;
			}		
			else if(num==1) {
				return 1;
			}
			else {
				if(d[num] != 0)
					return d[num];			
				else
					return d[num] = pibonacci(d, num-1) +  pibonacci(d, num-2);
			}		
	}
	

}
