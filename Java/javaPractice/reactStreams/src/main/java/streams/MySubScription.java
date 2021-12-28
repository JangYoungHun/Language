package streams;

import java.util.Iterator;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

//구독정보(구독자, 구독 테이터 종류)
public class MySubScription implements Subscription {
	
	private Subscriber s;
	private Iterator<Integer> it;

	public MySubScription(Subscriber s, Iterable<Integer> its) {
		super();
		this.s = s;
		this.it = its.iterator();
		System.out.println("SubScription 구독 정보 생성 완료");
	}

	public void request(long n) {
		while(n>0) {
			if(it.hasNext()) {
				s.onNext(it.next());
			}else {
				s.onComplete();
				break;
			}
			n--;
		}
		
		
	}

	public void cancel() {

	}

}
