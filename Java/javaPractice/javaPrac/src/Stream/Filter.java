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
				new Member("������", "Male", 25),
				new Member("�󸶹�", "Male", 33),
				new Member("�����", "Female", 29),
				new Member("ȫ�浿", "Female", 27),
				new Member("����ġ", "Male", 25),
				new Member("�趯��", "Female", 21)
				);
		
		
		//ù ��° Menber  Stream
			Stream<Member> memberStream = list.stream();
			
		//�� ��° ������ Member stream
			Stream<Member> maleStream = memberStream.filter(m -> m.gender.equals("Male") );
		//�� ��° ������ Member�� ���� Stream
			IntStream ageStream = maleStream.mapToInt(Member::getAge);
			
			
			//��Ʈ�� �ϳ��� �Ѱ� ����
			int sum = ageStream.sum();
			System.out.print("sum : "+sum );
		//	Double avg = ageStream.average().getAsDouble();
		//	System.out.print( "avg : " + avg);
	}

}
