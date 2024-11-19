package Labsheet;

public class main {

	public static void main(String[] args) {
		 Tree tree = new Tree();
			
		 tree.insertNode(149, "Anusha");
		 tree.insertNode(167, "kosala");
		 tree.insertNode(047, "Disusha");
		 tree.insertNode(066, "mihiri");
		 tree.insertNode(159, "jayani");
		 tree.insertNode(118, "Nimal");
		 tree.insertNode(195, "Nishantha");
	 
		 System.out.println("InOrder :::::::::");
		 tree.inOrderTraversal();
		
		 System.out.println("PreOrder :::::::::");
		 tree.preOrderTraversal();
		
		 System.out.println("PostOrder :::::::::");
		 tree.postOrderTraversal();


	}

}
