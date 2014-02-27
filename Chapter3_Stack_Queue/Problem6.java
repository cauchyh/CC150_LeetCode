/*Implement a MyQueue class which implements a queue using two stacks*/

import java.util.*;

public class Problem6
{
	Stack <Integer> stackNew, stackOld;

	public Problem6()
	{
		stackNew = new Stack <Integer> ();
		stackOld = new Stack <Integer> ();

	}


	public void add(int data)
	{
		stackNew.push(data);
	}


	public void shiftStacks()
	{
		if (stackOld.isEmpty())
		{
			while (!stackNew.isEmpty())
			{
				stackOld.push(stackNew.pop());
			}
		}
	}

	public int peek()
	{
		shiftStacks();
		return stackOld.peek();
	}

	public int remove()
	{
		// pop of stack
		shiftStacks();
		return stackOld.pop();
	}

	public boolean isEmpty()
	{
		if (stackNew.isEmpty() && stackOld.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	// public int push(int data)
	// {
	// 	shiftStacks();
	// 	return stackOld.push(data);
	// }
}