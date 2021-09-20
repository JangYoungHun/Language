package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/2630
//해결
public class Number_2630 {

	static int blue = 0;
	static int white = 0;
	static int arr[][] ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		solution(0, 0, n-1, n-1); 
		System.out.println(white);
		System.out.println(blue);	
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	
	static void solution(int x1, int y1, int x2, int y2) {
		
		int color = arr[x1][y1];
		for(int i=x1; i<=x2; i++) {
			for(int j=y1; j<=y2; j++) {
				if(arr[i][j] != color) {
					solution(x1, y1, (x1+x2)/2, (y1+y2)/2);
					solution(x1,(y1+y2)/2+1, (x1+x2)/2, y2);				
					solution((x1+x2)/2+1, y1, x2, (y1+y2)/2 );		
					solution((x1+x2)/2+1, (y1+y2)/2+1, x2, y2);
					return;
				}
			}
		}
		
		//색이 다 같으면
		if(color == 1)
			blue ++;
		else
			white ++;
	}

}
