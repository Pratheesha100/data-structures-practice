package Labsheet3;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}
	
	public void displayList() {
		Link current = first;
		while( current!= null) {
			//System.out.println(current.iData+ " ");
			current.displayLink();
			current=current.next;
		}
	}
	public boolean find(String value) {
		Link current=first;
		while( current!= null) {
			if(current.iData == value) {
				return true;
			}
			else {
				current = current.next;
			}
		}
		return false;
	}
	
	public void insertFirst(String value) {
		Link newLink = new Link(value);
		newLink.next = first;
		first = newLink;
		
	}
	
	public void insertMiddle(String value, String newValue) {
		Link newLink = new Link(newValue);
		Link current = first;
		
		while (current != null) {
			if(current.iData == value) {
				newLink.next = current.next;
				current.next =newLink;
			}
		}
	}
	
	public Link deleteFirst() {
		Link del = first;
		first = first.next;
		return del;
		
	}
	public Link getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}

}
