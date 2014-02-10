/* Build and practise a stack which operate the puch and pop*/

import java.io.*;

public class stackX
{
	// parameters
	private int maxSize;
	private long[] stackArray;
	private int top; // pointer trace the top of the stack
	public stackX(int s) 
	{	
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1; // top not available
	}


	public long pop()
	{
		try
		{
			if (isEmpty()) // need to check whether the stack is empty or not
			{			   // if so, then 
				throw new Exception();
			}
			else
			{
				top--;
				return stackArray[top];	
			}
		}	
		catch (Exception e)
		{	
			System.out.println("Stack is empty!");
			return 0;
		}
	}

	public void push(long data)
	{
		try
		{
			// it is also necessary to check whether the stack is full or not
			if (isFull())
			{
				throw new Exception("Cannot push, stack is full!");
			}
			else
			{
				top++;
				stackArray[top] = data;
			}
		}
		catch(Exception e)
		{
			// simply do nothing
		}
	}

	public void displayStack()
	{
		try
		{
			if (isEmpty())
			{
				throw new Exception("Cannot display, the stack is empty.");
			}
			else
			{
				int first_print = 1;
				for (int i=top; i>=0; i--)
				{
					System.out.print(stackArray[i] + " ");
					if (first_print == 1)
					{
						System.out.println("<== top");
						first_print = 0;
					}
					else
					{
						System.out.println();
					}
				}
				// System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println("The stack is empty.");// do nothing
		}
	}





	public boolean isFull()
	{
		return (top == (maxSize -1));
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}
}






