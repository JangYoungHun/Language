package codingTest.sk.second;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Number2 {

	public static void main(String[] args) {
			String arr[] = {"1"};
			String processes[] = {"read 2 3 0 0"};
			solution(arr,processes);
	}
	
	public static class Param implements Comparable<Param>{
		String command;
		int startTime;
		int duration;
		int startIndex;
		int endIndex;
		String writeStr;
		int endTime;
		
		public Param(String str) {
			String params[] = str.split(" ");
			this.command = params[0];
			this.startTime = Integer.parseInt(params[1]);
			this.duration = Integer.parseInt(params[2]);
			this.startIndex = Integer.parseInt(params[3]);
			this.endIndex = Integer.parseInt(params[4]);
			
			if(command.equals("write")) {
				this.writeStr = params[5];
			}
		}
		@Override
		public int compareTo(Param o) {
			// TODO Auto-generated method stub
			
			if(this.command.equals("write")) {
				if(this.command.equals(o.command)) {
					return this.startTime - o.startTime;
				}
			}
			
			if(!this.command.equals(o.command))
				return this.command.compareTo(o.command) * -1;
			
			return this.startTime - o.startTime ;
		}		
		
	}
	
    public static String[] solution(String[] arr, String[] processes) {
        List<String> answer = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        PriorityQueue<Param> wait = new PriorityQueue<Param>();
        Queue<Param> q = new LinkedList<Param>();
        Queue<Param> work= new LinkedList<Param>();
        
        int time = 0;
        
    	String plag = "";
        for(int i =0; i<processes.length; i++) {
        	q.add(new Param(processes[i]));
        }
        
        for(int i =0; i<=1100; i++) {
        	        	
        	if(q.isEmpty() &&wait.isEmpty() &&work.isEmpty()) {
        		answer.add(String.valueOf(time));
        		break;
        	}
        	   	
        	while(true) {
        		if(!q.isEmpty() && q.peek().startTime <= i) {
        				Param top = q.poll();
            			wait.add(top);	
        		}else {
        			break;
        		}
        	}

        		while(!wait.isEmpty() && wait.peek().startTime <= i) {      	
        			if(work.isEmpty()) {
        				Param top =wait.poll();
        				top.endTime = i+top.duration-1;
        				work.add(top);
        				plag = top.command;
        			}else if(plag.equals("write")) {
        				break;
        			} 
        			else {
        				if(plag.equals("read")) {
        					if( wait.peek().command.equals("read")) {
        						Param top =wait.poll();
                				top.endTime =  i+top.duration-1;
        						work.add(top);
        					}else {
        						break;
        					}
        				} else {
        					break;
        				}
        			}			
        		}
        			
            	if(!work.isEmpty()) {
            		time++;
            	}
        	while(work.peek() != null &&  work.peek().endTime <= i) {
        		Param curWork = work.peek();
        		if(curWork.command.equals("read")) {
        			for(int j =curWork.startIndex; j <= curWork.endIndex; j++ ) {
        				sb.append(arr[j]);
        			}
        			answer.add(sb.toString());
        			sb.setLength(0);
        		} else {
        			for(int j =curWork.startIndex; j <= curWork.endIndex; j++ ) {
        				arr[j] = curWork.writeStr;
        			}
        		}
        		Param poll = work.poll();
        	}
        	
        }
        
        String result[] = new String[answer.size()];
        for(int i =0; i<result.length; i++) {
        	result[i] = answer.get(i);
        }
        return result;
    }
    
    
}
