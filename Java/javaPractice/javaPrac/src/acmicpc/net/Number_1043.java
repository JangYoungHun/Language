package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Number_1043 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nm[0];
		int m = nm[1];
		
		int a[] =  Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int result = 0;
		
		boolean kn[] = new boolean[n+1]; 
		
		List<Integer> know = new ArrayList<Integer>();
		for(int i=1; i<=a[0]; i++) {
			know.add(a[i]);
		}
		
		int p[] = new int[n+1];
		for(int i =0; i<=n; i++) {
			p[i] = i;
		}
		
		List<int[]> list = new ArrayList<int[]>(); 
		for(int i=0; i<m; i++) {
			int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();				
			list.add(Arrays.copyOfRange(arr, 1, arr.length));
			for(int j =1; j<arr.length; j++) {
				for(int k =j+1; k<arr.length; k++) {
					union(p, arr[j], arr[k]);
				}
			}			
		}
		
		for(int i : know) {
			for(int j =0; j<p.length; j++) {
				if(find(p,i,j))
					kn[j] = true;
			}
		}
	
		for(int[] arr : list) {
			if(Arrays.stream(arr).filter(it -> kn[it]).count() == 0)
				result++;
		}
		
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	static int getParent(int[] p, int num) {
		if(num == p[num])
			return num;
		
		return getParent(p, p[num]);
	}
	
	static void union(int[] p, int num1, int num2) {
		int p1 = getParent(p, num1);
		int p2 = getParent(p, num2);
		
		if(p1 < p2) 
			p[p2] = p1;
		else
			p[p1] = p2;
	}
	
	static boolean find(int[] p, int num1, int num2) {
	
		if(getParent(p, num1) == getParent(p, num2))
			return true;
		return false;
	}
	
}
