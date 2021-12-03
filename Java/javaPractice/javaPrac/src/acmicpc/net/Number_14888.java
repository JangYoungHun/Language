package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;
//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=14888&from_mine=1
// ÇØ°á
public class Number_14888 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int result = 0;
	static int N ;
	static long max= -1000000000;
	static long min= 1000000000;
	static int nums[];
	static int calculator[]; 
	static int numCal;
	static List<Integer> calList = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		

	     N = Integer.parseInt(br.readLine());
	   
		nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		
		calculator = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
				
		List<Integer> list = new ArrayList<>();
		
		for(int i =0; i<calculator.length; i++) {
			numCal += calculator[i]; 
		}
		for(int i =0; i<calculator.length; i++) {
			for(int j =0; j<calculator[i]; j++) {
				calList.add(i);             //0  : +  1: -  2: *  3: /
			}
		}
		
		
		Solution(list, 0);
		bw.write(String.valueOf(max));
		bw.write("\n");
		bw.write(String.valueOf(min));
		br.close();
		bw.close();
		 
	}

	static void Solution (List list,  int count) {
		if(count == calList.size()) {
			//System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
			
			long result = nums[0];
			int k =1;
			for(int i=0; i< calList.size(); i++ ) {
				
				switch( calList.get((int)list.get(i))) {
				
				case 0 :  result += nums[k++];   break;
				case 1 :  result -= nums[k++]; break;
				case 2 :  result *= nums[k++]; break;
				case 3 :  if(result <0 ) result = (Math.abs(result) / nums[k++] )*(-1);
							else result =result / nums[k++] ;
							break;
				}		
			}
			max = Math.max(max, result);
			min = Math.min(min, result);
			
			return;
		}
		for(int i =0; i<numCal; i++) {
			if(!list.contains(i) ) {
				list.add(i);			
				Solution(list, count+1);
				list.remove(list.size()-1);		
		}
	
}
	}
}
