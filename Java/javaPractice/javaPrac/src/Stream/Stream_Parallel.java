package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Parallel {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("������","�󸶹�","������","īŸ��");
		
		System.out.println("����ó��");
		Stream<String> stream = list1.stream();
		stream.forEach(name ->println(name));
		
		
		System.out.println("����ó��");
		Stream<String> paralleStream = list1.parallelStream();
		 paralleStream.forEach(Stream_Parallel::println);
	}
	
	
	public static void println(String data) {
		System.out.println(data + " : " + Thread.currentThread().getName());
	}
	

}
