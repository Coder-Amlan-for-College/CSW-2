package DataStructure;

class Node{
	int key;
	Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
public class Q1 {
    Node root;
    void insert(int key) {
    	root = insertRec(root,key);
    	
    }
    Node insertRec(Node root, int key) {
    	if (root == null) {
    		System.out.println("Inserted: "+key);
        	return new Node(key);			
		}
    }
      
}
