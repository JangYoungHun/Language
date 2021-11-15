package Programmers;

import java.util.LinkedList;
import java.util.Queue;

//ÇØ°á
public class Number_12909 {

	public static void main(String[] args) {
		String str = 	")()(";
		solution(str);
	}
	
    static boolean solution(String s) {
        boolean answer = true;
        Queue<Character> q = new LinkedList<Character>();
        for(int i =s.length()-1; i>=0;i--) {
        	char ch = s.charAt(i);
        	if(q.isEmpty()) {
        		q.add(ch);
        	}
        	else {
        		char peek = q.peek();
        		if((ch == '(' && peek == ')')) {
        			q.poll();
        		}
        		else {
        			q.add(ch);
        		}
        	}
        }
        
        return q.isEmpty();
    }
}
