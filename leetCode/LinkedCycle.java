// detec whether a linked list has cycle
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedCycle
{
	public static boolean hasCycle(ListNode head)
	{
		// create two tracer, one moves 1, the other moves 2 at each step.
		ListNode fast = head;
		ListNode slow = head;

		while (fast.next != null && fast != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
			{
				return true;
			}
		}
		return false;
	}
}