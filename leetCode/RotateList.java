/*
	Given a list, rotate the list to the right by k places, where k is non-negative.

	For example:
	Given 1->2->3->4->5->NULL and k = 2,
	return 4->5->1->2->3->NULL.
*/

public class RotateList
{
	public static ListNode rotateRight(ListNode head, int n) 
    {
    	if (head == null)
    	{
    		return null;
    	}

    	if (head.next == null)
    	{
    		return head;
    	}

    	ListNode pre = new ListNode(0);
    	ListNode cur = head;

    	for (int i=0; i<n; i++)
    	{
    		cur = cur.next;
    		if (cur == null)
    		{
    			return null;
    		}
    	}
    	if (cur.next == null)
		{
			return head;
		}
    	pre.next = cur.next;
    	cur.next = null;
    	cur = pre.next;
    	while (cur.next != null)
    	{
    		cur = cur.next;
    	}
    	cur.next = head;
    	return pre.next;

       //  if (head == null)
       //  {
       //      return null;
       //  }
       //  if (head.next == null)
       //  {
       //  	return head;
       //  }
       //  ListNode fast = head;
       //  ListNode slow = head;
       //  ListNode res;
       //  for (int i=0; i<n; i++)
       //  {
       //      fast = fast.next;
       //      if (fast == null)
       //      {
       //          return null;
       //      }
       //  }
       //  while (fast.next != null)
       //  {
       //      fast = fast.next;
       //      slow = slow.next;
       //  }
       //  res = slow.next;
       //  slow.next = null;
      	// // System.out.println("fast: "+fast.val);
      	// // System.out.println("slow: " + slow.val);
      	// // System.out.println("current: " + res.val);
      	// // System.out.println("head: " + head.val);
       //  fast.next = head;
       //  return res; 
    }
}