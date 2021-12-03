package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/17438
public class Number_17438 {


	
	public static void main(String[] args) throws IOException {

		String[][] grid;
		int col;
		int row;
	
		String str = "";
		
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		str = br1.readLine();	
		br1.close();	
		
		String[] str_1 =  str.split(" ");
		row = Integer.parseInt(str_1[0]);
		col = Integer.parseInt(str_1[1]);
		
		grid = new String[row][col];
		
		for(int i =0; i < row; i++) {
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			str = br2.readLine();				
			br2.close();
			
			String[] str_2 =  str.split(" ");
			
			for(int j = 0; j < col; j++) {
				
				grid[i][j] =  str_2[j];
				
				}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
