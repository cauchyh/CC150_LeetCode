/*
	Alternative solution to cc150 Chapter 9, Problem 4
	Write a method to reture all subsets of a string
*/
import java.util.*;
public class Problem4_1
{
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set)
	{
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size(); // loop time is 2^n;
		for (int i=0; i<max; i++)
		{
			ArrayList<Integer> subset = convertIntToSet(i, set);
			allSubsets.add(subset);
		}
		return allSubsets;
	}

	public static ArrayList<Integer> convertIntToSet(int i, ArrayList<Integer> set)
	{
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index = 0;
		for (int k=i; k>0; k >>=1) // this is so important to count the total time of loop
		{
			if ((k & 1) == 1)
			{
				subset.add(set.get(index));
			}
			// index indicating different number
			// each digit representing a number 
			index++; 
		}
		return subset;
	}
}