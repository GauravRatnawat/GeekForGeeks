package Stack;

public class LinkedListImpl {
	StackNode root;
	static class StackNode{
		int data;
		StackNode next;
		public StackNode(int data) {
			this.data=data;
			// TODO Auto-generated constructor stub
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl sll = new LinkedListImpl(); 
		  
	        sll.push(10); 
	        sll.push(20); 
	        sll.push(30); 
	  
	        System.out.println(sll.pop() + " popped from stack"); 
	  
	        System.out.println("Top element is " + sll.peek()); 
	}

	private int peek() {
		if(root==null)
		{
			System.out.println("Stack is emapty");
			return Integer.MIN_VALUE;
		}
		else
		{
			return root.data;
		}
		
		// TODO Auto-generated method stub
	}

	private int pop() {
		int popped=Integer.MIN_VALUE;
		if(root==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			popped=root.data;
			root=root.next;
		}
		// TODO Auto-generated method stub
		return popped;
	}

	private void push(int i) {
		
		StackNode newNode=new StackNode(i);
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			StackNode temp=root;
			root=newNode;
			newNode.next=temp;
		}
		System.out.println(i+"  pushed to stack");
		// TODO Auto-generated method stub
		
	}

}
