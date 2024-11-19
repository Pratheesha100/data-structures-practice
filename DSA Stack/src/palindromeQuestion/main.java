package palindromeQuestion;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = scan.nextLine().toUpperCase();
		
		Stack stack = new Stack(5); 
		Queue que = new Queue(5);
		
		for(int i=0; i<input.length(); i++) {
			char ch =input.charAt(i);
			stack.push(ch);
			que.insert(ch);
		}
		boolean isPalindrome = true;;
		while(!stack.isEmpty()) {
			if(stack.pop() != que.remove()) {
				isPalindrome = false;
				break;
			}
		}

		if(isPalindrome)
			System.out.println("Palindrome");
		else
			  System.out.println("Not a Palindrome");

	}

}
