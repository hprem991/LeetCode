package List;

//  Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class RotateList {
	 public ListNode rotateRight(ListNode head, int k) {
	        ListNode ref = head;
	        if (head==null||head.next==null) return head;
	        ListNode dummy=new ListNode(0);
	        dummy.next=head;
	        ListNode fast=dummy,slow=dummy;

	        int i;
	        for (i=0;fast.next!=null;i++)//Get the total length 
	        	fast=fast.next;
	        
	        for (int j=i-k%i;j>0;j--) //Get the i-k%i th node
	        	slow=slow.next;
	        
	        fast.next=dummy.next; //Do the rotation
	        dummy.next=slow.next;
	        slow.next=null;
	        
	        return dummy.next;
	    }
}