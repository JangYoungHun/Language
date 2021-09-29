package Tree_Graph;

// ��尣 ���� ����
//������

/*
							0	   2
					      /	 ��   ��
						1    4    3
*/
public class Union {
	
	
	public static void main(String[] args) {
		
		int n = 5;
	
	    int parent[] = new int[n];
		
	    for(int i=0; i<n; i++) {
	    	parent[i] = i;
	    }
	    
	    union(parent, 0,1);
	    union(parent, 0,4);
	    union(parent, 2,3);

	    
	    System.out.println(" 0 �� 1 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 0, 1));
	    System.out.println(" 0 �� 2 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 0, 2));
	    System.out.println(" 0 �� 3�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 0, 3));
	    System.out.println(" 0 �� 4 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 0, 4));

	    System.out.println();
	    
	    System.out.println(" 1 �� 0 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 1, 0));
	    System.out.println(" 1 �� 2�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 1, 2));
	    System.out.println(" 1 �� 3�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 1, 3));
	    System.out.println(" 1 �� 4�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 1, 4));
	    
	    System.out.println();
	    
	    System.out.println(" 2 �� 0 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 2, 0));
	    System.out.println(" 2 �� 1 ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 2, 1));
	    System.out.println(" 2 �� 3�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 2, 3));
	    System.out.println(" 2 �� 4�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 2, 4));
	    
	    System.out.println();
	    
	    System.out.println(" 3 �� 0 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 3, 0));
	    System.out.println(" 3 �� 1 ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 3, 1));
	    System.out.println(" 3 �� 2�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 3, 2));
	    System.out.println(" 3 �� 4�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 3, 4));  
	    
	    System.out.println();
	    
	    System.out.println(" 4 �� 0 �� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 4, 0));
	    System.out.println(" 4 �� 1 ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 4, 1));
	    System.out.println(" 4 �� 2�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 4, 2));
	    System.out.println(" 4 �� 3�� ����Ǿ��ֳ�?");
	    System.out.println(isUnion(parent, 4, 3));
	    
	    
	}

	static int getParent(int[] parent, int node) {
		if(parent[node] == node) return node;
		else
			return parent[node] = getParent(parent, parent[node]);
			
	}
	
	// ��� ��ħ, ����
	public static void union(int[] parent, int node1, int node2) {
		int parent1 = getParent(parent, node1);
		int parent2 =  getParent(parent, node2);
		if(parent1 > parent2) {
			parent[parent1] = parent[parent2];
		}
		else
			parent[parent2] = parent[parent1];
	}
	
	//����Ǿ��ִ���, ���� �������� Ȯ��
	public static int isUnion(int[] parent, int node1, int node2) {
		int parent1 = getParent(parent, node1);
		int parent2 =  getParent(parent, node2);
		if(parent1== parent2)
			return 1;
		else 
			return 0;
	}

	
}
