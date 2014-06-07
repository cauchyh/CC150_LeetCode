/*
	Given a linked list, swap every two adjacent nodes and return its head.

	For example,
	Given 1->2->3->4, you should return the list as 2->1->4->3.

	Your algorithm should use only constant space. 
	You may not modify the values in the list, only nodes itself can be changed.
*/

public class SwapNodesInPair
{
	public static ListNode swapPairs(ListNode head) 
    {
        ListNode head0 = new ListNode(0);
        head0.next = head;
        head = head0;
        ListNode cur = head0.next;
        while (cur != null && cur.next != null) {
            head.next = cur.next;
            cur.next = cur.next.next;
            head.next.next = cur;
            head = head.next.next;
            cur = cur.next;
        }
        return head0.next;
    }
}