/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.
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

 public class MergeTwoSLists
 {
 	public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
 	{
 		if (l1 == null)
 		{
 			return l2;
 		}
 		else if (l2 == null) 
 		{
 			return l1;
 		}
 		else
 		{
 			ListNode cur;
 			ListNode mark;
 			if (l1.val <= l2.val)
 			{
 				cur = l1;
 				mark = l2;
 			}
 			else
 			{
 				cur = l2;
 				mark = l1;
 			}
 			// System.out.println(cur.val+ " " + mark.val);
 			ListNode temp;
 			while (cur.next != null)
 			{
 				if (cur.next.val > mark.val)
 				{
 					temp = cur.next;
 					cur.next = mark;
 					mark = temp;
 				}
 				else
 				{
 					cur = cur.next;
 				}
 			}
 			cur.next = mark;
 			if (l1.val <= l2.val)
 			{
 				return l1;
 			}
 			else
 			{
 				return l2;
 			}
	 		// // The returned list should be sorted as well
	 		// ListNode l1_temp1;
	 		// ListNode l1_temp2;
	 		// ListNode l2_temp1;
	 		// ListNode l2_temp2;
	 		// // ListNode cur1 = l1;
	 		// l1_temp1 = l1;
	 		// while(l1_temp1.next != null)
	 		// {
	 		// 	if (cur.next.val > l2.val)
	 		// 	{
	 		// 		l1_temp = cur.next;
	 		// 		cur.next = l2;
	 		// 		break;
	 		// 	}
	 		// }

	 		// while (cur.next != null)
	 		// {
	 		// 	if (cur.next.val)
	 		// }
 		}
 	}
 }







