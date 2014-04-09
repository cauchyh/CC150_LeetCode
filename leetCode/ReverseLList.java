/*
	Reverse a linked list from position m to n. Do it in-place and in one-pass.

	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,

	return 1->4->3->2->5->NULL.

	Note:
	Given m, n satisfy the following condition:
	1 ≤ m ≤ n ≤ length of list.
*/

public class ReverseLList
{
	public static ListNode reverseBetween(ListNode head, int m, int n) 
    {
        if (head == null)
        {
            return null;
        }
        ListNode curM = head;
        ListNode curN = head;
        for (int i=1; i<n; i++)
        {
            if (i == m)
            {
                curM = curN;
            }
            curN = curN.next;
        }
        if (i == m)
        {
            curM = curN;
        }
        int temp = curM.val;
        curM.val = curN.val;
        curN.val = temp;
        return head;
    }
}