package Format;


public class Union_Find {
	
	
	public static void main(String[] args) {
	    
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
