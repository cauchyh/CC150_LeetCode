/*
	In the classic problem of Tower of Hanoi, you have 3 towers and 
	N disks of different sizes which can slide onto any tower. The puzzle
	starts with disks sorted in ascending order of size from top to bottom
	(i.e. each disk sits on top of an even larger one). You have following 
	constraints.

	(1) Only one disk can be moved at time
	(2) A disk is slide off the top of one tower onto the next rod
	(3) A disk can only be placed on top of a large disk

	Write a program to move the disks from the first tower to the last using Stacks
*/



public class Problem5
{
	private Stack<Integer> disks;
	private int index;
	public Problem5(int i)
	{
		disks = new Stack<Integer>();
		index = i;
	}

	public int index()
	{
		return index;
	}

	public void add(int d)
	{
		if (!disks.isEmpty() && disks.peek() <=d)
		{
			System.out.println("error placing disk " + d);
		}
		else
		{
			disks.push(d);
		}
	}

	public void moveTopTo (Problem5 t)
	{
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk " + top + "from " + index()+ " to " + t.index());
	}

	public void moveDisk(int n, Problem5 destination, Problem5 buffer)
	{
		if (n > 0)
		{
			moveDisks(n-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}

}













