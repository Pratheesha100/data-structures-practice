package LabQuestion1;


public class Link {
	public String name;
	public double avg;
	public Link next;

	public Link(String name, Double avg) {
		this.name = name;
		this.avg = avg;
		next = null;
	}
	
	public void displayLink() {
		System.out.println(name +", "+ avg);
		
	}

}
