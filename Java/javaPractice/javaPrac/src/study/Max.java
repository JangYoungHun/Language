package study;
import java.util.Scanner;

// p.13 
//�ִ�
public class Max {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a �� �Է� : ");   a = scanner.nextInt();
		System.out.println("b �� �Է� : ");   b = scanner.nextInt();
		System.out.println("c �� �Է� : ");   c = scanner.nextInt();
		
		int max = a;
		if(max<b)
			max = b;
		if(max<c)
			max =c;
		
		System.out.println("�ִ밪 " + max);   
		
		

	}

}
