package Queue;

public class LinkedlistImplementation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    { 
			Queue q = new Queue(); 
	        q.enqueue(10); 
	        q.enqueue(20); 
	        q.dequeue(); 
	        q.dequeue(); 
	        q.enqueue(30); 
	        q.enqueue(40); 
	        q.enqueue(50); 
	  
	        System.out.println("Dequeued item is " + q.dequeue().key); 
	    } 
	}



}
class Queue
{
	 Qnode front, rear;

	public void enqueue(int i) {
		// TODO Auto-generated method stub
		Qnode temp=new Qnode(i);
		if(this.rear==null)
		{
			this.front=this.rear=temp;
			
		}
		this.rear.next=temp;
		this.rear=temp;
	}

	public Qnode dequeue() {
		
		if(this.front==null)
			{
			System.out.println("Queue is empty");
			return null;
			}
		Qnode temp=this.front;
		this.front=this.front.next;
		
		if(this.front==null)
			this.rear=null;
		return temp;
		// TODO Auto-generated method stub
		
	}
	
}
 class Qnode
{
	int key;
	Qnode next;
	public Qnode(int key) {
		this.key=key;
		this.next=null;
		// TODO Auto-generated constructor stub
	}
}