package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Number_42884 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[][] {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}}));
	}
	
	static class Route {
		int in;
		int out;
		
		public Route(int in, int out) {
			this.in = in;
			this.out = out;
		}

	}
	
    public static int solution(int[][] routes) {
        int answer = 1;
        List<Route> list = new ArrayList<Route>();
        
        for (int i=0; i<routes.length; i++) {
        	list.add(new Route(routes[i][0], routes[i][1]));
        }
        
        list.sort((o1, o2) -> {return o1.out - o2.out;});
        
        int pos = list.get(0).out;
        
        for(int i =1; i<list.size(); i++) {
        	Route route = list.get(i);
        	if(route.in <= pos && pos <= route.out) {        		
        		continue;
        	} else {
        		answer ++;
        		pos = route.out;
        	}
        }
        
        return answer;
    }
}

















