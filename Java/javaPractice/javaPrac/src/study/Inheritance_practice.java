package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inheritance_practice {

	public static void main(String[] args) {
		
		Child1 child1 = new Child1();
		child1.printParentList();
		Child2 child2 = new Child2();
		child2.printParentList();
	}
	
	
	static class Parent{
		public List<Integer> list;
		public int field1 =10;
		protected int field2 = 10;
		private int field3 = 10;
		
		public Parent() {
			list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
		}

	}
	
	static class Child1 extends Parent{
		public int field1 =20;
		protected int field2 = 20;
		private int field3 = 20;
		
		public void printFields() {
			field2 = 30;
			System.out.println("field1 : " + field1);
			System.out.println("field2 : " + field2);
			System.out.println("field3 : " + field3);
		}
		void printSuperFields() {
			System.out.println("field1 : " + super.field1);
			System.out.println("field2 : " + super.field2);
			System.out.println("field3 : " + super.field3);
		}
		
		void printParentList(){
			list.add(4);
			System.out.println(list.toString());
		}
		
	}
	
	
	
	static class Child2 extends Parent{
		public int field1 =20;
		protected int field2 = 20;
		private int field3 = 20;
		
		public void printFields() {
			field2 = 30;
			System.out.println("field1 : " + field1);
			System.out.println("field2 : " + field2);
			System.out.println("field3 : " + field3);
		}
		void printSuperFields() {
			System.out.println("field1 : " + super.field1);
			System.out.println("field2 : " + super.field2);
			System.out.println("field3 : " + super.field3);
		}
		
		void printParentList(){
			System.out.println(list.toString());
		}
	}
}
