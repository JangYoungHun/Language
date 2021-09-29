package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
	
	static int sum =0;
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("가나다","라마바","아자차","카타파");
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		String arr[] = {"가나다","라마바","아자차","카타파"}; 
//		//기존방식 
//		Iterator<String> iterator = list1.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		//Stream 방식
		
	//List로 부터 받기
//		Stream<String> stream1 = list1.stream();
//		stream1.forEach( name->System.out.println(name) );
//		
//		Stream<Integer> stream2 = list2.stream();
//	    stream2.forEach(num -> System.out.println(num));
		
		//배열로 부터 받기
//		Stream<String> stream = Arrays.stream(arr);
//		stream.forEach(name -> System.out.println(name));
		
		
		// 숫자 범위 Stream생성
		IntStream stream = IntStream.range(0, 101);
		
		//sum은 전역변수거나
		// 지역변수시 final
		stream.forEach(num -> sum+=num);
		System.out.println(sum);
	}

}
