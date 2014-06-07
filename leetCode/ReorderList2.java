/*
	Given a singly linked list L: L0→L1→…→Ln-1→Ln,
	reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

	You must do this in-place without altering the nodes' values.

	For example,
	Given {1,2,3,4}, reorder it to {1,4,2,3}.
*/

public class ReorderList2
{
	public static void reorderList(ListNode head) 
    {
        if (head == null || head.next == null) { return ;}
        ListNode pre = null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        pre.next = null; // need to cut from the middle
        ListNode rightHead = slow;
        // now start to reverse rightHead
        rightHead = reverseList(rightHead);
        ListNode cur = head;
        ListNode temp;
        while (cur.next != null) {
            temp = cur.next;
            cur.next = rightHead;
            rightHead = rightHead.next;
            cur.next.next = temp;
            cur = temp;
        }
        // There would be one more nodes left at rightHead
        cur.next = rightHead;
    }
    
    public static ListNode reverseList(ListNode head) 
    {
        ListNode head0 = new ListNode(0);
        head0.next = head;
        ListNode curNode = head;
        ListNode nextNode = head.next;
        head = head0;
        while (curNode != null && curNode.next != null) {
            curNode.next = nextNode.next;
            nextNode.next = head.next;
            head.next = nextNode;
            nextNode = curNode.next;
        }
        return head.next;
    }
}