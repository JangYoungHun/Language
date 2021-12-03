package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/43105
//ÇØ°á
public class Number_43105 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution(triangle));
	}
	
    public static int solution(int[][] triangle) {

        int n = triangle.length;
        int d[][] = new int[n][n];
       d[0][0] = triangle[0][0];
       
       for(int i =1; i<n; i++) {
    	   for(int j =0; j<=i; j++) {
        	   int num1 = 0;
        	   int num2 = 0;
        	   
        	   if(0<= i-1 && 0<=j-1) {
        		   num1 = d[i-1][j-1];
        	   }
        	   if(0<= i-1 && j<i) {
        		   num2 = d[i-1][j];
        	   }
        	   d[i][j] = Math.max(num1, num2) + triangle[i][j];
           }
       }
       

       int max = Integer.MIN_VALUE;
       for(int i =0; i<n; i++) {
    	   max = Math.max(max, d[n-1][i]);
       }
       
       return max;
    }
    
   
}
