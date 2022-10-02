package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Number_42898 {

	public static void main(String[] args) {
		
		System.out.println(solution(4, 3, new int[][] {{2,2}}));
	}
	
	static int arr[][];
	static HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        for(int[] arr : puddles) {
        	int x = arr[1];
        	int y = arr[0];
        	map.putIfAbsent(x, new ArrayList<>());
        	map.get(x).add(y);
        }
        
       arr = new int[n+1][m+1];
       arr[1][1] = 1;
       for(int i =1; i<n+1; i++) {
           for(int j =1; j<m+1; j++) {
        	   if(puddle(i,j) || (i==1 && j==1))
        		   continue;
        	   arr[i][j] = (arr[i-1][j] + arr[i][j-1])%1000000007;
           }
       }
       
       return arr[n][m];
    }

    public static boolean puddle(int x, int y) {
    	if (map.get(x) == null) {
			return false;
		}
    	return map.get(x).contains(y);
    }
}
