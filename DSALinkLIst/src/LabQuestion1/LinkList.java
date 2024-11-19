package LabQuestion1;

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
	public boolean find(String name, Double average) {
		Link current=first;
		while( current!= null) {
			if(current.name == name && current.avg ==average) {
				return true;
			}
			else {
				current = current.next;
			}
		}
		return false;
	}
	
	public void insertFirst(String name, Double average) {
		Link newLink = new Link(name, average);
		newLink.next = first;
		first = newLink;
		
	}
	
	public void insertMiddle(String name, String newName, Double avg, Double newAvg) {
		Link newLink = new Link(newName, newAvg);
		Link current = first;
		
		while (current != null) {
			if(current.name == name && current.avg == avg) {
				newLink.next = current.next;
				current.next =newLink;
			}
		}
	}
	
	public Link deleteFirst() {
		Link current = first;
		first = first.next;
		return current;
		
	}
	public Link deleteLink(String name)
	{
		Link current = first;
		Link Previous = null;
		
		while (current != null)
		{
			if (current.name.equals(name))
			{
				if (Previous == null)
				{
					first = current.next;
					
				}
				else {
					Previous.next = current.next;
				}
				
				return current;
			}
			
			Previous = current;
			current = current.next;
			
		}
		
		return null;
	}



	public boolean isEmpty() {
		return (first == null);
	}

}
