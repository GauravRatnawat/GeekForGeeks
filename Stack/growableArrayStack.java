package Stack;

public class growableArrayStack {
	static final int BOUND=4;
	static int length=0;
	static int top=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = create_new(new int[length + BOUND]); 
		  
	    // pushing element to top of stack 
	    a = push(a, 1); 
	    a = push(a, 2); 
	    a = push(a, 3); 
	    a = push(a, 4); 
	    display(a); 
	  
	    // pushing more element when stack is full 
	    a = push(a, 5); 
	    a = push(a, 6); 
	    display(a); 
	  
	    a = push(a, 7); 
	    a = push(a, 8); 
	    display(a); 
	  
	    // pushing more element so that stack can grow 
	    a = push(a, 9); 
	    display(a); 
	}

	private static int[] create_new(int[] a) {
		int[] new_a=new int[length+BOUND];
		for(int i=0;i<length;i++)
		{
			new_a[i]=a[i];
		}
		length+=BOUND;
		// TODO Auto-generated method stub
		return new_a;
	}

	private static void display(int[] a) {
		// TODO Auto-generated method stub
		 if (top == -1) 
		        System.out.println("Stack is Empty"); 
		    else 
		    { 
		        System.out.print("Stack: "); 
		        for (int i = 0; i <= top; i++) 
		            System.out.print(a[i] + " "); 
		        System.out.println(); 
		    } 
	}
	static void pop(int[] a) 
	{ 
	    top--; 
	} 
	private static int[] push(int[] a, int i) {
		// TODO Auto-generated method stub
		if(top==length-1)
			a=create_new(a);
		a[++top]=i;
		return a;
	}

}
