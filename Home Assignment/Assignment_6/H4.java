package Assignment_6;

class Country {
	String name;
	long popln;

	public Country(String name, long popln) {
		this.name = name;
		this.popln = popln;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", popuplation=" + popln + "]\n";
	}
}
class BNode{
	Country info;
	BNode right,left;
	public BNode(Country info) {
		this.info = info;
		right=left=null;
	}
}
class BSTCountry{
	BNode root;
	public BSTCountry() {
		this.root = null;
	}
	public void insertNode(Country country) {
	  	root = insertNodeRec(root,country);
	}
	 BNode insertNodeRec(BNode root, Country info) {
        if (root == null) {
            return new BNode(info);
        }
        if (info.popln < root.info.popln) {
            root.left = insertNodeRec(root.left, info);
        } else if (info.popln > root.info.popln) {
            root.right = insertNodeRec(root.right, info);
        } else {
            System.out.println("Key " + info + " already exits in the tree");
        }
        return root;
 }


	public void inorderTraversal(BNode root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.info);
		inorderTraversal(root.right);
	}
	public BNode findMax() {
		if(root==null) {
			return null;
		}
		BNode current = root;
		while (current.right!=null) {
			current = current.right;
		}
		return current;
	}
	public BNode findMin() {
		if(root==null) {
			return null;
		}
		BNode current = root;
		while (current.left!=null) {
			current = current.left;
		}
		return current;
	}
}

public class H4 {
	public static void main(String[] args) {
       BSTCountry bst = new BSTCountry();
       bst.insertNode(new Country("India", 120));
       bst.insertNode(new Country("USA", 60));
       bst.insertNode(new Country("Russia", 80));
       bst.insertNode(new Country("China", 150));

       System.out.println("Countries in order of their population: ");
       bst.inorderTraversal(bst.root);
       System.out.println("\nCountry with the maximum population: "+bst.findMax().info);
       System.out.println("Country with the minimum population: "+bst.findMin().info);
	}
}

//OUTPUT:
//Countries in order of their population: 
//Country [name=USA, popuplation=60]
//Country [name=Russia, popuplation=80]
//Country [name=India, popuplation=120]
//Country [name=China, popuplation=150]
//
//Country with the maximum population: Country [name=China, popuplation=150]
//
//Country with the minimum population: Country [name=USA, popuplation=60]
	