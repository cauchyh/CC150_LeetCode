// Build a stack with Linked List

class LinkedList
{
	public char data;
	public LinkedList next;

	public LinkedList(char data_input)
	{
		data = data_input;
		next = null;
	}

	public LinkedList()
	{
		next = null;
		// do nothing, just allow such form
	}

}

public class stackL
{
	public LinkedList head = new LinkedList();

	public stackL(char data_input)
	{
		LinkedList temp = new LinkedList(data_input);
		head.next = temp;
	}

	public stackL()
	{
		// do nothing
	}

	public boolean isEmpty()
	{
		return (head.next == null);
	}

	public void push(char data_input)
	{
		// No need to check the existing of space since no max size is required 
		// by the application of linkedlist stack
		LinkedList temp = new LinkedList(data_input);
		temp.next = head.next;
		head.next = temp;	
	}

	public char pop()
	{
		if (isEmpty())
		{
			System.out.println("Failed. Stack is empty.");
			return 'z';
		}
		else
		{
			char data_output = head.next.data;
			head.next = head.next.next;
			return data_output;
		}
	}

	public void display()
	{
		LinkedList current = new LinkedList();
		current = head; // from the start
		if (head.next == null)
		{
			System.out.println("Failed. Stack is empty.");
			return;
		}
		else
		{
			while (current.next != null)
			{
				System.out.println(current.next.data);
				current = current.next;
			}
		}
	}
}















