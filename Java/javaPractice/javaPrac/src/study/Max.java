package study;
import java.util.Scanner;

// p.13 
//최댓값
public class Max {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a 값 입력 : ");   a = scanner.nextInt();
		System.out.println("b 값 입력 : ");   b = scanner.nextInt();
		System.out.println("c 값 입력 : ");   c = scanner.nextInt();
		
		int max = a;
		if(max<b)
			max = b;
		if(max<c)
			max =c;
		
		System.out.println("최대값 " + max);   
		
		

	}

}
