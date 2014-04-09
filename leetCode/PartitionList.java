/*
	
*/

public class PartitionList
{
	public static ListNode partition(ListNode head, int x) 
    {
        if (head == null)
        {
            return null;
        }
        ListNode cur = head; // current position of the linked list
        ListNode small = null;
        ListNode big = null;
        ListNode smallCur = null;
        ListNode bigCur = null;
        
        while (cur != null)
        {
            if (cur.val < x && small == null)
            {
                small = cur;
                smallCur = small;
                cur = cur.next;
                smallCur.next = null;
            }
            else if (cur.val >= x && big == null)
            {
                big = cur;
                bigCur = big;
                cur = cur.next;
                bigCur.next = null;
            }
            else if (cur.val < x)
            {
                smallCur.next = cur;
                smallCur = smallCur.next;
                cur = cur.next;
                smallCur.next = null;
            }
            else if (cur.val >= x)
            {
                bigCur.next = cur;
                bigCur = bigCur.next;
                cur = cur.next;
                bigCur.next = null;
            }
            //cur = cur.next;
        }
        if (small == null)
        {
            return big;
        }
        else if (big == null)
        {
            return small;
        }
        else
        {
            smallCur.next = big;
            return small;
        }        
    }
}