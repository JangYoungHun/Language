package study;

import java.util.Arrays;
import java.util.Comparator;

//p.127
//binary search �Ű����� ���ϴ� ���ı���
public class Comparator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicalData[] arr = {
				new PhysicalData("������",10 ,153.2),
				new PhysicalData("�ϴ���",13 , 164.42),
				new PhysicalData("�浿��",15 ,161.23 ),
				new PhysicalData("����",17 ,168.25 ),
				new PhysicalData("����",18 ,170.5)				
		};
		Comparator<PhysicalData> AGE_COMP = new Comp(); 
		int n = Arrays.binarySearch(arr, new PhysicalData("", 18, 0.0), AGE_COMP );
		System.out.print(n);
	}

	
	static class Comp implements Comparator<PhysicalData>{
		@Override
		public int compare(PhysicalData o1, PhysicalData o2) {	
			return o1.age > o2.age ? 1 : (o1.age < o2.age)?-1 : 0;
		}	
	}
			
}

class PhysicalData{
	
	String name;
	int age;
	double height;
	
	public PhysicalData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
}