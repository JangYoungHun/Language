package streams;

import java.util.Iterator;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

//��������(������, ���� ������ ����)
public class MySubScription implements Subscription {
	
	private Subscriber s;
	private Iterator<Integer> it;

	public MySubScription(Subscriber s, Iterable<Integer> its) {
		super();
		this.s = s;
		this.it = its.iterator();
		System.out.println("SubScription ���� ���� ���� �Ϸ�");
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
