package Format;

public class Factorial_Format {

	public static void main(String[] args) {
		

	}
	
	//factorial�� �ݺ����� �������� 
	
	//���
	static int factorial(int n) {
		if(n==1)
			return 1;
		
		return n*factorial(n-1);
	}
	
}
