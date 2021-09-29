package acmicpc.net;

import java.util.Scanner;

// https://www.acmicpc.net/problem/15953
public class Number_15953 {

	public static void main(String[] args) {
			
		String assum = "";
		
		int money =0;
		int a = 0;
		int b = 0;
		int T = 0;
		int win_num1 = 0;
		int win_num2 = 0;
		int rank1 = 0;
		int rank2 = 0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		sc.nextLine();
				
		for(int i =0; i < T; i++) {
			
			money = 0;
			win_num1 = 0;
			win_num2 = 0;
					
		assum = sc.nextLine();
		String[] strs = assum.split(" ");
		
		a = Integer.parseInt(strs[0]);
		b = Integer.parseInt(strs[1]);	
		
		if(a <= 21 || b <= 31) {
			
		if(a <= 21)
		{
		for(int j =1 ; j < 7; j++)
		{			
			win_num1 += j;		
			if(a <= win_num1) {
				rank1 = j;
				break;
			}							
		}			
		}			
		if(b <= 31)
		{
		for(int j =1 ; j < 6; j++)
		{
			win_num2 += Math.pow(2, j-1);				
			if(b <= win_num2) {
				rank2 = j;
				break;
			}						
		}
		
		}
		
		switch(rank1)
		{
		case 1 : money += 500; break; 
		case 2 : money += 300; break; 
		case 3 : money += 200; break; 
		case 4 : money += 50; break; 
		case 5 : money += 30; break; 
		case 6 : money += 10; break; 	
		default : break;
		}
		
		
		switch(rank2)
		{
		case 1 : money += 512; break; 
		case 2 : money += 256; break; 
		case 3 : money += 128; break; 
		case 4 : money += 64; break; 
		case 5 : money += 32; break; 
		default : break;
		}
		
		
		}
		
		else
			break;
		
		
	
		System.out.println(money +" \n ");
		
		
		
		
		}
		
	
		sc.close();
	}
}
