package acmicpc.net;
import java.util.Scanner;

public class Number_1931 {
	static int N;
	static int start[];
	static int end[];
	static int term[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		start = new int[N];
		end = new int[N];
		term = new int[N];
		
		for(int i =0; i < N; i++) {
			
			int num1 =scanner.nextInt();
			int num2 =scanner.nextInt();
			int num3 = num2-num1;
			start[i] = num1;
			end[i] = num2;
			term[i] = num3;		
		}
		 System.out.println(search());

		}
	
	static int search() {	
		int count = 0;
		for(int i=0; i<N; i++ ) {
			int cnt = search(i, 0);		
			cnt = Math.max(count, cnt);
			count = cnt;		
		}
		
		return count;
	}
	
	
	static int search(int sTime, int count) {
		
		int cnt = count;
		
		for(int i=0; i<N; i++ ) {
			if(start[i] == sTime) {
				cnt =Math.max(search(end[i], count++), cnt) ;
			}			
	      }
		return count;			
}
}
