package streams;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer>{
	
	
	private Subscription subScription;
	private int bufferSize = 4;
	private int requestSize = bufferSize;
	public void onSubscribe(Subscription s) {
		System.out.println("���� ����");
		this.subScription = s;
		s.request(requestSize);		
	}

	public void onNext(Integer t) {
		System.out.println("������ "+ t);	
		bufferSize--;
		
		if(bufferSize == 0) {
			System.out.println("\n���� ��û");
			bufferSize=requestSize;
			subScription.request(requestSize);
		}

	}

	public void onError(Throwable t) {
		System.out.println("���� �� ����");	
	}

	public void onComplete() {
		System.out.println("���� ����");
	}
	
}
