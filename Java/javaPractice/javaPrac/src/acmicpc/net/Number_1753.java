package acmicpc.net;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1753
// 미해결 실패 시간초과
public class Number_1753{
	static int V ;
	static int E;
	static int startNum ;
	static  ArrayList<List<Bridge>> list;
	static int d[];
	static class Bridge implements Comparable<Bridge>{
		int destination;
		int distance;
		public Bridge(int destination, int distance) {
			this.destination = destination;
			this.distance = distance;
		}
		public Bridge(int i, int j, int distance2) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public int compareTo(Bridge o) {
			
				return (this.distance < o.distance ) ? -1:1;

		}
		
	}

	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		StringTokenizer st = new StringTokenizer(br.readLine());
		V  = Integer.parseInt(st.nextToken());
		 E = Integer.parseInt(st.nextToken());
		startNum = Integer.parseInt(br.readLine());

		d = new int[V+1];

		Arrays.fill(d, Integer.MAX_VALUE);
		
	   list = new ArrayList<List<Bridge>>(E+1);
	    
	    for(int i =0; i< E+1; i++) {
	    	list.add(new ArrayList<Bridge>());
	    	}
	    
	    for(int i =0; i< E; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	list.get(  Integer.parseInt(st.nextToken())).add(new Bridge( Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken())));
	    	}
	    
	    PriorityQueue<Bridge> q = new PriorityQueue<Bridge>();
	    q.add(new Bridge(startNum,0));
		d[startNum] = 0;
	
	    while(!q.isEmpty()) {
	    	
	    	Bridge top = q.poll();
	    	

	    	int curIndex = top.destination;
	    	int curDis = (int)d[curIndex];

	    	
	    	if(d[curIndex] < curDis ) continue;
	    	
	    	for(int i =0; i< list.get(curIndex).size(); i++) {
	    		Bridge bridge = list.get(curIndex).get(i);
	    		int next =  bridge.destination;

	    		int nextDis = curDis + bridge.distance;
	    	
	    		if(d[next] > nextDis ) {
	    			d[next] = nextDis;
	    			q.add( bridge);		
	    	}
	    	}
	    }
	    
	    for(int i =1; i<d.length; i++) {
	    	if(d[i] == Integer.MAX_VALUE)
	    		bw.write("INF\n");
	    	else
	    		bw.write( String.valueOf(d[i]) + "\n" );

	    }
	    
	    
		bw.flush();
	 	br.close();
		bw.close();

	}

}


