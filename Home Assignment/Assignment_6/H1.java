package Assignment_6;

class BSTNode{
	int info;
	BSTNode right,left;
	public BSTNode(int info) {
		// TODO Auto-generated constructor stub
	   this.info = info;
	   this.right=null;
	   this.left=null;
	}
}
public class H1{
	BSTNode root;

    void insert(int info) {
        root = insertRec(root, info);

    }

    BSTNode insertRec(BSTNode root, int info) {
        if (root == null) {
            return new BSTNode(info);
        }
        if (info < root.info) {
            root.left = insertRec(root.left, info);
        } else if (info > root.info) {
            root.right = insertRec(root.right, info);
        } else {
            System.out.println("Key " + info + " already exits in the tree");
        }
        return root;
    }
    public void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    public void traversePreOrderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            traversePreOrderRec(root.left);
            traversePreOrderRec(root.right);
        }
    }

    public void traversePostOrderRec(BSTNode root) {
        if (root != null) {
            traversePostOrderRec(root.left);
            traversePostOrderRec(root.right);
            System.out.print(root.info + " ");
        }
    }
	public static void main(String[] args) {
		H1 tree = new H1();
		tree.insert(50);
	    tree.insert(30);
	    tree.insert(20);
	    tree.insert(40);
	    tree.insert(70);
	    tree.insert(60);
	    tree.insert(80);System.out.println("Inorder: ");
		tree.inorderRec(tree.root);
		System.out.println("\nPreorder: ");
		tree.traversePreOrderRec(tree.root);
		System.out.println("\nPostorder: ");
		tree.traversePostOrderRec(tree.root);
	}
}

//OUTPUT: 
//Inorder: 
//20 30 40 50 60 70 80 
//Preorder: 
//50 30 20 40 70 60 80 
//Postorder: 
//20 40 30 60 80 70 50 
