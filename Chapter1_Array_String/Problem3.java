/* Given two strings, write a method to decide if one is a permutation of the other */
import java.util.*;
public class Problem3
{
	// the first method is to sort the two string and then compare
	public boolean isPermutation(String str1, String str2)
	{
		String str1_sorted = sortString(str1);
		String str2_sorted = sortString(str2);
		if (str1_sorted.equals(str2_sorted))
		{
			return true;
		}		
		else
		{
			return false;
		}
	}

	private String sortString (String str)
	{
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		String sorted = new String(temp);
		return sorted;
	}
}