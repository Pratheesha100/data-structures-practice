package Labsheet;

public class Tree {
	private TreeNode root;
	 
	// Constructor for BinaryTree
	public Tree() {
	     root = null;
	}
	 
	// Insert a node into the binary tree
	public void insertNode(int id, String name) {
	     TreeNode newNode = new TreeNode(id, name);
	     if (root == null) {
	         root = newNode;
	     } else {
	    	 insertRecursively(root, newNode);
	     }
	}
	     // Helper method to insert a node recursively
	     private void insertRecursively(TreeNode current, TreeNode newNode){
	          if (newNode.id < current.id) {
	              if (current.left == null) {
	                  current.left = newNode;
	              } else {
	                  insertRecursively(current.left, newNode);
	              }
	          } else {
	              if (current.right == null) {
	                  current.right = newNode;
	              } else {
	                  insertRecursively(current.right, newNode);
	              }
	          }
	     }
	     
	  // Traverse and display nodes in an In-order traversal
	     public void inOrderTraversal(){
	          traverseInOrder(root);
	     }
	      
	     // Helper method for In-order traversal
	     private void traverseInOrder(TreeNode node){
	          if (node != null) {
	              traverseInOrder(node.left);
	              node.displayNode();
	              traverseInOrder(node.right);
	          }
	     }
	      
	     public void preOrderTraversal() {
	         preOrder(root);
	    }
	     
	    public void postOrderTraversal() {
	         postOrder(root);
	    }
	     
	    private void preOrder(TreeNode node)
	    {
	    	if (node != null)
	    	{
	    		node.displayNode();
	    		preOrder(node.left);
	    		preOrder(node.right);
	    	}
	    }
	    
	    private void postOrder(TreeNode node)
	    {
	    	if (node != null)
	    	{
	    		postOrder(node.left);
	    		postOrder(node.right);
	    		node.displayNode();
	    	}
	    }
	     
	     
	     
	    





}
