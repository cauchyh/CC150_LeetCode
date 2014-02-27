// How would you design a stack which, in addition to push and pop, also has a function 
// min which returns the minimum value. Operate in O(1) time.

// The first step is to define a new class that contain a new class which is used to store
// the min. value

class NodewithMin
{
	public int data;
	public int min_data;
	public NodewithMin(int value, int min)
	{
		data = value;
		min_data = min;
	}
}
/** 
 * The most obvious solution is to create another variable to trace the min value of each
 * different states
 */

public class Problem2 extends Stack<NodewithMin>
{
	public void push(int value)
	{
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min()
	{
		if (this.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return peek().min;
		}
	}





}