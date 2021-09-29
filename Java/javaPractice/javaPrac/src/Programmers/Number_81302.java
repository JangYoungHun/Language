package Programmers;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/81302
//ÇØ°á
public class Number_81302 {

	public static void main(String[] args) {
		String strs[][] = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
		                 {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
		                 {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
		                 {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
		                 {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		solution(strs);
	}
	
    public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);
        int moveX[] = {-2,-1,0,1,2};
        int moveY[] = {-2,-1,0,1,2};
        
        int index =0;
        for(String strs[] : places) {
        	
        	char map[][] = new char[5][5];
        	for(int i =0; i<5; i++) {
        		map[i] =strs[i].toCharArray();
        	}
      
        	
        	Loop1 :
        	for(int i =0; i<5; i++) {
        		for(int j =0; j<5; j++) {
        			if(map[i][j] == 'P') {       		
        				
        				for(int k =0; k<5; k++) {
        					for(int p=0; p<5; p++) {
        						
        						int x = i+moveX[k];
        						int y = j+moveY[p];
        						if(x<0 || 4<x || y<0 || 4<y || x==i ||y==j)
        							continue;
        						
        						if(map[x][y] == 'P') {
        							int dis = Math.abs(i-x)+ Math.abs(j-y);
        							if(dis ==1) {
        								answer[index] = 0;
        								break Loop1;
        							}
        							else if(dis==2) {
        								if(i == x) {
        									if(!(map[x][((j+y)/2)] =='X')) {
        										answer[index] = 0;
            									break Loop1;
        									}
        								}
        								else if(j == y) {
        									if(!(map[(x+i)/2][y] =='X')) {
        										answer[index] = 0;
            									break Loop1;
        									}
        								}
        									
        								else {	
        								if(map[x][j]=='X' && map[i][y]=='X')
        									continue;
        								else {
        									answer[index] = 0;
        									break Loop1;
        								}	
        								}
        							}
        						}
        					}
        				}	
        				
        			}
        		}
        	}
        	
        	index++;
        }
        
        
        return answer;
    }
    
}
