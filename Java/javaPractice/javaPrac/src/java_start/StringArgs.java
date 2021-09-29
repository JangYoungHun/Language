package java_start;

public class StringArgs {

	public static void main(String[] args) {
		// arg에 초기값 one two three 입력했음
		
		System.out.println(args.length);
		
		for(String i : args) {
			System.out.println(i);
		}
		
		

	}

}
