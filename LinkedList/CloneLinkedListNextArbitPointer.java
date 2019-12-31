package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedListNextArbitPointer {

	Node1 head;//Linked list head reference 
	  
    // Linked list constructor 
    public CloneLinkedListNextArbitPointer(Node1 head) 
    { 
        this.head = head; 
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneLinkedListNextArbitPointer list = new CloneLinkedListNextArbitPointer(new Node1(5)); 
	        list.push(4); 
	        list.push(3); 
	        list.push(2); 
	        list.push(1); 
	  
	        // Setting up random references. 
	        list.head.random = list.head.next.next; 
	        list.head.next.random = 
	            list.head.next.next.next; 
	        list.head.next.next.random = 
	            list.head.next.next.next.next; 
	        list.head.next.next.next.random = 
	            list.head.next.next.next.next.next; 
	        list.head.next.next.next.next.random = 
	            list.head.next; 
	  
	        // Making a clone of the original linked list. 
	        CloneLinkedListNextArbitPointer clone = list.clone(); 
	  
	        // Print the original and cloned linked list. 
	        System.out.println("Original linked list"); 
	        list.print(); 
	        System.out.println("\nCloned linked list"); 
	        clone.print(); 
	}
	
	  public CloneLinkedListNextArbitPointer clone() 
	    {
		  Node1 origCurr=this.head,cloneCurr=null;
		  
		  Map<Node1,Node1> map=new HashMap<Node1, Node1>();
		  
		  while(origCurr!=null)
		  {
			cloneCurr=new Node1(origCurr.data);
			map.put(origCurr, cloneCurr);
			origCurr=origCurr.next;
			
		  }
		  origCurr=this.head;
		  while(origCurr!=null)
		  {
			  cloneCurr=map.get(origCurr);
			  cloneCurr.next=map.get(origCurr.next);
			  cloneCurr.random=map.get(origCurr.random);
			  origCurr=origCurr.next;
		  }
			return new CloneLinkedListNextArbitPointer(map.get(this.head)) ; 
	    
	    }

	private void print() {
		// TODO Auto-generated method stub
		Node1 temp=head;
		while(temp!=null)
		{
			Node1 random=temp.random;
			int randomData = (random != null)? random.data: -1; 
			System.out.println("Data= "+temp.data+" RandomData:"+ randomData);
			temp=temp.next;
		}
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		Node1 node=new Node1(i);
		node.next=this.head;
		this.head=node;
	}
	
}
 class Node1 
{ 
    int data;//Node data 
    Node1 next, random;//Next and random reference 
  
    //Node constructor 
    public Node1(int data) 
    { 
        this.data = data; 
        this.next = this.random = null; 
    } 
} 
