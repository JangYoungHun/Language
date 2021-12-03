package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//https://www.acmicpc.net/problem/10828
// ÇØ°á
public class Number_10828 {
	static ArrayList<Integer> arrayList = new  ArrayList<Integer>();
	static int pointer = 0;
	
	
	public static void main(String args[]) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	   
	   String str;
	   int value;
	   for(int i =0; i<N; i++) {
		   str = br.readLine();
		   
		   if(str.startsWith("push"))
			   push(Integer.parseInt(str.split(" ")[1]));
		   else {
		   switch(str) {

		   		 
		   	case "pop" : 
		   		pop();
		   		break;
		   		
		   	case "size" :   
		   		size();
		   	break;
		   	
		   	case "empty" :
		   		empty();
		   		break;
		   	
		   	case "top" :  
		   		top();
		   		break;
		   }
		   
	   }
	   }
	   br.close();
	}
		
	
	
	public static void push(int value) {
		arrayList.add(value);
	}
	
	
	public static void empty() {
		int empty = arrayList.size();
		if(empty==0)
			System.out.println(1);
		else
			System.out.println(0);
	}	
	
	
	public static void pop() {
		if(arrayList.size() > 0)		{
		System.out.println(arrayList.get(arrayList.size()-1));
		arrayList.remove(arrayList.size()-1);}
		else
			System.out.println(-1);
	}
	
	public static void top() {
	if(arrayList.size() > 0)	
	System.out.println(arrayList.get(arrayList.size()-1));
	else
		System.out.println(-1);
	}
	
	
	public static void size() {
		System.out.println(arrayList.size());
	}

	
	
   }

	

