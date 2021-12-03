package study;

public class StringBuilder_Example {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder.size());
		stringBuilder.append(" World");
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder.size());
		stringBuilder.append(" \nnice to meet you JAVA");
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder.size());
	}

}

class StringBuilder{
	
	char[] array;
	int size = 10;
	int index =0;
	
	public StringBuilder() {
		array = new char[size];
	}
	
	public void append(String data) {
		if(data == null) data = "null";		
		
		if((index+data.length()) > size) {
			extendDataSize(data.length());
		}
		
		for(int i =0; i<data.length();i++) {			
			array[index] = data.charAt(i);
			index++;
		}
			
	}

	public void extendDataSize(int len) {
		size = (size+len)*2;
		char newArray[] = new char[size];
		
		for(int i =0; i<len;i++) {			
			newArray[i] = array[i];
		}
		array = newArray;
		
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		return new String(array, 0, index);
		
	}
	
	
	
}



