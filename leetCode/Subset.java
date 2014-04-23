/*
	Given a set of distinct integers, S, return all possible subsets.

	Note:
	Elements in a subset must be in non-descending order.
	The solution set must not contain duplicate subsets.
	For example,
	If S = [1,2,3], a solution is:

	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
*/
import java.util.*;
public class Subset
{
	public static ArrayList<ArrayList<Integer>> subsets(int[] array)
	{
		// ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(array);
		return subsets(array, array.length-1);
	}

	// it is probably not a good idea to pass the fianl result into the new function
	// otherwise it would be very difficult to 
	private static ArrayList<ArrayList<Integer>> subsets(int[] array, int index)
	{
		ArrayList<ArrayList<Integer>> allSubsets;
		if (index == -1)
		{
			// return new ArrayList<ArrayList<Integer>>();
			allSubsets = new ArrayList<ArrayList<Integer>>(); // allocate new place
			allSubsets.add(new ArrayList<Integer>()); // add {}
			return allSubsets;

		}
		else
		{
			int element = array[index];
			allSubsets = subsets(array, index-1);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subset : allSubsets)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.addAll(subset); // java is call by reference
				temp.add(element);
				moreSubsets.add(temp);
			}
			allSubsets.addAll(moreSubsets);
			return allSubsets;

		}
	}
}