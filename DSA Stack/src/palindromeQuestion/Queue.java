package palindromeQuestion;

public class Queue {
	
	private char []printerQueue;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	
	public Queue(int max) {
		maxSize = max;
		printerQueue = new char[maxSize];
		rear = -1;
		front = 0;
		noItems = 0;
	}
	
	public void insert(char j) {
		if(rear == maxSize -1) {
			System.out.print("Queue is full");
		}
		
		else {
			printerQueue[++rear] = j;
			noItems++;
		}
	}
	
	public char remove() {
		if(noItems == 0) {
			 System.out.print("Queue is empty");
			 return '0';
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

	 public char peekFront() { 
		 
		 
	        if (noItems == 0) { 
	            return 'o' ;  
	        } else { 
	            return printerQueue[front]; 
	        } 
	    } 

}
