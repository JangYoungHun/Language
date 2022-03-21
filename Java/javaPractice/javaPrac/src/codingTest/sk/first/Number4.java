package codingTest.sk.first;

import java.util.LinkedList;
import java.util.Queue;

public class Number4 {
	
	public static void main(String[] args) {
		int [][] arr = {{2,3},{0,1},{1,2}};
		solution(4, arr);
	}
	
	static  boolean bridge[][];
	static int dp[][];
	static int m;
	static boolean visited[];
    public static long solution(int n, int[][] edges) {
        long answer = 0;
        m = n;
        dp = new int[n][n];
       bridge= new boolean[n][n];
       visited = new boolean[n];
       
        for(int i=0; i<edges.length; i++) {
        	bridge[edges[i][0]][edges[i][1]] = true;
        	bridge[edges[i][1]][edges[i][0]] = true;
        	dp[edges[i][0]][edges[i][1]] = 1;
        	dp[edges[i][1]][edges[i][0]] = 1;
        }
        for(int i =0; i<n; i++) {
        	  for(int j =0; j<n; j++) {
              	dfs(i,j);
              }
        }      
        
        for(int i =0; i<n; i++) {
            for(int j =0; j<n; j++) {
                for(int k =0; k<n; k++) {
                	if(i==j || j==k || i==k) continue;
                	if(dp[i][j] +dp[j][k] == dp[i][k]) {
                		answer ++;
                	}
                }
            }
        }
         
        return answer;
    }
    
    
    static int dfs(int start, int dest) {
    	if(dp[start][dest] != 0)
    		return dp[start][dest];
    	
    	if(start == dest)
    		return 1;
    	
    	for(int i =0; i<m; i++) {
    		if(bridge[start][i] && !visited[i]) {
    			visited[i] = true;
    			int result = dfs(i, dest);
    			visited[i] = false;
    			if(result == -1) continue;    			
    			return dp[start][dest] = dp[start][i] +result;   			
    		}
    	} 	
    	return -1;   	
    }

    
}
