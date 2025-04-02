package DataStructure;

public class Q3SearchBST {
	Node root;

	void insert(int key) {
		root = insertRec(root, key);

	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			System.out.println("Inserted: " + key);
			return new Node(key);
		}
		if (key < root.key) {
			System.out.println("Inserting " + key + " to the left of " + root.key);
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			System.out.println("Inserting " + key + " to the right of " + root.key);
			root.right = insertRec(root.right, key);
		} else {
			System.out.println("Key " + key + " already exits in the tree");
		}
		return root;
	}

	boolean search(int key) {
		return searchRec(root, key);
	}

	boolean searchRec(Node root, int key) {
		if (root == null || root.key == key) {
			return root != null;
		}
		if (root.key < key) {
			return searchRec(root.right, key);
		}
		return searchRec(root.left, key);
	}

	public void traversePreOrderRec(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			traversePreOrderRec(root.left);
			traversePreOrderRec(root.right);
		}
	}

	public static void main(String[] args) {
		Q3SearchBST tree = new Q3SearchBST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.traversePreOrderRec(tree.root);
		int searchKey = 40;
		System.out.println();
		if (tree.search(searchKey)) {
			System.out.println("Element " + searchKey + " is found in the binary tree.");
		} else {
			System.out.println("Element " + searchKey + " is not found in the binary tree.");
		}

	}
}
