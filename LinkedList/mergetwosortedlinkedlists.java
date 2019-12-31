package LinkedList;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class mergetwosortedlinkedlists {
	public static void main(String[] args) {
		mergetwosortedlinkedlists llist1=new mergetwosortedlinkedlists();
		mergetwosortedlinkedlists llist2=new mergetwosortedlinkedlists();

		llist1.addToTheLast(new Node(5)); 
		llist1.addToTheLast(new Node(10)); 
		llist1.addToTheLast(new Node(15)); 

		llist2.addToTheLast(new Node(2)); 
		llist2.addToTheLast(new Node(3)); 
		llist2.addToTheLast(new Node(20)); 
		llist1.head = new cfg().sortedMerge(llist1.head,  
				llist2.head); 
		llist1.printList();
	}
	Node head;
	public void addToTheLast(Node node)
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}

	void printList()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}

class cfg

{

	Node sortedMerge(Node headA,Node headB)
	{
		Node dummyNode=new Node(0);
		Node tail=dummyNode;

		while(true)
		{
			if(headA==null)
			{
				tail.next=headB;
				break;
			}
			if(headB==null)
			{
				tail.next=headA;
				break;

			}
			if(headA.data<=headB.data)
			{
				tail.next=headA;
				headA=headA.next;
			}
			else
			{
				tail.next=headB;
				headB=headB.next;
			}
			tail=tail.next;
		}
		return dummyNode.next;

	}

}


