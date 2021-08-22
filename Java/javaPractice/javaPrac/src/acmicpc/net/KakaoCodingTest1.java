package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
//1. 비밀 지도(난이도: 하)
public class KakaoCodingTest1  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		String[] result = new String[n];
		

		for(int i=0; i < n; i++) {	
			int bitPos = 1;  // 1 2 4 8 ..... 2^n
			String resultStr = "" ;
			for(int j=0; j < n; j++) {
				int arr = arr1[i] | arr2[i];					
				resultStr= ( (arr&bitPos) > 0 ? "#" : " ") + resultStr ; 
				bitPos =  bitPos << 1;
			}
			result[i] = resultStr;
			
			bw.write(result[i]+"\n");
		}

		
		
		
		
		
		br.close();
		bw.close();
	}

}
