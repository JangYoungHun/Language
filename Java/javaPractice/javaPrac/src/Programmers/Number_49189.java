package Programmers;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/49189 
//ÇØ°á
public class Number_49189 {

	public static void main(String[] args) {
		int bridge[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		System.out.println(solution(6, bridge));
	}

    public static int solution(int n, int[][] edge) {
        int dis[] = new int[n];
        
        
        boolean visited[] = new boolean[n+1];
        boolean[][] bridge = new boolean[n+1][n+1];
        
        for(int i[]  : edge) {
        	bridge[i[0]][i[1]] = true;
        	bridge[i[1]][i[0]] = true;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        visited[1] = true;
        
        int cnt =1;
        while(!q.isEmpty()) {
        	int qsize = q.size();
        for(int i =0; i<qsize; i++) {
        	int top = q.poll();
        	for(int j =1; j<n+1; j++) {
        		if(bridge[top][j] && !visited[j] ) {
        			q.add(j);
        			visited[j] = true;
        			dis[j-1] = cnt;
        		}
        	}  	
        }
        cnt++;
        }
        
        int answer = 0;
        int max = cnt-2;
        for(int i =0; i<n; i++) {
        	if(dis[i] == max )
        		answer++;
        }
        
        return answer;
        
        
        

    }
    
    
    
	
}
