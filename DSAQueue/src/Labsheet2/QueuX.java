package Labsheet2;

public class QueuX {
	private String []printerQueue;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	
	public QueuX(int max) {
		maxSize = max;
		printerQueue = new String[maxSize];
		rear = -1;
		front = 0;
		noItems = 0;
	}
	
	public void insert(String j) {
		if(rear == maxSize -1) {
			System.out.print("Queue is full");
		}
		
		else {
			printerQueue[++rear] = j;
			noItems++;
		}
	}
	
	public String remove() {
		if(noItems == 0) {
			 System.out.print("Queue is empty");
			 return null;
		}
		else {
			noItems--;
			return printerQueue[front++];
		}
	}
	
	public boolean isEmpty(){
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}

	 public String peekFront() { 
		 
		 
	        if (noItems == 0) { 
	            return null;  
	        } else { 
	            return printerQueue[front]; 
	        } 
	    } 
	 

}
