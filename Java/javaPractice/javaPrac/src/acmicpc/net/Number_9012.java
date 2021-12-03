package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=9012&from_mine=1
//ÇØ°á
	
public class Number_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
	
		int cntr = 0;
		int cntl = 0;
		char[] chs;
		
		for(int i =0; i <N; i++) {
		chs = sc.nextLine().toCharArray();	
			if(chs.length%2 != 0 || chs[0] == ')' || chs[chs.length-1] == '(' ) {
				System.out.println("NO");
				continue;
			}

			else {	
				for(int j=0; j <chs.length;  j++) {
					
					if(cntl > cntr ) {
						break;
					}
					
					else if( chs[j] == '(')
						cntr++;
					else if(chs[j] == ')')
						cntl++;
						
				}
				
				if(cntr == cntl)
					System.out.println("YES");
				else if(cntl > cntr || cntr != cntl)
					System.out.println("NO");
				
				cntr = 0;
				cntl = 0;
				
			}
			
		}
		

	}

}
