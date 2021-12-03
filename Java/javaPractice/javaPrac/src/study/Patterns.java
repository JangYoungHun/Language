package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

	public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^*(@naver.com)$"); //영문자만
        String val = "abcdef@naver.com"; //대상문자열
        
        // 날짜 패턴 공통분모 ex) (Mon,Thus,Fri)day   
        // 공통분모 ex)   ..(id,esd)day   
        Matcher matcher = pattern.matcher(val);
        
        String pattern1 = "-@+-"; //영문자만
        String str1 = "-@@@-"; //대상문자열
        // false : -@@-@-

        String pattern2 = "-X?XX?-"; //영문자만
        String str2 = "-XXX-"; //대상문자열
        // false : - (X 1~ 3개까지만 true) -
        
/*        String pattern3 = "(.*)://([a-z0-9.]*)(/(.*))?"; //영문자만
        String str3 = "https://toss.im/path/data"; //대상문자열
        Pattern patternObg1 = Pattern.compile(pattern3);
        Matcher matcher1 =  patternObg1.matcher(str3);
         
        while(matcher1.find()) {
            System.out.println(matcher1.group(0));
            System.out.println(matcher1.group(1));
            System.out.println(matcher1.group(2));
            System.out.println(matcher1.group(3));
        }

        System.out.println(Pattern.matches(pattern3, str3));
        */
    	String  pattern4 = "([a-z]+)";
    	String str4 =  "aa1+aa2";
    	Pattern p = Pattern.compile(pattern4);
    	Matcher m = p.matcher(str4);
    	
    	while(m.find()) {
    		System.out.println(m.group(0));
    	}
	}
		
	

}
