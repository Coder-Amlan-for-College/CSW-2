package DataStructure;

//class Node {
//    int key;
//    Node left, right;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}

public class Q2DeleteNode {
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

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node node) {
        int minv = node.key;
        while (node.left != null) {
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    // DFS
    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Q2DeleteNode tree = new Q2DeleteNode();
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

        int keyToDelete = 50;
        System.out.println("\nDeleting key: " + keyToDelete);
        tree.root = tree.deleteRec(tree.root, keyToDelete);

        System.out.println("Inorder after deleting " + keyToDelete + ": ");
        tree.inorderRec(tree.root);
        System.out.println();
    }
}