package acmicpc.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=19538&from_mine=1
//틀림 반례 못찾음
public class Number_19539_2 {
	
	public static void main(String[] args)  throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int minute =1;
        int N = Integer.parseInt(st.nextToken());
        int rumored[] = new int[N+1]; 
        Node nodes[] = new Node[N+1];
    	List<Integer> list1 = new ArrayList<>();
        int time[] = new int[N];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<N+1; i++ ) { 
            nodes[i] = new Node(i);
        }
      
        for(int i=1; i<N+1; i++ ) {
        	st = new StringTokenizer(br.readLine());
        	
        	while(true) {
	        	int num = Integer.parseInt(st.nextToken());
	        	if(num == 0 ) break;   	
	        	nodes[i].list.add(num); 
        	}
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++ ) {       	  
        	int num =Integer.parseInt(st.nextToken());
            rumored[num] = 1;
            time[num-1] = minute;
        }
        
        for(int k=0; k<N+1; k++) { 
        	
    	minute++;
    	
        for(int i=1; i<N+1; i++) {    
    		int rumorO = 0;
          		if(rumored[i] == 1) continue;
          		else if(nodes[i].list.size() ==0) continue;
        		for(int j=0; j< nodes[i].list.size(); j++) {
        			q.add(nodes[i].list.get(j));
        		}
        		
        		while(!q.isEmpty()) {
        			int num = q.poll();
        			if(rumored[num] == 1)
        				rumorO++;
        		}
        		if(nodes[i].list.size() <= rumorO*2 && nodes[i].list.size() !=0) {   			
        			list1.add(i);
        		}		
        	}   

        while(!list1.isEmpty()) {
        	int num = list1.remove(list1.size()-1);
        	time[num-1] = minute;   
        	rumored[num] = 1;
        }   
  
        }
        for(int k=0; k<N; k++) { 
        	time[k]--;
        	
        }
        
        System.out.println(Arrays.toString(time));
        }

	
	static class Node{
		int data;
		LinkedList<Integer> list;
		Node(int data){
			this.data = data; 
			list = new LinkedList<Integer>();
		}
	}
}
