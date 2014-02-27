/*
Write a program to sort a stack in ascending order (with biggest items on top).
You may use at most one additional stack to hold items, but you may not copy the
elements into any other data structure such as array. The stack suuports the 
following operations: push, pop, peek, and isEmpty.
*/

import java.util.*;

public class Problem7
{
	public static Stack<Integer> sortStack(Stack<Integer> src)	
	{
		Stack<Integer> res = new Stack <Integer>();
		int counter;
		while (!src.isEmpty())
		{
			counter = 0;
			// pop out the value first
			int temp = src.pop();
			if (res.isEmpty())
			{
				res.push(temp);
			}
			else
			{
				while (!res.isEmpty() && temp < res.peek())
				{
					src.push(res.pop());
					counter++;
				}
				// scr.push()
				res.push(temp);
				for (int i=0; i<counter; i++)
				{
					res.push(src.pop());
				}
			}
		}
		return res;
	}
}

