/*
	Given an index k, return the kth row of the Pascal's triangle.

	For example, given k = 3,
	Return [1,3,3,1].

	Note:
	Could you optimize your algorithm to use only O(k) extra space?
*/
import java.util.*;
public class PascalTriangleII
{
	public static ArrayList<Integer> getRow(int rowIndex) 
    {
        if (rowIndex == 0)
        {
            ArrayList<Integer> one = new ArrayList<Integer>();
            one.add(1);
            return one;
        }
        ArrayList<Integer> res = new ArrayList<Integer> ();
        int curLevel = 1;
        Queue<Integer> queue = new LinkedList<Integer> ();
        queue.add(1);
        queue.add(1);
        while (curLevel < rowIndex)
        {
            for (int i=0; i<curLevel; i++)
            {
                queue.add(queue.remove() + queue.peek());
            }
            queue.add(1);
            curLevel++;
        }
        while (!queue.isEmpty())
        {
            res.add(queue.remove());
        }
        
        return res;
    }
}