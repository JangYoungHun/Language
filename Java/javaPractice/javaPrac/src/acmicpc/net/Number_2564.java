package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//해결
public class Number_2564 {
	
	static class Pos{
		int dir;
		int x;
		int y;
		public Pos(int dir, int x, int y) {
			this.dir = dir;
			this.x = x;
			this.y = y;
		}
	} 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		int c = Integer.parseInt(br.readLine());
		
		List<Pos> list = new ArrayList<>();
		
		for(int i =0; i<c; i++) {
			int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int dir = arr[0];
			int pos = arr[1];
			list.add(calcPos(dir, pos, n, m));
		}
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Pos cur = calcPos(arr[0], arr[1], n, m);
		
		int result = 0;
		for(Pos p : list) {
			int num = solution(cur, p);
			result += Math.min(num, 2*(m+n) - num );
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}
	
	static int solution(Pos cur, Pos store) {
		
		int diff = Math.abs(cur.dir - store.dir);
		
		int posDiff = Math.abs(cur.x-store.x) + Math.abs(cur.y-store.y);;
		
		if(diff == 2 ) {	
			int width = Math.max(cur.x, store.x);
			int height = Math.max(cur.y, store.y);
			return (width+height)*2 - posDiff;
		} else if (diff == 1 || diff == 3) {
			return  Math.abs(cur.x-store.x) + Math.abs(cur.y-store.y);
		} else {
		    if(cur.dir % 2 == 0 ) {
		    	return Math.abs(cur.x - store.x);
		    } else {
		    	return Math.abs(cur.y - store.y);
		    }
		    
		}


	}
	
	static Pos calcPos(int dir, int pos, int n, int m) {
		switch(dir) {
		// 북
		case 1:  return new Pos(1, 0, pos);
		//동
		case 4: return new Pos(2,pos, n);
		//남
		case 2: return new Pos(3,m, pos);
		//서
		case 3: return new Pos(4,pos, 0);

		}		
		return null;
	}
}
