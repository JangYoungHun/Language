package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://programmers.co.kr/learn/courses/30/lessons/17686
//ÇØ°á
public class Number_17686 {

	public static void main(String[] args) {
		String files[] = {"img000012345", "img1.png","img2","IMG02"};
	
		System.out.print(Arrays.toString(solution(files)));
	}
	
    public static String[] solution(String[] files) {
        
        Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				 o1=o1.replace(" ","");
				 o2=o2.replace(" ","");
				String pattern = "^([a-zA-Z .-]+) *([0-9]{1,5}) *(.*)$";
				
				Pattern p = Pattern.compile(pattern);
				Matcher m1 = p.matcher(o1);
				String strs1[] = new String[3];		
				if(m1.find()) {
				for(int i =0; i<2;i++) {
					strs1[i] = m1.group(i+1).toLowerCase();
				}			
				}
				Matcher m2 = p.matcher(o2);
				String strs2[] = new String[3];
				if(m2.find()) {
				for(int i =0; i<2;i++) {
					strs2[i] = m2.group(i+1).toLowerCase();
				}
				}
				
				if(!strs1[0].equals(strs2[0]))
					return strs1[0].compareTo(strs2[0]);
				else {
					int num1 = Integer.parseInt(strs1[1]);
					int num2 = Integer.parseInt(strs2[1]);
					
					if(num1 != num2) 
						return num1 -num2;
							
				}
				
				return 0;
			}
		};
    	
		Arrays.sort(files,comparator);
		
		
		
        return files;    
    }
	
}
