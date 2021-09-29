package acmicpc.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//https://www.acmicpc.net/problem/10773
// ÇØ°á
public class Number_10773 {
	static ArrayList<Integer> arrayList = new  ArrayList<Integer>();
	static int pointer = 0;
	
	
	public static void main(String args[]) {
	   Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();	   

	   for(int i =0; i<N; i++) {
		  int num = scanner.nextInt();
		  if(num ==0)
			  pop();
		  else
			  push(num);
		  
	}

	   
	   int result = 0;
	   for(int i =0; i < arrayList.size(); i++) {
		   
		   result += arrayList.get(i);
		   
	   }
	   
	   System.out.println(result);
	   
   }
	
	public static void push(int value) {
		arrayList.add(value);
	}
	
	
	
	public static void pop() {
		if(arrayList.size() > 0)		{
		arrayList.remove(arrayList.size()-1);}
		else
			System.out.println(-1);
	}

}
	
	

