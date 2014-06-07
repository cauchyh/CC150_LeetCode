/*
	A test on reverse a linked list
*/

public class ReverseLinkedList
{
	public static ListNode reverseLinkedList(ListNode head) 
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
            // cur = head.next;
        }
        return head.next;
	}
}