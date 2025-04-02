package DataStructure;

import java.util.*;

class Node {
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

    // DFS
    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void traversePreOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            traversePreOrderRec(root.left);
            traversePreOrderRec(root.right);
        }
    }

    public void traversePostOrderRec(Node root) {
        if (root != null) {
            traversePostOrderRec(root.left);
            traversePostOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // BFS implementation
    void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

    }

    public static void main(String[] args) {
        Q1 tree = new Q1();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println();
        System.out.println("Inorder: ");
        tree.inorderRec(tree.root);
        System.out.println("\nPreorder: ");
        tree.traversePreOrderRec(tree.root);
        System.out.println("\nPostorder: ");
        tree.traversePostOrderRec(tree.root);
        System.out.println("\nBFS");
        tree.levelOrder();
        System.out.println();
    }
}

//OUTPUT:
//Inserted: 50
//Inserting 30 to the left of 50
//Inserted: 30
//Inserting 20 to the left of 50
//Inserting 20 to the left of 30
//Inserted: 20
//Inserting 40 to the left of 50
//Inserting 40 to the right of 30
//Inserted: 40
//Inserting 70 to the right of 50
//Inserted: 70
//Inserting 60 to the right of 50
//Inserting 60 to the left of 70
//Inserted: 60
//Inserting 80 to the right of 50
//Inserting 80 to the right of 70
//Inserted: 80
//
//Inorder: 
//20 30 40 50 60 70 80 
//Preorder: 
//50 30 20 40 70 60 80 
//Postorder: 
//20 40 30 60 80 70 50 
//BFS
//50 30 70 20 40 60 80 

