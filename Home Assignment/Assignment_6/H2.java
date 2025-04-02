package Assignment_6;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
} 
class BinarySearchTree {
  Node root;
  public Node createTree(int[]arr, int start, int end) {
	  if(start > end) {
		  return null;
	  }
	  int mid = (start+end)/2;
	  Node node = new Node(arr[mid]);
	  node.left = createTree(arr, start, mid-1);
	  node.right = createTree(arr, mid+1, end);
	  return node;
  }
  public void inorderTraversal(Node root) {
      if (root != null) {
          inorderTraversal(root.left);
          System.out.print(root.data + " ");
          inorderTraversal(root.right);
      }
  }

  public void traversePreOrder(Node root) {
      if (root != null) {
          System.out.print(root.data + " ");
          traversePreOrder(root.left);
          traversePreOrder(root.right);
      }
  }

  public void traversePostOrder(Node root) {
      if (root != null) {
          traversePostOrder(root.left);
          traversePostOrder(root.right);
          System.out.print(root.data + " ");
      }
  }
  
}
public class H2{
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int[]arr = {10,20,30,40,50,60,70,80,90,100};
		int n = arr.length;
		tree.root = tree.createTree(arr, 0, n-1);
		System.out.println("Inorder traversal of constructed BST:");
		tree.inorderTraversal(tree.root);
		System.out.println("\nPreorder traversal of constructed BST:");
		tree.traversePreOrder(tree.root);
		System.out.println("\nPostorder traversal of constructed BST:");
		tree.traversePostOrder(tree.root);
	}
}
//OUTPUT:
//Inorder traversal of constructed BST:
//10 20 30 40 50 60 70 80 90 100 
//Preorder traversal of constructed BST:
//50 20 10 30 40 80 60 70 90 100 
//Postorder traversal of constructed BST:
//10 40 30 20 70 60 100 90 80 50 