// Imgaine a stack of plates. If the stack gets too high, it might topple. Therefore, 
// in real life, we would likely start a new stack when the previous stack exceeds some
// threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should 
// be composed of several stacks and should create a new stack once the previous one exceed 
// capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single 
// stack (that is, pop() shuold return the same values as it would if there were just a single
// stack.)
// FOLLOW UP
// Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
import java.util.*;
public class Problem4
{
	public int capacity; // the capacity that is used to limit the size of each stack
	private int curSet; // current set of the arraylist
	private int curPos; // current position of the stack
	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>(10);

	public Problem4(int data)
	{
		// constructor
		stacks.add(new Stack<Integer>());
		capacity = data;
		curSet = 0; // always from the first set of stack
		curPos = 0;
	}

	// public 
	/* there should be a method to detect whether the stack is empty or not
	   it is not necessary to detect whether the stack is full or not since 
	   it is accomplished by an arraylist.
	*/

	public boolean isEmpty()
	{
		if (curSet == 0 && curPos == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Failed. Stack is empty.");
			return Integer.MAX_VALUE;
		}
		else
		{
			int res = stacks.get(curSet).pop();
			if (curPos == 0)
			{
				curSet--;
				curPos = capacity-1;
			}
			else
			{
				curPos--;
			}
			return res;
		}
	}

	public void push(int data)
	{	
		if (curPos == capacity-1)
		{
			stacks.add(new Stack<Integer>());
			curSet++; // create a new stack
			curPos = 0; // start from the bottom
			stacks.get(curSet).push(data);
		}
		else
		{
			stacks.get(curSet).push(data);
			curPos ++;
		}
		// stacks.get(curSet)
	}

	public int popAt(int index)
	{
		if (index > curSet)
		{
			return Integer.MAX_VALUE;
			System.out.println("Failed. Stack does not exists");
		}
		else
		{
			stacks.get(index).pop();
		}
	}

	public int getSet() 
	{
		return curSet;
	}

	public int getPos()
	{
		return curPos;
	}
}


	




