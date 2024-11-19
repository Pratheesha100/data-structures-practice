package lonathPdf;

public class main {

	public static void main(String[] args) {
	     BinaryTree bt = new BinaryTree();
	        Double v1 = 7.2;
			Double v2 = 5.5;
			Double v3 = 9.8;
			Double v4 = 3.1;
			Double v5 = 6.0;
			Double v6 = 7.0;

	      bt.insert(v1);
	      System.out.println("Inserted: "+v1);
	      System.out.println("Inserted: "+v2);
	      System.out.println("Inserted: "+v3);
	      System.out.println("Inserted: "+v4);
	      System.out.println("Inserted: "+v5);
	      System.out.println("Inserted: "+v6);
	      
	      System.out.println("Searching the element 3.1"); 
	     boolean flag = bt.search(v4);
	     if(flag == false){
	    	 System.out.println(" Element found");
	     }
	     else {
	    	 System.out.println(" Element not found");
	     }
	     
	     
	     System.out.println("INORDER TRAVERSAL");
	     bt.inorder();
	     

	}

}
