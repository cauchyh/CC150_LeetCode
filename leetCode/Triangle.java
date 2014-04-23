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
public class Triangle
{
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle)
	{
		// hmmm, dynamic programming~
        // down to up solution
        if (triangle.size() == 1)
        {
            return triangle.get(0).get(0);
        }
        ArrayList<ArrayList<Integer>> sumList = new ArrayList<ArrayList<Integer>> ();
        sumList.add(triangle.get(triangle.size()-1));
        ArrayList<Integer> trackerTGL = new ArrayList<Integer> ();
        ArrayList<Integer> trackerSum = new ArrayList<Integer> ();
        for (int i=0; i<triangle.size()-1; i++)
        {
            trackerTGL = triangle.get(triangle.size()-i-2); 
            trackerSum= sumList.get(i); 
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j=0; j<trackerSum.size()-1; j++) // get the max value of each bottom line
            {
                temp.add(Math.min(trackerSum.get(j), trackerSum.get(j+1)) + trackerTGL.get(j));
            }
            sumList.add(temp);

            // System.out.println("temp:" + temp);

        }
        // System.out.println(sumList);
        return sumList.get(sumList.size()-1).get(0);
	}
}