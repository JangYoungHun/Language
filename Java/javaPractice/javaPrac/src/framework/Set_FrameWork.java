package framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_FrameWork {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<String>();
		set.add("name");
		set.add("age");
		set.add("gender");
		set.add("age");
		set.add("gender");
		
		System.out.println(set.size());  // 중복저장 X
		
/*		Iterator<String> iterator = set.iterator();
		for(int i =0 ; i < set.size(); i++) {
		if(iterator.hasNext()) {
		
		String str = iterator.next();	
		System.out.println(str);
		}
	}
	*/
		
		
	}
}
