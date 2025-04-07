package Assignment_6;
//class Node{

//	int data;
//	Node1 left,right;
//	public Node1(int key) {
//		// TODO Auto-generated constructor stub
//		key =  this.key;
//		left = right = null;
//	}
//	
//}

public class H5 {
	Node root;

	void insert(int data) {
		root = insertRec(root, data);
	}

	Node insertRec(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		} else {
			System.out.println("Data " + data + " already exits in the tree");
		}
		return root;
	}

	Node deleteRec(Node root, int data) {
		if (root == null)
			return root;
		if (data < root.data) {
			root.left = deleteRec(root.left, data);
		} else if (data > root.data) {
			root.right = deleteRec(root.right, data);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		return root;
	}

	int minValue(Node node) {
		int minV = node.data;
		while (node.left != null) {
			minV = node.left.data;
			node = node.left;
		}
		return minV;
	}

	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		H5 tree = new H5();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println();
		System.out.println("Inorder before deletion: ");
		tree.inorderRec(tree.root);
		System.out.println();
		System.out.println("Tree after deleting leaf node (80)");
		tree.deleteRec(tree.root, 80);
		tree.inorderRec(tree.root);
		System.out.println();
		System.out.println("Tree after deleting Node x with one child (70)");
		tree.deleteRec(tree.root, 70);
		tree.inorderRec(tree.root);
		System.out.println();
		System.out.println("Tree after deleting Node having two children (30)");
		tree.deleteRec(tree.root, 30);
		tree.inorderRec(tree.root);
		System.out.println();

	}
}
//OUTPUT:
//Inorder before deletion: 
//20 30 40 50 60 70 80 
//Tree after deleting leaf node (80)
//20 30 40 50 60 70 
//Tree after deleting Node x with one child (70)
//20 30 40 50 60 
//Tree after deleting Node having two children (30)
//20 40 50 60 

