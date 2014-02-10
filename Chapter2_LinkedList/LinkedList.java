/* This problem is designed to create a simple singly Linked list, so as to further practise
	all the problems that are listed in the book*/

public class LinkedList
{
	public int data;
	public LinkedList next = null;

	public LinkedList()
	{

	}

	public LinkedList(int datainput)
	{
		data = datainput;
	}

	public void append(int d)
	{
		LinkedList end = new LinkedList(d);
		LinkedList n = this;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}


	public void displayList()
	{
		LinkedList n = this;
		while (n != null)
		{
			System.out.print(n.data);
			// print "->" if it is not the final element
			if (n.next != null)
			{
				System.out.print(" -> ");
			}
			n = n.next;
		}
		System.out.println();
	}

	public static LinkedList delete(LinkedList link, int d)
	{
		// check the first element first
		if (link.data == d)
		{
			return link.next;
		}
		LinkedList current = link;
		while (current.next != null)
		{
			if (current.next.data == d)
			{
				current.next = current.next.next;
				return link;
			}
			current = current.next;
		}
		return link;
	}
}	





