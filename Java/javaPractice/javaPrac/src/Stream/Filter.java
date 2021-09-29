package Stream;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filter {
	
	static class Member{
		String name;
		String gender;
		int age;
		
		public Member(String name, String gender, int age)
		{
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(				
				new Member("가나다", "Male", 25),
				new Member("라마바", "Male", 33),
				new Member("사아자", "Female", 29),
				new Member("홍길동", "Female", 27),
				new Member("전우치", "Male", 25),
				new Member("김땡땡", "Female", 21)
				);
		
		
		//첫 번째 Menber  Stream
			Stream<Member> memberStream = list.stream();
			
		//두 번째 남성인 Member stream
			Stream<Member> maleStream = memberStream.filter(m -> m.gender.equals("Male") );
		//세 번째 남성인 Member의 나이 Stream
			IntStream ageStream = maleStream.mapToInt(Member::getAge);
			
			
			//스트림 하나당 한개 동작
			int sum = ageStream.sum();
			System.out.print("sum : "+sum );
		//	Double avg = ageStream.average().getAsDouble();
		//	System.out.print( "avg : " + avg);
	}

}
