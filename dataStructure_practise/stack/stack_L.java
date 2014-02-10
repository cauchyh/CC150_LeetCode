// Implementing the stack with a linked list way
// This way is easier to handle
// one of the advantages of implementing stack by linked list is that
// It is no need to consider about the size of the stack.
// assume in this problem, the stack can only store integer

public class stack_L
{
	public int data;
	public stack_L next;

	public stack_L() 
	{
		
	}

	public stack_L(int data_input)
	{
		data = data_input;
	}

	public void push(int data_input)
	{
		if (isEmpty()) // if the data push is the head
		{
			data = data_input;
		}
		else
		{
			stack_L temp = new stack_L();
			temp.data = this.data;
			temp.next = this.next;
			this.data = data_input;
			this.next = temp;
		}
	}

	public void display()
	{
		stack_L current = new stack_L();
		current = this;
		try
		{
			if (isEmpty())
			{
				throw new Exception();
			}
			else
			{
				while (current != null)
				{
					System.out.println(current.data); // rotating
					current = current.next;
				}
			}
		}

		catch (Exception e)
		{
			System.out.println("The stack is empty.");
		}
	}


	public int pop()
	{	
		if (isEmpty())
		{
			System.out.println("Pop fails. Stack is empty.");
			return 0;
		}
		else
		{
			return data;
		}
		// }
		// catch (Exception e)
		// {
		// 	System.out.println("Pop fail, stack is empty.");
		// }
	}

	public boolean isEmpty()
	{
		return (this == null);
	}
}