// Create a queue by implementing Linkedlist

class LinkedList
{
	int idata;
	LinkedList next;
	public LinkedList()
	{
		// next = null;
	}

	public LinkedList(int data)
	{
		idata = data;
	}
}

public class QueueL
{
	LinkedList head = new LinkedList();
	LinkedList tail = new LinkedList();

	public QueueL(int data)
	{
		LinkedList temp = new LinkedList(data);
		head.next = temp;
		tail.next = temp;
	}

	public boolean isEmpty()
	{
		return (head.next == null);
	}

	// linked list cannot be full

	public void push(int data)
	{
		if (isEmpty())
		{
			LinkedList temp = new LinkedList(data);
			head.next = temp;
			tail.next = temp;
		}
		else
		{
			LinkedList temp = new LinkedList(data);
			// temp = head.next;
			// head.next = temp;
			tail.next.next = temp;
			tail.next = temp;
		}
	}

	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Failed. Queue is empty.");
			return 0;
		}
		else
		{
			int res = head.next.idata;
			head.next = head.next.next;
			return res;
		}
	}

	public void display()
	{
		if (isEmpty())
		{
			System.out.println("Failed. Queue is empty.");
		}
		else
		{
			LinkedList current = new LinkedList();
			current.next = head.next;
			while (current.next != null)
			{
				System.out.println(current.next.idata);
				current.next = current.next.next;
			}
		}
	}
}







 




