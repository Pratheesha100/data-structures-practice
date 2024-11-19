package Labsheet2;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		/*QueuX que = new QueuX(5);
		
		que.insert("145");
		que.insert("666");
		que.insert("112");
		que.insert("598");
		que.insert("123");
		
		QueuX evenQueue = new QueuX(5);
		QueuX oddQueue = new QueuX(5);
		
		while(!que.isEmpty()) {
			String item = que.remove();
			Integer items = Integer.parseInt(item);
			if(items % 2 == 0) {
				evenQueue.insert(item);
			}
			else {
				oddQueue.insert(item);
			}
		}
		
		System.out.println("PC1" );
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction "+evenQueue.remove());
		}
		
		System.out.println("PC2" );
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction "+oddQueue.remove());
		}
		
	*/	
		//lonath pdf Q1
		/*//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter the size of the queue: ");
		//int size = scan.nextInt();
		//QueuX que = new QueuX(size);
		
		QueuX que = new QueuX(3);
		
			que.insert("3.1");
			System.out.println("Inserted: 3.1");
	
			que.insert("5.7");
			System.out.println("Inserted: 5.7");
			
			que.insert("9.8");
			System.out.println("Inserted: 9.8");
			
			System.out.println("removed: " + que.remove());
			System.out.println("removed: " + que.remove());
			System.out.println("removed: " + que.remove());
		*/
		
		
		//Lonath pdf Q2
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the queue: ");
		int size = scan.nextInt();
		CircularQueuue que = new CircularQueuue(size);
		int count=0;
		
		while(count != size) {
			System.out.println("Enter a double value: ");
			double input =  scan.nextDouble();
			que.insert(input);
			System.out.println("Inserted:" + input);
			count++;
		}
		System.out.println("front value (before): "+ que.peekFront());
		if(count == 3) {
		 System.out.println("Queue is full. Please remove the elements from the queue to enter more values.");
		}
		
		System.out.println("Removed: "+ que.remove());
		System.out.println("Removed: "+ que.remove());
		
		count =0;
		while(count != 2) {
			System.out.println("Enter a double value: ");
			double input =  scan.nextDouble();
			que.insert(input);
			System.out.println("Inserted:" + input);
			count++;
		}
		System.out.println("front value (after): "+ que.peekFront());
		
		
	}
	
	
	
	

}
