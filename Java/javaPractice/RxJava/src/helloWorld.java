import java.util.Collections;

import io.reactivex.rxjava3.core.Flowable;


public class helloWorld {

	public static void main(String[] args) {
		
		/*
		 * Flowable.just("hello", "world").subscribe(str ->{
		 * System.out.println(Thread.currentThread().getName() + " : " + str); });
		 * 
		 * Flowable.range(0, 10).subscribe(n ->{
		 * System.out.println(Thread.currentThread().getName() + " : " + n); });
		 * 
		 * Flowable.range(0, 10).filter(n -> n%2 ==0).subscribe(n ->{
		 * System.out.println(Thread.currentThread().getName() + " : " + n); });
		 * 
		 */
		
		Integer arr[] = {2,4,6,9,8,512,3,4,6,8,21};
		
		Flowable.fromArray(arr).sorted().subscribe( n -> System.out.print(n + "  ") );
		System.out.println();
		Flowable.fromArray(arr).sorted(Collections.reverseOrder()).subscribe( n -> System.out.print(n+ "  ") );
		
	}

}
