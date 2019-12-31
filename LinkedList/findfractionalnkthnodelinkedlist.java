package LinkedList;

public class findfractionalnkthnodelinkedlist {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	
	public static void main(String ar[])
	{
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		int k=2;
		
		
		printList(head);
		
		Node fractinalNode=fractionalNodes(head,k);
		System.out.println(fractinalNode.data);
		
	}


	private static Node fractionalNodes(Node head, int k) {
		int i=0;
		Node fraNode=null;
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			if(i%k==0) {
				if(fraNode==null)
					fraNode=head;
				else
					fraNode=fraNode.next;
			}
			i++;
		}
			
		return fraNode;
	}


	private static void printList(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
}
