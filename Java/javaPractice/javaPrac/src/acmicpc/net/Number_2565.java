package acmicpc.net;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


//https://www.acmicpc.net/problem/2565
//�ذ�
public class Number_2565 {
	
	static class Line{
		int a;
		int b;
		Line(int a, int b){
			this.a = a;
			this.b = b;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Line> lines = new ArrayList<Line>();
		for(int i =0; i<n; i++) {
			lines.add(new Line(sc.nextInt(),sc.nextInt()));
		}
		
		Collections.sort(lines, new Comparator<Line>() {
			@Override
			public int compare(Line o1, Line o2) {
				// TODO Auto-generated method stub
				return o1.a - o2.a;
			}
		});
			
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for(int i =0; i< lines.size(); i++) {
			int value = lines.get(i).b;
			if(list.get(list.size()-1) < value) {
				list.add(value);
			}
			else {
				int index = binarySearch(list, value);
				if(index <0)
					index = (index+1)*(-1);
				
				list.set(index, value);
			}
		}
		
		System.out.println(n-(list.size()-1));
}
	
	static int binarySearch(List<Integer> list, int num) {
		int left =0;
		int right = list.size()-1;
		
		while(left <= right) {
			int p = (right+left)/2;
			
			if(list.get(p) == num )
				return p;
			else if(list.get(p) > num ) {
				right = p-1;
			}
			else
				left = p+1;
		}		
		return (left+1)*(-1);		
	}
	
}
