// Implement a function to check if a linked list is a palindrome

import java.util.Stack;

public class Problem7
{
	public static boolean isPalindrome(LinkedList list)
	{
		LinkedList fast = list;
		LinkedList slow = list;

		Stack <Integer> stk1 = new Stack <Integer> ();

		while (fast.next != null && fast.next.next != null)
		{
			stk1.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		stk1.push(slow.data);
 		// System.out.println("fast.data: " + fast.data);
 		// System.out.println("slow.data: " + slow.data);
 		// stk1.
		// if the length of the linked list is odd or even
		if (fast.next == null)
		{
			// the case of odd num, the mid number of the linked list shall be eliminated
			stk1.pop();
		}

		while (!stk1.empty())
		{
			slow = slow.next;
			if (stk1.pop() != slow.data)
			{
				return false;
			}
		}
		return true;
	}
}

