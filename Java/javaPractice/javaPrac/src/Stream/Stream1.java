package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
	
	static int sum =0;
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("������","�󸶹�","������","īŸ��");
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		String arr[] = {"������","�󸶹�","������","īŸ��"}; 
//		//������� 
//		Iterator<String> iterator = list1.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		//Stream ���
		
	//List�� ���� �ޱ�
//		Stream<String> stream1 = list1.stream();
//		stream1.forEach( name->System.out.println(name) );
//		
//		Stream<Integer> stream2 = list2.stream();
//	    stream2.forEach(num -> System.out.println(num));
		
		//�迭�� ���� �ޱ�
//		Stream<String> stream = Arrays.stream(arr);
//		stream.forEach(name -> System.out.println(name));
		
		
		// ���� ���� Stream����
		IntStream stream = IntStream.range(0, 101);
		
		//sum�� ���������ų�
		// ���������� final
		stream.forEach(num -> sum+=num);
		System.out.println(sum);
	}

}
