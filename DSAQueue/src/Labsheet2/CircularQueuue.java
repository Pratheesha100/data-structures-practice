package Labsheet2;

public class CircularQueuue {

	private double []queueArray;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	public CircularQueuue(int max) {
		maxSize = max;
		queueArray = new double[maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}
	
	 public void insert(double j) { 
	        if (nItems == maxSize) { 
	            System.out.println("Queue is full"); 
	        } else { 
	            if (rear == maxSize - 1) { 
	                rear = -1; 
	            } 
	            queueArray[++rear] = j; 
	 
	 
	            nItems++; 
	        } 
	    }
	 
	 public double remove() { 
	        if (nItems == 0) { 
	            return -99;  
	        } else { 
	            double temp = queueArray[front++]; 
	            if (front == maxSize) { 
	                front = 0;
	            } 
	            nItems--; 
	            return temp; 
	        } 
	    }
	 
	 public double peekFront() { 
		 
		 
	        if (nItems == 0) { 
	            return -99;  
	        } else { 
	            return queueArray[front]; 
	        } 
	    }
	 
	 public boolean isEmpty() { 
	        return (nItems == 0); 
	    } 
	 
	    public boolean isFull() { 
	        return (nItems == maxSize); 
	    }

}
