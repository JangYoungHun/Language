package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/17298
//해결
// Stack에 값이 아닌 index를 넣는 방법     중요
public class Number_17298{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		int nge[] = new int[n];
		
		Arrays.fill(nge, -1);

	
		Stack<Integer> stack = new Stack<Integer>();

		
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		stack.add(0);
		for(int i =1; i<n; i++) {
			while(!stack.isEmpty()) {
			if(arr[i] > arr[stack.peek()]) {
				nge[stack.pop()] = arr[i];				
			}
			else
				break;
			}
			stack.add(i);
		}
		
		for(int i : nge)
			bw.write(String.valueOf(i)+ " ");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
