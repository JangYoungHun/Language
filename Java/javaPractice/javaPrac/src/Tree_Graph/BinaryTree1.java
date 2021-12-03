package Tree_Graph;
import Tree_Graph.Node;
//binaryTree 순회방법 
// https://www.youtube.com/watch?v=QN1rZYX6QaA&list=PLjSkJdbr_gFY8VgactUs6_Jc9Ke8cPzZP&index=2
// inorder preorder postorder

/*
			  (1)
      		↙  ↘
		(2)       (3)
      ↙  ↘
	(4)     (5)

 */


public class BinaryTree1 {
	
	public static void main(String[] args) {
		Tree1 tr = new Tree1();
		Node n3 = tr.makeNode(null, 3 , null);
		Node n4 = tr.makeNode(null, 4 , null);
		Node n5 = tr.makeNode(null, 5 , null);
		Node n2 = tr.makeNode(n4, 2 , n5);
		Node n1 =  tr.makeNode(n2, 1 , n3);
		tr.setRoot(n1);
		tr.inorder(tr.getRoot());
	}
}



class Tree1{
	
	Node root;
	
	void setRoot(Node node) {
		this.root = node; 
	}
	Node getRoot() {
		return root;
	}
	
	Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.right = right;
		node.left = left;
		return node;
	}	

	// left -> root -> right
		void inorder(Node node) {
			
			if(node != null) {		
				inorder(node.left);
				System.out.println(node.data);
				inorder(node.right);			
			}		
		}

		// root -> left  -> right
		void preorder(Node node) {
			
			if(node != null) {
				System.out.println(node.data);
				inorder(node.left);			
				inorder(node.right);			
			}		
		}
		//left  -> right -> root
		void postorder(Node node) {
			
			if(node != null) {
				inorder(node.left);			
				inorder(node.right);		
				System.out.println(node.data);
			}		
		}
		
}