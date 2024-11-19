package TopSwap;

public class StackX {
	
	private int top;
	private int max;
	private String[] array;
	
	public StackX(int max) {
		 this.max = max;
		 top = -1;
		 array = new String [max];
		 
	}
	
	public void push(String chara) {
		if(top == max - 1) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			array[top] = chara;
		}
	}
	
	public String pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			
			return array[top--];
		}
	}
	
	public String peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return null;
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
	
	
}
