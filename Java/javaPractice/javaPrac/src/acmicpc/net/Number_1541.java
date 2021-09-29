package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1541
//ÇØ°á
public class Number_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    char str[] = br.readLine().toCharArray();
	    
	    boolean minus = false;
	    int index =0;
	    int result =0;
	    int num =0;
	    while(index <= str.length) {
	    	
	    	if(index == str.length ) {
	    		if(minus)
	    			result -= num;
	    		else
	    			result += num;
	    		
	    		break;
	    	}
	    	
	    	if(index <= str.length)
	    	
	    	if(str[index] !='+' && str[index] != '-') {
	    		num = num*10 + (str[index] - '0');	    		
	    	}
	    	
	    	else {    		
	    		if(!minus) {	    			
	    			if(str[index] == '-') {
	    				minus = true;
	    		}
	    		result += num;	   	
	         	}
	    		else {
	    			result -= num;	 
	    		}
	    		
	    		num =0;		
	    	}
	    	index++;
	    }
	    
	    System.out.println(result);
	}

}
