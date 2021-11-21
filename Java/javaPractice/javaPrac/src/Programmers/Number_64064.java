package Programmers;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number_64064 {
	
	static ArrayList<String> resultList = new ArrayList<String>();
	public static int answer = 0;
	public static void main(String[] args) {
		String[] user_id = { "frodo", "fradi", "crodo", "abc123", "frodoc" };
		String[] banned_id = { "fr*d*", "*rodo", "******", "******" };
		solution(user_id, banned_id);

	}

	public static int solution(String[] user_id, String[] banned_id) {
		pick(new ArrayList<Integer>(), user_id, banned_id, banned_id.length);
		return answer;
	}
	
	
	public  static void pick(ArrayList<Integer> list, String[] user_id, String[] banned_id, int n) {
		if(list.size() == n){
			int cnt = 0;
			for(int i =0; i<n; i++) {
				Pattern p =Pattern.compile("^"+ banned_id[i].replace("*", ".") + "$");
				Matcher m = p.matcher(user_id[list.get(i)]);
				if(m.find())
					cnt++;
			}
			if(cnt == n) {
				ArrayList<Integer> copy = new ArrayList<Integer>(list);
				copy.sort(null);
				if(!resultList.contains(copy.toString())) {
					answer++;
					resultList.add(copy.toString());
				}
				  
				}
			
			return;
			
		}
		
		for(int i =0; i<user_id.length; i++) {
			if(!list.contains(i)) {
				list.add(i);
				pick(list, user_id, banned_id, n);
				list.remove(list.size()-1);
			}
				
		}
	}

	
	
//	public static int solution(String[] user_id, String[] banned_id) {
//		int answer = 1;
//		
//		HashMap<String, ArrayList<String>> h = new HashMap<String, ArrayList<String>>();
//		HashMap<String, Integer> hCnt = new HashMap<String, Integer>();
//		
//
//		for (String pattern : banned_id) {
//			
//			h.put(pattern, new ArrayList<String>());
//
//			for (String str : user_id) {
//				Pattern p = Pattern.compile("^" + pattern.replace("*", ".") + "$");
//				Matcher m = p.matcher(str);
//				if (m.find()) {
//					h.get(pattern).add(str);
//				}								
//			}
//		}
//		
//		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
//		for(ArrayList<String> item : h.values())
//			list.add(item);
//			
//		return answer;
//	}



	
}
