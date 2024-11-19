package Labsheet;

public class TreeNode {
	int id;
	String name;
	TreeNode left, right;
	 
	// Constructor for the TreeNode
	public TreeNode(int id, String name) {
	     this.id = id;
	     this.name = name;
	     left = right = null; // Initialize left and right children as null
	}
	 
	// Display the node's details
	public void displayNode() {
	     System.out.println("Node ID: " + id + " || Name: " + name);
	}


}
