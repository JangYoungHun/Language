package streams;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer>{
	
	
	private Subscription subScription;
	private int bufferSize = 4;
	private int requestSize = bufferSize;
	public void onSubscribe(Subscription s) {
		System.out.println("구독 시작");
		this.subScription = s;
		s.request(requestSize);		
	}

	public void onNext(Integer t) {
		System.out.println("데이터 "+ t);	
		bufferSize--;
		
		if(bufferSize == 0) {
			System.out.println("\n다음 요청");
			bufferSize=requestSize;
			subScription.request(requestSize);
		}

	}

	public void onError(Throwable t) {
		System.out.println("구독 중 에러");	
	}

	public void onComplete() {
		System.out.println("구독 종료");
	}
	
}
