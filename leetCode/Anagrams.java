/*
	Given an array of strings, return all groups of strings that are anagrams.

	Note: All inputs will be in lower-case.
*/

import java.util.*;

public class Anagrams
{
	public static ArrayList<String> getAnagrams(String str)
	{
		// put all the possible combinations into an arraylist.
		ArrayList<String> res = new ArrayList<String>();
		char[] arrChar = str.toCharArray();
		int newSize = arrChar.length;
		doAnagrams(newSize, res, arrChar);
		return res;
	}

	private static void doAnagrams(int newSize, ArrayList<String> res, char[] arrChar)
	{
		if (newSize == 1)
		{
			return;
		}
		for (int i=0; i<newSize; i++)
		{
			doAnagrams(newSize - 1, res, arrChar);
			if (newSize == 2)
			{
				res.add(new String(arrChar));
			}
			rotate(arrChar, newSize);
		}
	}

	public static void rotate(char[] arrChar, int newSize)
	{
		int arrLength = arrChar.length;
		int position = arrLength - newSize;
		char temp = arrChar[position];
		for (int i=position; i<arrLength-1; i++)
		{
			arrChar[i] = arrChar[i+1];
		}
		arrChar[arrLength-1] = temp;
		// System.out.println(arrChar);
	}
}