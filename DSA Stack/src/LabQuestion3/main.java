package LabQuestion3;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		System.out.print("Enter the character array size: ");
		int size = scan.nextInt();
		stack array = new stack(size);
		int count = 0;
		while( count != size) {
			System.out.print("\nEnter a character: ");
			char input = scan.next().charAt(0);
			if( input == '(')
			array.push(input);
			
			if(input == ')') {
				if(!array.isEmpty()) {
					array.pop();
				}
			}
				
			
			count++;
		}
		//System.out.println("Before operations");
	    //array.display();
	    
	    // question 1
	    //System.out.println("Reverse stack array");
	    //array.reverse();
	    
	    //System.out.println("\n");
		//System.out.println(array.pop());
		//System.out.println(array.pop());
		//System.out.println(array.peek());
		//System.out.println("\nAfter operations");
		//array.display();
		
		
		boolean flag = array.isEmpty();
		if(flag == true) {
			System.out.println("A valid expression");
		}
		else {
			System.out.println("Not a valid expression. Check your paranthesis order");
		}
	}

}

