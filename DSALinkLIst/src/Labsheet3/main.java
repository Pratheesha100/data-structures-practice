package Labsheet3;

public class main {

	public static void main(String[] args) {
		 
		LinkList obj = new LinkList();
		
		obj.insertFirst("7.2");
		System.out.println("Insereted: "+obj.getFirst());
		System.out.print("List: ");
		obj.displayList();
		obj.insertFirst("5.5");
		System.out.println("Insereted: "+obj.getFirst());
		System.out.print("List: ");
		obj.displayList();
		obj.insertFirst("9.8");
		System.out.println("Insereted: "+obj.getFirst());
		System.out.print("List: ");
		obj.displayList();
		
		System.out.println("Deleted: "+ obj.deleteFirst());
		System.out.print("\nList: ");
		obj.displayList();
		
		System.out.println("Deleted: "+ obj.deleteFirst());
		System.out.print("\nList: ");
		obj.displayList();
	}

}
