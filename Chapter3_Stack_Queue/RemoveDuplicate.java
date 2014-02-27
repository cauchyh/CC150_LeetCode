/*Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3
*/

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

public class RemoveDuplicate
{
	public static ListNode deleteDuplicates(ListNode head) 
	{
		ListNode cur = head; // start from the very beginning
		// ListNode follower = head.next; 
		while (cur.next != null)
		{
			if (cur.val == cur.next.val)
			{
				cur.next = cur.next.next;
			}
			else
			{
				cur = cur.next;
			}
		}
		return head;
    }
}