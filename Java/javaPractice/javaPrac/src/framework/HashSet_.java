package framework;

import java.util.*;


public class HashSet_ {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<String>();	
	}

}

class Member
{
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;	
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Member) {
			
			Member member = (Member)obj;
		
			return member.name.equals(name);		
		}
		else
			return false;		
	}			
 

@Override
public int hashCode() {
	
	return name.hashCode() + age;
	
	
}

}


