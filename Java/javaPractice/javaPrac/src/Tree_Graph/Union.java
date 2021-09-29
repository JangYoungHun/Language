package Tree_Graph;

// 노드간 연결 정보
//합집합

/*
							0	   2
					      /	 ㅣ   ㅣ
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

	    
	    System.out.println(" 0 과 1 은 연결되어있나?");
	    System.out.println(isUnion(parent, 0, 1));
	    System.out.println(" 0 과 2 는 연결되어있나?");
	    System.out.println(isUnion(parent, 0, 2));
	    System.out.println(" 0 과 3은 연결되어있나?");
	    System.out.println(isUnion(parent, 0, 3));
	    System.out.println(" 0 과 4 는 연결되어있나?");
	    System.out.println(isUnion(parent, 0, 4));

	    System.out.println();
	    
	    System.out.println(" 1 과 0 은 연결되어있나?");
	    System.out.println(isUnion(parent, 1, 0));
	    System.out.println(" 1 과 2은 연결되어있나?");
	    System.out.println(isUnion(parent, 1, 2));
	    System.out.println(" 1 과 3는 연결되어있나?");
	    System.out.println(isUnion(parent, 1, 3));
	    System.out.println(" 1 과 4은 연결되어있나?");
	    System.out.println(isUnion(parent, 1, 4));
	    
	    System.out.println();
	    
	    System.out.println(" 2 과 0 은 연결되어있나?");
	    System.out.println(isUnion(parent, 2, 0));
	    System.out.println(" 2 과 1 연결되어있나?");
	    System.out.println(isUnion(parent, 2, 1));
	    System.out.println(" 2 과 3는 연결되어있나?");
	    System.out.println(isUnion(parent, 2, 3));
	    System.out.println(" 2 과 4은 연결되어있나?");
	    System.out.println(isUnion(parent, 2, 4));
	    
	    System.out.println();
	    
	    System.out.println(" 3 과 0 은 연결되어있나?");
	    System.out.println(isUnion(parent, 3, 0));
	    System.out.println(" 3 과 1 연결되어있나?");
	    System.out.println(isUnion(parent, 3, 1));
	    System.out.println(" 3 과 2는 연결되어있나?");
	    System.out.println(isUnion(parent, 3, 2));
	    System.out.println(" 3 과 4은 연결되어있나?");
	    System.out.println(isUnion(parent, 3, 4));  
	    
	    System.out.println();
	    
	    System.out.println(" 4 과 0 은 연결되어있나?");
	    System.out.println(isUnion(parent, 4, 0));
	    System.out.println(" 4 과 1 연결되어있나?");
	    System.out.println(isUnion(parent, 4, 1));
	    System.out.println(" 4 과 2는 연결되어있나?");
	    System.out.println(isUnion(parent, 4, 2));
	    System.out.println(" 4 과 3은 연결되어있나?");
	    System.out.println(isUnion(parent, 4, 3));
	    
	    
	}

	static int getParent(int[] parent, int node) {
		if(parent[node] == node) return node;
		else
			return parent[node] = getParent(parent, parent[node]);
			
	}
	
	// 노드 합침, 연결
	public static void union(int[] parent, int node1, int node2) {
		int parent1 = getParent(parent, node1);
		int parent2 =  getParent(parent, node2);
		if(parent1 > parent2) {
			parent[parent1] = parent[parent2];
		}
		else
			parent[parent2] = parent[parent1];
	}
	
	//연결되어있는지, 같은 집합인지 확인
	public static int isUnion(int[] parent, int node1, int node2) {
		int parent1 = getParent(parent, node1);
		int parent2 =  getParent(parent, node2);
		if(parent1== parent2)
			return 1;
		else 
			return 0;
	}

	
}
