package Format;

public class Factorial_Format {

	public static void main(String[] args) {
		

	}
	
	//factorial은 반복문이 더빠르다 
	
	//재귀
	static int factorial(int n) {
		if(n==1)
			return 1;
		
		return n*factorial(n-1);
	}
	
}
