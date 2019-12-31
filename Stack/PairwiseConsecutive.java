package Stack;

import java.util.Stack;

public class PairwiseConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer> ();  
	    s.push(4);  
	    s.push(5);  
	    s.push(-2);  
	    s.push(-3);  
	    s.push(11);  
	    s.push(10);  
	    s.push(5);  
	    s.push(6);  
	    s.push(20);  
	  
	    if (pairWiseConsecutive(s))  
	        System.out.println("Yes");  
	    else
	        System.out.println("No");  
	  
	    System.out.println("Stack content (from top) after function call");  
	    while (s.isEmpty() == false)  
	    {  
	    System.out.print(s.peek() + " ");  
	    s.pop();  
	    }  
	}

	private static boolean pairWiseConsecutive(Stack<Integer> s) {
		// TODO Auto-generated method stub
		
		Stack<Integer> aux=new Stack<Integer>();
		while(!s.isEmpty())
		{
			aux.push(s.peek());
			s.pop();
		}
		boolean result=true;
		while(aux.size()>1)
		{
			int x=aux.peek();
			aux.pop();
			int y=aux.peek();
			aux.pop();
			if(Math.abs(x-y)!=1)
			{
				result=false;
			}
			s.push(x);
			s.push(y);
		}
		if(aux.size()==1)
		{
			s.push(aux.peek());
		}
		return result;
	}

}
