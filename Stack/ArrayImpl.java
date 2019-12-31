package Stack;

public class ArrayImpl {
	public ArrayImpl() {
		top=-1;
		// TODO Auto-generated constructor stub
	}
	
	static final int MAX=1000;
	int top;
	int a[]=new int[MAX];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayImpl s=new ArrayImpl();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
	}

	private int pop() {
		if(top<0)
		{
			System.out.println("Stack underflow ");
			return 0;
		}
		else {
			int x=a[top--];
			return x;
		}
		// TODO Auto-generated method stub
	}

	private boolean push(int i) {
		
		if(top>=(MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top]=i;
			System.out.println(i+" pushed into stack");
			return true;
		}
		// TODO Auto-generated method stub
		
	}

}
