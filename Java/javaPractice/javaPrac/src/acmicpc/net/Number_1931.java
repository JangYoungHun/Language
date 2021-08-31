package acmicpc.net;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1931
//ÇØ°á
public class Number_1931 {

	public static void main(String[] args) {
		
		class Time{
			int start;
			int end;
			Time(int start, int end){
				this.start = start;
				this.end = end;
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
    	Time[] times = new Time[n];
		for(int i =0; i < n; i++) {
			times[i] = new Time(scanner.nextInt(), scanner.nextInt());
		}

		Arrays.sort(times, new Comparator<Time>() {
			public int compare(Time o1, Time o2) {
				if(o1.end==o2.end)
					return o1.start-o2.start;
				
				return o1.end-o2.end;
			};
		});
		
		int cur = times[0].end;
		int cnt =1;
		
		for(int i =1; i<n; i++) {
			if(cur <= times[i].start) {
				cnt++;
				cur = times[i].end;
			}
		}
		
		System.out.println(cnt);	
	}

}
