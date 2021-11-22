package acmicpc.net;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_2309 {

	static ArrayList<Integer> resultList = new ArrayList<Integer>();
	static 	int arr[] = new int[9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		for(int i =0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		pick(new ArrayList<Integer>(), -1);
		
		resultList.sort(null);
		for(int i : resultList)
			System.out.println(i);
	}
	
	public static void pick(ArrayList<Integer> list, int start) {
		if(list.size() == 7) {
			
			if(resultList.size() !=0)
				return;
		
			int sum = 0;
			for(int i : list) {
				resultList.add(arr[i]);
				sum += arr[i];
			}
			

			if(sum != 100) 
				resultList.clear();

			return;
		}
		
		for(int i =start+1; i<9; i++) {
			list.add(i);
			pick(list,i);
			list.remove(list.size()-1);
		}
		
	}

}
