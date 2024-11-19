package Labsheet3;

public class Link {
	public String iData;
	public Link next;

	public Link(String data) {
		iData = data;
		next = null;
	}
	
	public void displayLink() {
		System.out.print(iData + " " );
	}

}
