/* Write code to remove duplicates from an unsorted linked list
	FOLLOW UP
	How would you solve this problem if a temporary buffer is not allowed*/


import java.io.*;
import java.util.*;

public class Problem1
{
	public static void deleteDuplicate (LinkedList list)
	{
		Hashtable <Integer, Boolean> table = new Hashtable <Integer, Boolean> ();
		LinkedList current = list;
		table.put(current.data, true); /* the first element cannot be a duplicate
									    put it first into the hashtable */
		while (current.next != null)
		{
			if (table.containsKey(current.next.data))
			{
				current.next = current.next.next;
				// list = LinkedList.delete(list, current.data);
				// upper code may cause danling pointer
				// current = current.next;
				// return true;
				// System.out.print("exist ");
				// list.displayList();
			}
			else
			{
				table.put(current.next.data, true); // if not existing, put the key into the hash
				current = current.next;
				// System.out.print("not exist ");
				// list.displayList();

			}
		}
	}

	public static void deleteDuplicate2 (LinkedList list)
	{
		// in this case, temporary buffer is not allowed to use
		// thus a proper solution would be using two pointers to 
		// check and trace the process

		if (list == null)
		{
			return;
		}

		LinkedList current = new LinkedList();
		current = list;
		while (current != null)
		{
			LinkedList checker = current;
			while (checker.next != null)
			{
				if (checker.next.data == current.data)
				{
					checker.next = checker.next.next;
				}
				else
				{
					checker = checker.next;
				}
			}

			current = current.next;
		}

		// LinkedList current = new LinkedList(); // current node
		// LinkedList checker = new LinkedList(); // trace the following
		// LinkedList previous = new LinkedList(); // use to operate the delete operation


		// current = list;
		// while (current.next != null)
		// {
		// 	checker = current.next;
		// 	while (checker != null)
		// 	{
		// 		if (checker.data == current.data)
		// 		{
		// 			current.next = checker.next;
		// 		}
		// 		checker = checker.next;
		// 	}
		// 	current = current.next;
		// }


	}
}

















