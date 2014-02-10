/* Write code to partition a linked list around a value x, such that all nodes less than x 
	come before all nodes greater than or equal to x*/

public class Problem4
{
	public static LinkedList partition1(LinkedList lk, int x)
	{
		// The first immediate solution would be create two linked list
		// update them as the problem requires and merge them finally.
		// This solution seems naive, but it is easy! Do this first
		LinkedList big = new LinkedList();
		LinkedList small = new LinkedList();

		while (lk.next != null)
		{
			if (lk.data > x)
			{
				big.append(lk.data);	
			}
			lk = lk.next;
		}
	}
}