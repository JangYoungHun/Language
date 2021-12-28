package streams;

import java.util.Arrays;

import org.reactivestreams.Subscriber;

public class MyPub {
	
	Iterable<Integer> its = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	public void subscribe(Subscriber<? super Integer> s) {
		System.out.println("subscriber 구독 시작 !");
		System.out.println("구독 정보 생성 중 ....");
		MySubScription subScription = new MySubScription(s, its);		
		s.onSubscribe(subScription);
	}
}
