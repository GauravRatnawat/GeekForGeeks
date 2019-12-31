package Stack;

public class ImplementKstackssingleArray {
	static class KStack
	{
		int arr[];
		int top[];
		int next[];
		 int n,k;
		 int free;
		 
		 public KStack(int k1,int n1) {
			// TODO Auto-generated constructor stub
			 k=k1;
			 n=n1;
			 arr=new int[n];
			 top=new int[k];
			 next=new int[n];
			 
			 for(int i=0;i<k;i++)
			 {
				 top[i]=-1;
			 }
			 
			 free=0;
			 for(int i=0;i<n;i++)
			 {
				 next[i]=i+1;
			 }
			 next[n-1]=-1;
		}

		public void push(int item, int sn) {
			// TODO Auto-generated method stub
			if(isFull())
			{
				System.out.println("Stack Overflow");
				return;
			}
			
			int i=free;
			
			free=next[i];
			
			next[i]=top[sn];
			top[sn]=i;
			
			arr[i]=	item;
		}

		private boolean isFull() {
			// TODO Auto-generated method stub
			return (free == -1); 
		}

		public int pop(int sn) {
			// TODO Auto-generated method stub
			if(isEmpty(sn))
			{
				System.out.println("Stack underflow");
				return Integer.MAX_VALUE;
			}
			int i=top[sn];
			
			top[sn]=next[i];
			
			next[i]=free;	
			free=i;
			return arr[i];
		}

		private boolean isEmpty(int sn) {
			// TODO Auto-generated method stub
			return (top[sn] == -1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k = 3, n = 10; 
         
	        KStack ks = new KStack(k, n); 
	  
	        ks.push(15, 2); 
	        ks.push(45, 2); 
	  
	        // Let us put some items in stack number 1 
	        ks.push(17, 1); 
	        ks.push(49, 1); 
	        ks.push(39, 1); 
	  
	        // Let us put some items in stack number 0 
	        ks.push(11, 0); 
	        ks.push(9, 0); 
	        ks.push(7, 0); 
	  
	        System.out.println("Popped element from stack 2 is " + ks.pop(2)); 
	        System.out.println("Popped element from stack 1 is " + ks.pop(1)); 
	        System.out.println("Popped element from stack 0 is " + ks.pop(0)); 
	   
	}

}
