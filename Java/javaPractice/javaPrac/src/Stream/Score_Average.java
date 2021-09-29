package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Score_Average {
	
	static class Student{
		String name;
		int score;
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		public String getName()
		{
			return name;
		}		
		public int getScore()
		{
			return score;
		}		
	}
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("������", 80),
				new Student("�󸶹�", 65),
				new Student("�����", 91),
				new Student("��īŸ", 71)
				);
		
		Stream<Student> stream1 = list.stream();
		int sum = stream1.mapToInt(Student::getScore).sum();
		Stream<Student> stream2 = list.stream();
		Double avg =stream1.mapToInt(Student::getScore).average().getAsDouble();
		System.out.print("sum : "+sum + "   avg : " + avg);
		
		}

	

}
