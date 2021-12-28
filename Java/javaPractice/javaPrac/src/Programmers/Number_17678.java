package Programmers;

import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/17678
//해결
public class Number_17678 {

	public static void main(String[] args) {
		int n = 10;
		int t =60;
		int m = 45;
		String[] timetable = {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};
		solution(n, t, m, timetable);
	}
	

	public static String solution(int n, int t, int m, String[] timetable) {
	        String answer = "";
	        
	        int interval = t;
	        int initDepart = calcMinute("09:00");	    
	        int depart =  initDepart;
	        int cnt[] = new int[n];
	        
	        int[] table = Stream.of(timetable).mapToInt((it) -> calcMinute(it)).sorted().toArray();
	        
	        //현재 차량이 몇번째인지
	        int num = 0;
	        
	       for(int i =0; i<table.length; i++) {
	    	   if(num == n)
	    		   break;
	    	   
	    	   if(depart >= table[i]) {
 	    		   if(cnt[num] < m) {
	    			   cnt[num]++;
	    		   }
	    		   else {
	    			   depart = depart+t;
	    			   num++;
		    		   i--;
	    		   }
	    	   }
	    	   else {
	    		   depart = depart+t;
	    		   num++;
	    		   i--;
	    	   }
	       }
	       
	       int sum=0;
	       for(int i =0; i<cnt.length; i++) {
	    	   sum +=cnt[i];
	       }
	       
	       int time;
	       if(cnt[n-1] >= m)
	    	   time = table[sum-1]-1;
	       else
	    	   time =initDepart +t*(n-1);

	    	   
	       answer =  String.format("%02d", time/60) + ":" +String.format("%02d", time%60);
	        return answer;
	    }

	
	public static int calcMinute(String time) {
		String[] hm = time.split(":");
		return Integer.parseInt(hm[0])*60 + Integer.parseInt(hm[1]);
	}
	
}
