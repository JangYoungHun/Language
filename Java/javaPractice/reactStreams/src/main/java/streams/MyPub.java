package streams;

import java.util.Arrays;

import org.reactivestreams.Subscriber;

public class MyPub {
	
	Iterable<Integer> its = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	public void subscribe(Subscriber<? super Integer> s) {
		System.out.println("subscriber ���� ���� !");
		System.out.println("���� ���� ���� �� ....");
		MySubScription subScription = new MySubScription(s, its);		
		s.onSubscribe(subScription);
	}
}
