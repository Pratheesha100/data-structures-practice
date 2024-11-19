package LabQuestion1;

public class main {

	public static void main(String[] args) {
		
		LinkList nameList = new LinkList();
		nameList.insertFirst("Prashani", 69.5);
		nameList.insertFirst("Aravindi", 78.9);
		nameList.insertFirst("nipuni", 53.5);
		System.out.print("Student's name: ");
		nameList.displayList();
		
		System.out.println("\n After adding more names to the array: ");
		nameList.insertFirst("Samadhi", 90.9);
		nameList.insertFirst("Nethmi", 87.9);
		nameList.displayList();
		
		nameList.deleteLink("Prashani");
		System.out.println(" ");
		System.out.println("\n After deleting the name from the array: ");
		nameList.displayList();


	}

}
