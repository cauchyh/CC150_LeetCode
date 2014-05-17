/*
	A linked list is given such that each node contains an additional 
	random pointer which could point to any node in the list or null.

	Return a deep copy of the list.
*/

// class RandomListNode {
//     int label;
//     RandomListNode next, random;
//     RandomListNode(int x) { this.label = x; }
// };

public class CopyListWithRanPointer
{
	public static RandomListNode copyRandomList(RandomListNode head) 
    {
        if (head == null) {
            return null;
        }
        RandomListNode nodeClone;
        RandomListNode cur = head;
        while (cur != null) {
            nodeClone = new RandomListNode(cur.label);
            nodeClone.next = cur.next;
            cur.next = nodeClone;
            cur = cur.next.next;
        }
        cur = head;
        RandomListNode head0 = new RandomListNode(0);
        RandomListNode cur0 = head0;
        while (cur != null) {
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            cur0.next = cur.next;
            cur.next = cur.next.next;
            cur0 = cur0.next;
            cur = cur.next;
        }
        return head0.next; 
    }
}