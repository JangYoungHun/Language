package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

//https://www.acmicpc.net/problem/2447
// ÇØ°á

public class Number_2447 {
	
	static String pattern[] = {
			"   ",
			"***",
			"* *",
			"***"	
	};
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		String result[] = recur(N);

        for (int i = 1; i <  result.length;  i++){
        	System.out.println(result[i]);
        }
		
		
		}
	
	
	 static String[] recur(int num) {
		 if (num <=3) {
			 return pattern;
		 }
		 
	     String[] str = recur(num/3);
	     
		 String pat[] = new String[num+1];
	        for (int i = 0; i < pat.length;  i++){
	            pat[i] = "";
	        }
		   
	     String st = "";
		 
		 for(int i =0; i<3; i++) {
				st += str[0]; 
		 }
		 pat[0] = st;
	     
		 for(int i =1; i<=num/3; i++) {
			 String s="";
			 for(int j =0; j < 3; j++) {
				 s += str[i];
			 }
			 pat[i] += s;
		 }
		 
		 for(int i =num/3+1; i<=num/3*2; i++) {
			 String s="";
				 pat[i] += str[i-num/3]+str[0]+str[i-num/3];
			 
		 }

		 for(int i =num/3*2+1; i<=num/3*3; i++) {
			 String s="";
			 for(int j =0; j < 3; j++) {
				 s += str[i-num/3*2];
			 }
			 pat[i] += s;
			 
		 }
		 
		 
		 return pat;
		 
		 
	}

	
}


	