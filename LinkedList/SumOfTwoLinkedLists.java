package LinkedList;

public class SumOfTwoLinkedLists {
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
	
	Node head1,head2,result;
	int carry;
	private void printList(Node temp) {

	
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfTwoLinkedLists list = new SumOfTwoLinkedLists(); 
        list.head1 = null; 
        list.head2 = null; 
        list.result = null; 
        list.carry = 0; 
        int arr1[] = { 9, 9, 9 }; 
        int arr2[] = { 1, 8 }; 
  
        // Create first list as 9->9->9 
        for (int i = arr1.length - 1; i >= 0; --i) 
            list.push(arr1[i], 1); 
  
        // Create second list as 1->8 
        for (int i = arr2.length - 1; i >= 0; --i) 
            list.push(arr2[i], 2); 
  
        list.addlists(); 
  
        list.printList(list.result); 
	}
	private void addlists() {
		if(head1==null)
		{
			result=head2;
			return;
		}
		if(head2==null) {
			result=head1;
			return;
		}
		
		int size1=getSize(head1);
		int size2=getSize(head2);
		
		if(size1==size2)
		{
			addSameSize(head1,head2);
		}
		else
		{
			if(size1<size2)
			{
				Node temp=head1;
				head1=head2;
				head2=temp;
			}
			int diff=Math.abs(size1-size2);
			Node temp=head1;
			while(diff-- >=0)
			{
				cur=temp;
				temp=temp.next;
			}
			addSameSize(cur	, head2);
			propogateCarry(head1);
		}
		if (carry>0)
			push(carry, 3);
	}
	private void propogateCarry(Node head1) {
		if(head1!=cur)
		{
			propogateCarry(head1.next);
			 int sum = carry + head1.data; 
	            carry = sum / 10; 
	            sum %= 10; 
	  
	            // add this node to the front of the result 
	            push(sum, 3);
		}
	}
	Node cur;
	private void addSameSize(Node n, Node m) {
		if(n==null)
		{
			return;
		}
		
		addSameSize(n.next, m.next);
		
		int sum=n.data+m.data+carry;
		carry=sum/10;
		sum=sum%10;
		push(sum, 3);
	}
	private int getSize(Node head12) {
		int count=0;
		while(head12!=null)
		{
			count++;
			head12=head12.next;
		}
		return count;
	}
	private void push(int i, int j) {
		Node newNode=new Node(i);
		if(j==1)
		{
			newNode.next=head1;
			head1=newNode;
		}
		else if(j==2)
		{
			newNode.next=head2;
			head2=newNode;
		}
		else {
			newNode.next=result;
			result=newNode;
		}
	}

}
