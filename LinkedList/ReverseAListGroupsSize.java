package LinkedList;

public class ReverseAListGroupsSize {
	 Node head;
	 class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) {data = d; next = null; } 
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAListGroupsSize llist = new ReverseAListGroupsSize(); 
         
	        /* Constructed Linked List is 1->2->3->4->5->6-> 
	           7->8->8->9->null */
	        llist.push(9); 
	        llist.push(8); 
	        llist.push(7); 
	        llist.push(6); 
	        llist.push(5); 
	        llist.push(4); 
	        llist.push(3); 
	        llist.push(2); 
	        llist.push(1); 
	          
	        System.out.println("Given Linked List"); 
	        llist.printList(); 
	          
	        llist.head = llist.reverse(llist.head, 3); 
	  
	        System.out.println("Reversed list"); 
	        llist.printList(); 
	}

	private Node reverse(Node head, int k) {
		// TODO Auto-generated method stub
		Node current=head;
		Node nxt=null;
		Node prev=null;
		int count=0;
		while(count<k&& current!=null)
		{
			nxt=current.next;
			current.next=prev;
			prev=current;
			current=nxt;
			count++;
		}
		
		if(nxt!=null)
			head.next=reverse(nxt, k);
		return prev;
	}

	private void printList() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" "); 
	           temp = temp.next; 
		}
		System.out.println();
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		Node temp=new Node(i);
		temp.next=head;
		head=temp;
	}

}
