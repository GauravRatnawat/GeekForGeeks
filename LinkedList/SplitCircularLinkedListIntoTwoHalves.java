package LinkedList;

public class SplitCircularLinkedListIntoTwoHalves {
	 static Node head, head1, head2; 
	static class Node { 

		int data; 
		Node next, prev; 

		Node(int d) { 
			data = d; 
			next = prev = null; 
		} 
	} 


	public static void main(String[] args) {
		SplitCircularLinkedListIntoTwoHalves list = new SplitCircularLinkedListIntoTwoHalves(); 
		  
        //Created linked list will be 12->56->2->11 
        list.head = new Node(12); 
        list.head.next = new Node(56); 
        list.head.next.next = new Node(2); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = list.head; 
  
        System.out.println("Original Circular Linked list "); 
        list.printList(head); 
  
        // Split the list 
        list.splitList(); 
        System.out.println(""); 
        System.out.println("First Circular List "); 
        list.printList(head1); 
        System.out.println(""); 
        System.out.println("Second Circular List "); 
        list.printList(head2); 
	}

	private void splitList() {
		// TODO Auto-generated method stub
		Node slow_ptr=head;
		Node fast_ptr=head;
		if(head==null)
		{
			return;
		}
		while(fast_ptr.next!=head &&fast_ptr.next.next!=head)
		{
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		if(fast_ptr.next.next==null)
		{
			fast_ptr=fast_ptr.next;
		}
		head1=head;
		
		if(head.next!=head)
		{
			head2=slow_ptr.next;
		}
		
		fast_ptr.next=slow_ptr.next;
		slow_ptr.next=head;
	}

	private void printList(Node node) {
		 Node temp = node; 
	        if (node != null) { 
	            do { 
	                System.out.print(temp.data + " "); 
	                temp = temp.next; 
	            } while (temp != node); 
	        } 
	}

}
