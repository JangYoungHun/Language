package Programmers;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/1844
//해결
public class Number_1844 {

	public static void main(String[] args) {
		int nums[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		 solution(nums);
	}
	
	static class Position{
		int x;
		int y;
		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	
	 public static  int solution(int[][] maps) {

	        int m = maps.length;
	        int n = maps[0].length; 
	        
	        
	        Queue<Position> q = new LinkedList<>();
	        
	        q.add(new Position(0, 0));
	        maps[0][0] = 0;
	        int cnt =1;
	        
	        while(!q.isEmpty()) {
	        	int qSize = q.size();
	        	for(int i =0; i<qSize; i++) {
	        	Position pos = q.poll();
	        	int x = pos.x;
	        	int y = pos.y;
	        	
	        	if( x == m-1 && y ==n-1)
	        		return cnt;
	        	
	        	//오른쪽									
	        	if( y+1<n &&maps[x][y+1]==1 ) {
	        		q.add(new Position(x,y+1));	        
	        	 	maps[x][y+1] = 0;
	        	}
	        	//아래										
	        	if( x+1<m && maps[x+1][y]==1) {
	        		q.add(new Position(x+1,y));	        	
	       		 	maps[x+1][y] = 0;
	        	}
	        	//왼쪽										
	        	if(0 <= y-1 && maps[x][y-1]==1 ) {
	        		q.add(new Position(x,y-1));	        	
	        	 	maps[x][y-1] = 0;
	        	}
	        	
	        	//위										
	        	if(0 <= x-1 && maps[x-1][y]==1 ) {
	        		q.add(new Position(x-1,y));	        	
	        		 maps[x-1][y] = 0;
	        	}


	        }
	        	cnt++;  	
	        }
	        
	        return -1 ;
	    }
}
