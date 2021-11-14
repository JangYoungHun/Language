package Programmers;

//ÇØ°á
public class Number_86971 {

	public static void main(String[] args) {
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		solution(9, wires) ;
	}
	
    public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        boolean bridge[][] = new boolean[n+1][n+1];
       
        
        for(int i[] : wires) {
        	bridge[i[0]][i[1]] = true;
        	bridge[i[1]][i[0]] = true;
        }
        
        for(int i = 0; i<wires.length; i++) {
        	boolean visited[] = new boolean[n+1];
        	int arr[] = wires[i];
        	bridge[arr[0]][arr[1]] = false;
        	bridge[arr[1]][arr[0]] = false;
        	visited[arr[0]] = true;
        	int cnt1 = count(bridge ,visited, arr[0], n);
        	visited[arr[1]] = true;
        	int cnt2 = count(bridge ,visited, arr[1], n);
        	
        	answer = Math.min(answer,Math.abs(cnt1-cnt2));
                   	
        	bridge[arr[0]][arr[1]] = true;
        	bridge[arr[1]][arr[0]] = true;
        }        
        return answer;
    }
    
    
    
    public static int count(boolean bridge[][], boolean visited[] ,int start, int n) { 	
    	int cnt = 1;
    	
    	for(int i =1; i<n+1; i++) {
    		if(bridge[start][i] && !visited[i]) {
    			visited[i] = true;
    			cnt += count(bridge,visited,i, n); 
    		}
    	}  	
    	return cnt;
    	
    }
    
}
