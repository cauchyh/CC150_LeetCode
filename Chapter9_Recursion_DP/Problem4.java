/*
	Write a method to return all subsets of a set.
*/

public class Problem4
{
	public static ArrayList<ArrayList<Integer>> getAllSubsets(int[] set, int index)
	{
		ArrayList<ArrayList<Integer>> allSubsets;
		if (set.length == index)
		{
			allSubsets = new ArrayList<ArrayList<Integer>>(); // allocate new place
			allSubsets.add(new ArrayList<Integer>()); // add {}
		}
		else
		{
			allSubsets = subsets(set, index+1); 
			// allSubsets is actually allocated again and the values are passed to it
			int item = set[index];
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subsets : allSubsets)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.addAll(subsets); // add all the elements in subest into the list
				temp.add(item);
				moreSubsets.add(temp);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;

	}
}