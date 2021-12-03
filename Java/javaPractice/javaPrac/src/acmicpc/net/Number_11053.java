package acmicpc.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11053
// ÇØ°á
public class Number_11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(sc.nextInt());
		
		for(int i =1; i<n; i++) {
			int num = sc.nextInt();
			
			for(int j=list.size()-1; j>=0; j--) {
			if(list.get(j) < num) {
				if( j==list.size()-1) {
					list.add(num);
					break;
				}		
				list.set(j+1, num);
				break;
				}
			
			if(j==0) {
				list.set(j, num );
			}
			}
			
		}
	
		System.out.println(list.size());
	}

}
