package Queue;

import java.util.Stack;

public class StacksImplementation {

	static class Queue
	{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		static void enQueue(int x)
		{
				while(!s1.empty())
				{
					s2.push(s1.pop());
				}
				s1.push(x);
				while(!s2.empty())
				{
					s1.push(s2.pop());
				}
		}
		public Integer deQueue() {
			// TODO Auto-generated method stub
			  // if first stack is empty  
	        if (s1.isEmpty())  
	        {  
	            System.out.println("Q is Empty");  
	            System.exit(0);  
	        }  
	  
	        // Return top of s1  
	        int x = s1.peek();  
	        s1.pop();  
	        return x;  
		}
	}
	public static void main(String[] args)  
	{  
	    Queue q = new Queue();  
	    q.enQueue(1);  
	    q.enQueue(2);  
	    q.enQueue(3);  
	  
	    System.out.println(q.deQueue());  
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue()); 
	}  
}
