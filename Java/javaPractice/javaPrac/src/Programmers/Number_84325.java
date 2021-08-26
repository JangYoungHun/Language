package Programmers;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/84325
//ÇØ°á
public class Number_84325 {

	public static void main(String[] args) {
		String table[] ={"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String languages[] = {"JAVA", "JAVASCRIPT"};
		int[] preference = {7, 5};
		solution(table, languages, preference);
	}
	
    public static String solution(String[] table, String[] languages, int[] preference) {

    	
    	List<HashMap<String, Integer>> list = Arrays.asList(
    	new HashMap<String, Integer>(),
    	new HashMap<String, Integer>(),
    	new HashMap<String, Integer>(),
    	new HashMap<String, Integer>(),
    	new HashMap<String, Integer>()
    	);
    			
    	for(int i =0; i<5; i++) {
    		String[] strs = table[i].split(" ");
        	int score =5;
    		for(int j =1; j<6; j++) {
    			list.get(i).put(strs[j], score--);
    		}
    	}
    	
    	int max = Integer.MIN_VALUE;
    	int maxIndex =-1;
    	for(int i = 0; i<5; i++) {
    		int value =0;
    		for(int j=0; j<languages.length; j++) {
    			if(list.get(i).get(languages[j]) != null) {
    				value+=list.get(i).get(languages[j])*preference[j];
    			}
    		}
    		if(max < value) {
    			max = value;
    			maxIndex = i;
    		}
    		else if(max == value) {
    			if(getJob(i).compareTo(getJob(maxIndex)) < 0){
    				maxIndex = i;
    			}
    		}
    	}
    	//SI	CONTENTS	HARDWARE	PORTAL	GAME

        String answer = getJob(maxIndex);
        return answer;
    }
    
    
   static String getJob(int index) {    	
   	switch(index) {
   	case 0: return "SI"; 
   	case 1: return "CONTENTS"; 
   	case 2: return "HARDWARE"; 
   	case 3: return "PORTAL"; 
   	case 4: return "GAME"; 
   	}
   	return "";
    }
    
}
