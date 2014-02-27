import java.util.*;
/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

public class TwoSum
{
	public static int[] twoSum(int[] numbers, int target) 
	{
		int[] res = new int[2];
		HashMap <Integer, Integer> map1 = new HashMap <Integer, Integer> ();
		for (int i=0; i<numbers.length; i++)
		{
			if (map1.containsKey(target - numbers[i]))
			{
				res[1] = i+1;
				res[0] = map1.get(target - numbers[i]) + 1;
				return res;
			}
			else
			{
				map1.put(numbers[i], i);
			}
		}
		return res;
		
		// for (int i=0; i<numbers.length; i++)
		// {
		// 	for (int j=i; j<numbers.length; ++j)
		// 	{
		// 		if (numbers[i] + numbers[j] == target)
		// 		{
		// 			res[0] = i+1;
		// 			res[1] = j+1;
		// 			return res;
		// 		}
		// 	}
		// }
		// return res;
    	// private elementExists(int[] num, int tar)    
    	// {
    	// 	for (int i=0; i<numbers.length; i++)
    	// 	{
    	// 		if (tar == num[i])
    	// 		{
    	// 			return (i+1)
    	// 		}
    	// 	}
    	// }
    }
}