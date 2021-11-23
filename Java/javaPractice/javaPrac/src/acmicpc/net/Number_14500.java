package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class Number_14500 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		// 5鯵税 鷺薫
		//1
		// けけけけ
		// 2 亜走 井酔
		// 亜稽
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 3; j++) {
				int sum = 0;
				for (int k = j; k < j + 4; k++) {
					sum += arr[i][k];
				}
				result = Math.max(result, sum);
			}
		}

		// 室稽
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n - 3; j++) {
				int sum = 0;
				for (int k = j; k < j + 4; k++) {
					sum += arr[k][i];
				}
				result = Math.max(result, sum);
			}
		}
		// 2
		// けけ
		// けけ
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i][j+1] +arr[i+1][j+1];
				result = Math.max(result, sum);
			}
		}
		
		// 3
		// けけけ 
		//	  け			
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +arr[i+1][j+1];
				result = Math.max(result, sum);
			}
		}
		
		// 
		//    け
		// けけけ
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +arr[i-1][j+1];
				result = Math.max(result, sum);
			}
		}
		
		
		//    け
		// けけ
		//    け
		for (int i = 1; i < n-1; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] +arr[i-1][j+1];
				result = Math.max(result, sum);
			}
		}
	
		// け
		// けけ
		// け		
		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < m; j++) {
				int sum = arr[i][j] + arr[i][j-1] + arr[i+1][j-1] +arr[i-1][j-1];
				result = Math.max(result, sum);
			}
		}
				
		// 4
		// け 
		// け
		// けけ 
		
		for (int i = 0; i < n-2; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] +arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}
		
		
		//    け 
		//    け
		// けけ 	
		for (int i = 2; i < n; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i-1][j+1] +arr[i-2][j+1];
				result = Math.max(result, sum);
			}
		}
				
		// けけ 
		//    け
		//    け 	
		for (int i = 0; i < n-2; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] +arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}	
		
		// けけ 
		// け
		// け	
		for (int i = 0; i < n-2; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] +arr[i][j+1];
				result = Math.max(result, sum);
			}
		}
		
		
		//  	 け 
		// けけけ	
		for (int i = 0; i < n-1; i++) {
			for (int j = 2; j < m; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+1][j-1] +arr[i+1][j-2];
				result = Math.max(result, sum);
			}
		}
		
		
		// け 
		// けけけ		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] +arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}	
		
		
		// けけけ
		// け 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +arr[i+1][j];
				result = Math.max(result, sum);
			}
		}	
		
		 
		// けけけ
		// 	     け
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}	
		
		
		
		// 5 
		
		// け
		// けけ
		//    け
		
		for (int i = 0; i < n-2; i++) {
			for (int j = 0; j < m-1; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] +arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}	
		
		
		//    け
		// けけ
		// け
		for (int i = 0; i < n-2; i++) {
			for (int j = 1; j < m; j++) {
				int sum = arr[i][j] + arr[i+1][j] + arr[i+1][j-1] +arr[i+2][j-1];
				result = Math.max(result, sum);
			}
		}	
		
		
		//    けけ
		// けけ
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i-1][j+1] +arr[i-1][j+2];
				result = Math.max(result, sum);
			}
		}	
		
		
		//けけ
		//   けけ
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] +arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}	
		
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}

}
