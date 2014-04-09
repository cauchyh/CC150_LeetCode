/*
	Given a singly linked list L: L0→L1→…→Ln-1→Ln,
	reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

	You must do this in-place without altering the nodes' values.

	For example,
	Given {1,2,3,4}, reorder it to {1,4,2,3}.
*/
import java.util.*;

public class ReorderList
{
	public static void reorderList(ListNode head) 
    {
        if (head == null || head.next == null)
        {
            return;
        }
        Stack<ListNode> stack = new Stack<ListNode> ();
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        ListNode cur = pre.next;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        // ListNode cur = head.next;
        while (slow != null)
        {
            stack.push(slow);
            slow = slow.next;
        }
        while(!stack.isEmpty())
        {
            pre.next = stack.pop();
            pre.next.next = cur;
            pre = cur;
            cur = pre.next;
        }
        cur.next = null;
    }
}