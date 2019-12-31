package LinkedList;



public class PairwiseSwapElementsLinkedList2 {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data =d;
			next=null;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* The constructed linked list is: 
        1->2->3->4->5->6->7 */
		PairwiseSwapElementsLinkedList2 list = new PairwiseSwapElementsLinkedList2(); 
       list.head = new Node(1); 
       list.head.next = new Node(2); 
       list.head.next.next = new Node(3); 
       list.head.next.next.next = new Node(4); 
       list.head.next.next.next.next = new Node(5); 
       list.head.next.next.next.next.next = new Node(6); 
       list.head.next.next.next.next.next.next = new Node(7); 
 
       System.out.println("Linked list before calling pairwiseSwap() "); 
       list.printList(head); 
       Node st = list.pairWiseSwap(head); 
       System.out.println(""); 
       System.out.println("Linked list after calling pairwiseSwap() "); 
       list.printList(st); 
       System.out.println(""); 
	}

	private Node pairWiseSwap(Node node) {
		if(node==null || node.next==null)
		{
			return node;
		}
		
		Node remaining=node.next.next;
		Node newHead=node.next;
		
		node.next.next=node;
		
		node.next=pairWiseSwap(remaining);
		return newHead;
	}

	private void printList(Node node) {
		// TODO Auto-generated method stub
		 while (node != null) { 
	            System.out.print(node.data + " "); 
	            node = node.next; 
	        } 
		
	}

}
