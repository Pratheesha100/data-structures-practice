package TopSwap;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// variable declaration
		int size;
		String []array;
		String [] ar;
		int i = 0;
		String input;
				
		System.out.println("Enter the size of the stack array: ");
		size = scan.nextInt();
		scan.nextLine(); /// Consume the leftover newline from nextInt()
		
		//object creation
		StackX st = new StackX(size);
		array = new String[size];
		ar = new String[size];
		
		for(i=0; i<size; i++){
			System.out.println("Enter the element " + (i+1)+ ":");
			input = scan.nextLine();
			st.push(input);
		}
		
		//display the original stack
		i=0;
		System.out.println("\n::::::Original Stack::::::");
		while(!st.isEmpty()) {
			array[i]=st.pop();
			System.out.println(array[i]);
			i=i+1;
		}
		//swapping the top and top-1 values
		for(i=0; i<size; i++){
			if(i== 0)
				ar[1]= array[i];
			else if(i==1)
				ar[0]=array[i];
			else
				ar[i]=array[i];
			}
		
		//push the values to the stack array
		for(i=(size-1); i>=0; i--){
		st.push(ar[i]);
		}
		
		// created array display
		System.out.println("\n::::::Swapped Stack::::::");
		while(!st.isEmpty()) {
			 System.out.println(st.pop());
			}
		scan.close(); // Close the scanner

	}

}
