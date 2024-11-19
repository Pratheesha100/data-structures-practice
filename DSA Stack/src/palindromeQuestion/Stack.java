package palindromeQuestion;

public class Stack {
		private int top;
		private int max;
		private char[] array;
		
		public Stack(int max) {
			 this.max = max;
			 top = -1;
			 array = new char [max];
			 
		}
		
		public void push(char item) {
			if(top == max - 1) {
				System.out.println("Stack is full");
			}
			else {
				top++;
				array[top] = item;
			}
		}
		
		public char pop() {
			if(top == -1) {
				System.out.println("Stack is empty");
				return '0';
			}
			else {
				
				return array[top--];
			}
		}
		
		public char peek() {
			if(top == -1) {
				System.out.println("Stack is empty");
				return '0';
			}
			else {
				return array[top];
			}
		}
		
		public boolean isEmpty() {
			return (top == -1);
			
		}
		
		public boolean isFull(){
		    return (top == (max -1));
	    }
		
		public void display() {
			for(int i=0; i <= top; i++) {
				System.out.print(array[i]+" ");
			}
		}
		
		public void reverse() {
			for(int i=top; i >= 0; i--) {
				System.out.print(array[i]+" ");
			}
		}

}
