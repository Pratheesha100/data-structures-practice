package lonathPdf;

public class BinaryTree {
	 private Node root; 
	 
	 public BinaryTree() { 
	        root = null; 
	 }
	 
	 public void insert(double data) { 
		root = insertRec(root, data); 
	 } 
	 
	    private Node insertRec(Node root, double data) 
	{ 
	        if (root == null) { 
	            root = new Node(data); 
	            return root; 
	        } 
	        if (data < root.data) { 
	            root.left = insertRec(root.left, data); 
	        } else if (data > root.data) { 
	            root.right = insertRec(root.right, data); 
	        } 
	        return root; 
	    }
	    
	    
	    public void inorder() { 
	    	inorderRec(root); 
	        System.out.println(); 
	    }  
	    
	    private void inorderRec(Node root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.print(root.data + " "); 
	            inorderRec(root.right); 
	        } 
	    }
	    
	    public boolean search(double data) { 
	        return searchRec(root, data);
	    } 
	    
	    private boolean searchRec(Node root, double data) { 
              if (root == null) { 
	    		 return false; 
	    		 } 
	          if (root.data == data) { 
	    	     return true; 
	    	} 
	    	  return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data); 
	    		    }
}

