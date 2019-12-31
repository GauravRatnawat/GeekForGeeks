package Queue;

public class ArrayImplementation {
private static int front,rear,capacity;
private static int queue[];
ArrayImplementation(int c)
{
	front=rear=0;
	capacity=c;
	queue=new int[capacity];
}

public static void main(String[] args) 
{ 
    // Create a queue of capacity 4 
	ArrayImplementation q = new ArrayImplementation(4); 

    // print Queue elements 
    q.queueDisplay(); 

    // inserting elements in the queue 
    q.queueEnqueue(20); 
    q.queueEnqueue(30); 
    q.queueEnqueue(40); 
    q.queueEnqueue(50); 

    // print Queue elements 
    q.queueDisplay(); 

    // insert element in the queue 
    q.queueEnqueue(60); 

    // print Queue elements 
    q.queueDisplay(); 

    q.queueDequeue(); 
    q.queueDequeue(); 
    System.out.printf("\n\nafter two node deletion\n\n"); 

    // print Queue elements 
    q.queueDisplay(); 

    // print front of the queue 
    q.queueFront(); 
}

private void queueFront() {
	if (front == rear) { 
        System.out.printf("\nQueue is Empty\n"); 
        return; 
    } 
    System.out.printf("\nFront Element is: %d", queue[front]); 
    return; 	
}

private void queueDequeue() {
	if(rear==front)
	{
		System.out.println("Queue is empty");
	}
	else
	{
		for(int i=0;i<rear-1;i++)
		{
			queue[i]=queue[i+1];
		}
		if(rear<capacity)
			queue[rear]=0;
		rear--;
	}
}

private void queueEnqueue(int i) {
	// TODO Auto-generated method stub
	if(capacity==rear)
	{
		System.out.println("Queue is full");
	}
	else
	{
		queue[rear]=i;
		rear++;
	}
}

private void queueDisplay() {
	int i;
	if(front==rear)
	{
		System.out.println("Queue is empty");
	}
	else
	{
		for( i=front;i<rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
} 

}
