package study;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nord head = new Nord(0);
		head.append(1);
		head.append(3);
		head.append(4);
		head.append(2);
		head.append(4);
		head.printNode();
		head.delete(4);
		head.printNode();
	
	}

}

class Nord{
	
	int data;
	Nord nextNord;
	
	Nord(int d){
		this.data = d; 
	}
	
	void append(int d) {
		Nord nord = new Nord(d);
		Nord n = this;
		while(n.nextNord != null ) {
			n = n.nextNord;
		}
		n.nextNord = nord;
	}
	
	void delete(int d) {

		Nord n = this;
		while(n.nextNord != null) {
			if( n.nextNord.data == d) 
				n.nextNord =  n.nextNord.nextNord;			
			else
				n = n.nextNord;
	}
}		
	void printNode() {
		Nord n = this;		
		while(n.nextNord != null) {
			System.out.print(n.data + " -> ");
			n = n.nextNord;
		}
		System.out.println(n.data);
	}
	
	}
	

	