 package Programmers;

 
import java.util.Arrays;
import java.util.Comparator;

//https://programmers.co.kr/learn/courses/30/lessons/42746
//ÇØ°á
class Number_42746 {

	    public static void main(String args[]) {
	    	Integer[] numbers = {90,908,89,898,10,101,1,8,9};
	    	 StringBuilder answer = new StringBuilder();
	    	Comparator<Integer> comparator = new Comparator<Integer>() {

	    	
			public int compare(Integer o1, Integer o2) {
					String str1 = o1.toString();
					String str2 = o2.toString();
					
					int  num1 = o1+ o2*(int)Math.pow(10, str1.length());
					int  num2 = o2+ o1*(int)Math.pow(10, str2.length());
					
					
					if(num1 > num2)
						return 1;
					else if(num1 < num2)
						return -1;
					else
						return 0;
				}
	    	};
		
	    	Arrays.sort(numbers, comparator);
	        for(int i=0; i<numbers.length; i++){
                if(answer.length() ==0 && numbers[i] == 0) continue;         
               answer.append(numbers[i]) ;
           }
	    	System.out.println(answer.toString());
	    }
	   

	    
	}