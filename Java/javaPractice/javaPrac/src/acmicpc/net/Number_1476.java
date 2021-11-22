package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class Number_1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int  limit1 = 15;
		int  limit2 = 28;
		int  limit3 = 19;
	
		int max = 7980;
		
		int i =1;
		while(i<7980) {
			
			if(arr[0] == 1 && arr[1] == 1 && arr[2] == 1) {
				break;
			}
			
			arr[0]--;
			arr[1]--;
			arr[2]--;
			
			arr[0] = arr[0]==0 ? 15 :arr[0];
			arr[1] = arr[1]==0 ? 28 :arr[1];
			arr[2] = arr[2]==0 ? 19 :arr[2];
			
			i++;
		}
	
		System.out.println(i);
		
		bw.flush();
		bw.close();
		br.close();
	}

}
