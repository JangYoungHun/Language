package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/77885
//�ذ�
public class Number_77885 {

	public static void main(String[] args) {
		long[] numbers = {2,7};
		solution(numbers) ;
	}
	
    public static  long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int index = 0;
        for(long i : numbers) {    	
    		String str = '0' + Long.toBinaryString(i);
        	if(i%2 ==0) {
        		answer[index++] = i+1;
        	}
        	else {
        		int num = str.lastIndexOf('0');
        		
        		StringBuilder sb = new StringBuilder(str);
        		sb.setCharAt(num, '1');
        		sb.setCharAt(num+1, '0');
        		answer[index++] = Long.parseLong(sb.toString(), 2); 
        	}
        	
        	
        }
        
        return answer;
    }
}
