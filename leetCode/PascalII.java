/*
	Given numRows, generate the first numRows of Pascal's triangle.

	For example, given numRows = 5,
	Return

	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
*/
import java.util.*;
public class PascalII
{
	public static ArrayList<ArrayList<Integer>> generate(int numRows) 
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<Integer> queue = new LinkedList<Integer> ();
        // queue.add(0);
        queue.add(1);
        queue.add(0);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<numRows; i++) {
        	System.out.println(queue);
            temp = new ArrayList<Integer>();
            for (int j=0; j<i+1; j++) {
                int tempInt = queue.remove() + queue.peek();
                temp.add(tempInt);
                queue.add(tempInt);
            }
            queue.add(0);
            res.add(temp);
        }
        return res;
    }
}