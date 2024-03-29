package Programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/84021
//해결
public class Number_84021 {

	static class Puzzle{
		int[][] map;
		int count;
		
		Puzzle(int[][] map, int count){
			this.map = map;
			this.count = count;
		}
	}
	static class Pos{
		int x;
		int y;
		
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static List<Puzzle> mapList = new ArrayList<Puzzle>();
	static List<Puzzle> fragList = new ArrayList<Puzzle>();
	static int result = 0;
	
	public static void main(String[] args) {
		 int[][] game_board =	{{1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0},{0, 1, 1, 1, 0, 0}};
		 int[][] table = {{1, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 1, 0, 0, 0}, {1, 1, 0, 1, 1, 0}, {0, 1, 0, 0, 0, 0}};
		 System.out.println(solution(game_board,table));
	}
		
	  public static int solution(int[][] game_board, int[][] table) {
	        int answer = 0;
	        createFragment(game_board, 0);
	        createFragment(table, 1);
	        
	/*        fragList.sort(new Comparator<Puzzle>() {
	        	public int compare(Puzzle o1, Puzzle o2) {
	        		return o2.count-o1.count;
	        	};
			});
	        mapList.sort(new Comparator<Puzzle>() {
	        	public int compare(Puzzle o1, Puzzle o2) {
	        		return o2.count-o1.count;
	        	};
			});
			*/
	        
	        boolean filled[] = new boolean[mapList.size()];
	        
	        for(int i =0; i<fragList.size(); i++) {
	            for(int j =0; j<mapList.size(); j++) {
	            	Puzzle puzzle1 = fragList.get(i);
	            	Puzzle puzzle2 = mapList.get(j);
	            	if(puzzle1.count ==puzzle2.count && !filled[j] ) {
	            		if((puzzle1.map.length ==puzzle2.map.length &&puzzle1.map[0].length ==puzzle2.map[0].length )
	            				||(puzzle1.map[0].length ==puzzle2.map.length &&puzzle1.map.length ==puzzle2.map[0].length)) {
	            		int num =  rotateCheck(puzzle1, puzzle2);
	            		if(num != 0) {
	            			filled[j] = true;
	            			answer += num;
	            			break;
	            		}
	            		}
	            	}
		        }
	        }
	        return answer;
	    }
	  
	  
	 static void createFragment(int[][] map, int type) {
		  
		 
		  int n = map.length;
		  int m = map[0].length;
		  Queue<Pos> q = new LinkedList<>();
		  boolean visited[][] = new boolean[n][m];
		  
		  for(int i =0; i<n; i++) {
			  for(int j =0; j<n; j++) {
				  if(map[i][j] == type && !visited[i][j]) {
					  List<Integer> listx = new ArrayList<>();		
					  List<Integer> listy = new ArrayList<>();			  
					 q.add(new Pos(i,j));
					 int cnt = 0;
					 int minX = Integer.MAX_VALUE;
					 int minY = Integer.MAX_VALUE;
					 visited[i][j] = true;
					 while(!q.isEmpty()) {
						 Pos top = q.poll();
						 cnt++;
						
						 int x = top.x;
						 int y = top.y;
						 minX =Math.min(minX, x);
						 minY =Math.min(minY, y);
						 listx.add(x);
						 listy.add(y);
						 
						 //위
						 if(0<=x-1 && !visited[x-1][y]&& map[x-1][y] ==type) {
							 q.add(new Pos(x-1,y));
							 visited[x-1][y] = true;
						 }
						 //아래
						 if(x+1<n && !visited[x+1][y]&& map[x+1][y] ==type) {
							 q.add(new Pos(x+1,y));
							 visited[x+1][y] = true;
						 }
						 //왼쪽
						 if(0<=y-1 && !visited[x][y-1]&& map[x][y-1] ==type) {
							 q.add(new Pos(x,y-1));
							 visited[x][y-1] = true;
						 }
						 //오른쪽
						 if(y+1 <m && !visited[x][y+1]&& map[x][y+1] ==type) {
							 q.add(new Pos(x,y+1));
							 visited[x][y+1] = true;
						 }						 
					 }
					 
					 Set<Integer> set = new HashSet<Integer>(listx);
					 int length1 = set.size();
					 set = new HashSet<Integer>(listy);
					 int length2 = set.size();
					 
					 int length3 = Math.max(length1, length2);
					 int[][] frag = new int[length1][length2];
					 
					 for(int k =0; k<cnt; k++) {
						 frag[listx.get(k)-minX][listy.get(k)-minY] = 1;
					 }
					 
					 if(type ==0) {
						 mapList.add(new Puzzle(frag, cnt));
					 }
					 else if(type ==1) {
						 fragList.add(new Puzzle(frag, cnt));
					 }
				  }
			  }
		  }		 
	  }
	

	static int rotateCheck(Puzzle puzzle1, Puzzle puzzle2) {
		
		int map1[][] = puzzle1.map;
		int map2[][] = puzzle2.map;
		int n = map1.length;
		int m = map1[0].length;
		Loop1 :
		for(int k=0; k<4; k++) {
			if(map1.length != map2.length || map1[0].length != map2[0].length) {
				map2 = rotateMap(map2);
				continue;
			}
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(map1[i][j] != map2[i][j]) {
					if(k==3)
						continue Loop1;
					map2 = rotateMap(map2);
					continue Loop1;
				}
			}
		}
		return puzzle1.count;
			
		}
		
		return 0;
	}
	static int[][] rotateMap(int[][] map2) {
		int n = map2.length;
		int m =  map2[0].length;
		int [][] newMap = new int[m][n];
		
		for(int i =0; i<m; i++) {
			for(int j =0; j<n; j++) {
				newMap[i][j] = map2[n-1-j][i];
			}
		}
		return newMap;
	}
  
}
