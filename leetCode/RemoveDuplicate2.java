/*Given a sorted linked list, delete all nodes that have duplicate numbers, 
leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicate2
{
	public ListNode deleteDuplicates(ListNode head) 
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
        pre.next = head;
        head = pre;
        ListNode cur = head.next;
        ListNode tracer = head;
        tracer.next = null; // this is a very important step 
                            // to make sure the orginal next is empty thus further operations can be done
        int curData = cur.val + 1; // make sure they are different numbers
        while (cur != null)
        {
            if (cur.val != curData && (cur.next == null || cur.val != cur.next.val))
            {
                tracer.next = cur;
                curData = cur.val;
                cur = cur.next;
                tracer = tracer.next;
                tracer.next = null;
            }
            else if (cur.val != curData)
            {
                curData = cur.val;
                cur = cur.next;
            }
            else // cur.val == curData
            {
                cur = cur.next;
            }
        }
        return head.next;

	}
}