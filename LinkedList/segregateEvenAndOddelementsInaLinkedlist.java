package LinkedList;

public class segregateEvenAndOddelementsInaLinkedlist {
	Node head;
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	void push(int newData)
	{
		Node new_Node=new Node(newData);
		new_Node.next=head;
		head=new_Node;

	}
	public static void main(String ar[])
	{
		segregateEvenAndOddelementsInaLinkedlist llist=new segregateEvenAndOddelementsInaLinkedlist();
		llist.push(11); 
		llist.push(10); 
		llist.push(9); 
		llist.push(6); 
		llist.push(4); 
		llist.push(1); 
		llist.push(0); 
		System.out.println("Origional Linked List"); 
		llist.printList(); 

		llist.segregateEvenOdd(); 

		System.out.println("Modified Linked List"); 
		llist.printList(); 
	}
	private void segregateEvenOdd() {
		Node evenStart=null;
		Node evenEnd=null;
		Node oddStart=null;
		Node oddEnd=null;
		Node currentNode=head;

		while(currentNode!=null)
		{
			int element=currentNode.data;
			if(element%2==0)
			{
				if(evenStart==null)
				{
					evenStart=currentNode;
					evenEnd=evenStart;
				}
				else
				{
					evenEnd.next=currentNode;
					evenEnd=evenEnd.next;
				}
			}
			else
			{
				if(oddStart==null)
				{
					oddStart=currentNode;
					oddEnd=oddStart;
				}
				else
				{
					oddEnd.next=currentNode;
					oddEnd=oddEnd.next;
				}
			}
			currentNode=currentNode.next;
		}

		if(oddStart==null || evenStart==null)
		{
			return;
		}
		evenEnd.next=oddStart;
		oddEnd.next=null;
		head=evenStart;
		// TODO Auto-generated method stub

	}
	private void printList() {

		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();		
	}



}
