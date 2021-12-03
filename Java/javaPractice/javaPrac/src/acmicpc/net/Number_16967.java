package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//// https://www.acmicpc.net/problem/16967
// ÇØ°á
public class Number_16967 {

	public static void main(String[] args) throws IOException{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		   int h = nums[0];
		   int w = nums[1];
		   int x = nums[2];
		   int y = nums[3];
		   
		   int a[][] = new int[h][w];
		   
		   int b[][] = new int[h+x][w+y];
		   
		   for(int i =0; i< x+h; i++) {
			   b[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		   }
		   
		   for(int i=0; i<h+x; i++) {
			   for(int j=0; j<w+y; j++) {
				   if(0<= i && i<x && 0<= j && j <w ) {
					   a[i][j] = b[i][j];
				   }
				   if( 0 <= i  && i<h && 0<= j && j < y ) {
					   a[i][j] = b[i][j];
				   }
				   if(x<=i && i<h && y<=j && j<w )
					   a[i][j] = b[i][j] - a[i-x][j-y];
			   }
 		   }
		   
	
		   for(int i =0; i <h; i++) {
			   for(int j =0; j <w; j++) {
				   System.out.print(a[i][j] + " ");
			   }
			   System.out.println();
		   }
		   
		   br.close();
		   
	}

}
