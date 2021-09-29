package Programmers;


import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/1829
public class Number_1829 {
	
	public static void main(String args[]) {
		int nums[][] =  {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		solution(6,4,nums);
	}
	
	static class Position{
		int x;
		int y;
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        boolean visited[][] = new boolean[m][n];
        
        for(int i =0; i<m; i++) {
        	   for(int j =0; j<n; j++) {
               		if(picture[i][j] != 0 && !visited[i][j] ) {
               			numberOfArea++;
               			visited[i][j] = true;
               			maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs(i, j,n,m, picture, visited));
               		}
               }
        }
        
        
        
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    
    static int bfs(int posX, int posY, int n, int m, int[][] picture, boolean visited[][]) {
    	Queue<Position> q = new LinkedList<Position>();
    		q.add(new Position(posX, posY));	
    	
    		int color = picture[posX][posY];
    		int cnt =0;
    		
    	while(!q.isEmpty()) {
    		cnt++;
    		Position top = q.poll();
    		int x = top.x;
    		int y = top.y;
    		
    		//위
    		if(0<=x-1 && !visited[x-1][y] && picture[x-1][y] == color) {
    			visited[x-1][y] = true;
    			q.add(new Position(x-1,y));
    		}
    		//아래
    		if(x+1 <m && !visited[x+1][y] && picture[x+1][y] == color) {
    			visited[x+1][y] = true;
    			q.add(new Position(x+1,y));
    		}
    		//왼쪽
    		if(0<=y-1 && !visited[x][y-1] && picture[x][y-1] == color) {
    			visited[x][y-1] = true;
    			q.add(new Position(x,y-1));
    		}
    		//오른쪽
    		if(y+1<n && !visited[x][y+1] && picture[x][y+1] == color) {
    			visited[x][y+1] = true;
    			q.add(new Position(x,y+1));
    		}
    	}	
    		
    		return cnt;
    }
    

}
