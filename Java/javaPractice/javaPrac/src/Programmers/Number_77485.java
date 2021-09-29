package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/77485
//ÇØ°á
public class Number_77485 {

	public static void main(String[] args) {
		int nums[][] = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		solution(6, 6, nums ) ;

	}
	
    public static  int[] solution(int rows, int columns, int[][] queries) {
    	int qIndex = 0;
        int[] answer = new int[queries.length];
        int[][] map = new int [rows][columns];
        int num =1;
        for(int i =0; i<rows; i++) {
        	for(int j=0; j<columns; j++) {
        		map[i][j] = num++;
        	}
        }
        
        for(int[] q : queries) {
        	
        	int x1 = q[0]-1;
        	int y1 = q[1]-1;
        	int x2 = q[2]-1;
        	int y2 = q[3]-1;
        	int[] newNum = new int[ (x2-x1+1)*(y2-y1+1)- (x2-x1-1)*(y2-y1-1)];
        	int min = Integer.MAX_VALUE;
        	int index =0;
        	
        	for(int i =y1; i<=y2;i++) {
        		newNum[index++] = map[x1][i];
        		min = Math.min(min, map[x1][i]);
        	}
        	for(int i =x1+1; i<=x2;i++) {
        		newNum[index++] = map[i][y2];
        		min = Math.min(min, map[i][y2]);
        	}
        	for(int i =y2-1; i>=y1;i--) {
        		newNum[index++] = map[x2][i];
        		min = Math.min(min, map[x2][i]);
        	}
        	for(int i =x2-1; i>x1;i--) {
        		newNum[index++] = map[i][y1];
        		min = Math.min(min, map[i][y1]);
        	}
        	
            answer[qIndex++] = min;
            
            int p = 0;
        	for(int i =y1+1; i<=y2;i++) {
        		map[x1][i] = newNum[p++];     	
        	}
        	for(int i =x1+1; i<=x2;i++) {
        		map[i][y2] = newNum[p++];     	
        	}
        	for(int i =y2-1; i>=y1;i--) {
        		map[x2][i] = newNum[p++];     	
        	}
        	for(int i =x2-1; i>=x1;i--) {
        		map[i][y1] = newNum[p++];     	
        	}
            
            
            
        }
        

        
        
        
        
        return answer;
    }
    
    
    void swap(int[][] map, int x1,int x2, int y1, int y2){  	
    	int temp = map[x1][y1];
    	map[x1][y1] = map[x2][y2];
    	map[x2][y2] = temp;   	
    }
    
}
