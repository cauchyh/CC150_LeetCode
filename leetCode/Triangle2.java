/*
	Given a triangle, find the minimum path sum from top to bottom. 
	Each step you may move to adjacent numbers on the row below.

	For example, given the following triangle
	[
	     [2],
	    [3,4],
	   [6,5,7],
	  [4,1,8,3]
	]
	The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

	Note:
	Bonus point if you are able to do this using only O(n) extra space, 
	where n is the total number of rows in the triangle.
*/
import java.util.*;
public class Triangle2
{
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) 
    {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.addAll(triangle.get(triangle.size()-1));
        for (int i=triangle.size()-1; i>0; i--) {
            for (int j=0; j<triangle.get(i).size()-1; j++) {
            	// System.out.println(queue);
            	System.out.println("i= " + i);
            	System.out.println(triangle.get(i-1));
                int temp = Math.min(queue.remove(), queue.peek()) + triangle.get(i-1).get(j);
                queue.add(temp);
            }
            queue.remove();
        }
        return queue.peek();
    }
}