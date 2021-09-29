package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/9184
// ÇØ°á
public class Number_9184 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][][] value = new int[21][21][21];
			
		while(true) {
			int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
			int a = nums[0];
			int b = nums[1];
			int c = nums[2];
			if(a == -1 && b== -1 && c== -1)
				break;
			
			for(int i=1; i<21; i++) {
				for(int j=1; j<21; j++) {
					for(int k=1; k<21; k++) {
						value[i][j][k] = w(value,i,j,k);				
					}			
				}			
			}	
			System.out.println("w("+ a+", "+b+", "+c +") = " +w(value,a,b,c));
		
		
		}
		
		br.close();
	}

	static int w(int[][][] value, int a, int b,  int c) {
		

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		else if (a > 20 || b > 20 || c > 20) {
			if(value[20][20][20] != 0)
				return value[20][20][20];
			else {
				value[a][b][c] = w(value,20,20,20);
				return w(value,20,20,20);
			}
		}
			
		else if( a < b && b < c) {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			if(value[a][b][c-1] !=0 )
				num1 = value[a][b][c-1];
			else 
				num1 =w(value,a,b,c-1);
			
			if(value[a][b-1][c-1] !=0 )
				num2 = value[a][b-1][c-1];	
			else 
				num2 = w(value,a,b-1,c-1);
			
			if(value[a][b-1][c] !=0 )
				 num3 = value[a][b-1][c];	
			else 
				 num3 = w(value,a,b-1,c);
			
			return num1+num2-num3;
			
		}
		
		else {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 =0;
			
			if(value[a-1][b][c] !=0 )
				num1 = value[a-1][b][c];
			else 
				num1 =w(value,a-1,b,c);
			
			if(value[a-1][b-1][c] !=0 )
				num2 = value[a-1][b-1][c];	
			else 
				num2 =w(value,a-1,b-1,c);
			
			if(value[a-1][b][c-1] !=0 )
				 num3 = value[a-1][b][c-1];	
			else 
				num3 =w(value,a-1,b,c-1);
			
			if(value[a-1][b-1][c-1] !=0 )
				 num4 = value[a-1][b-1][c-1];	
			else 
				num4 =w(value,a-1,b-1,c-1);
			
			return num1+num2+num3-num4;

		}
		
		
	
		
	}
	
	
	
	
	
}
