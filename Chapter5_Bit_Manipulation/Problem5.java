/*
	Write a function to determine the number of bits required to convert integer A to 
	integer B.
*/

import java.util.*;
public class Problem5
{
	public static int bitConvertNum(int a, int b)
	{
		int count = 0;
		int c = a ^ b;
		while ( c != 0)
		{
			if ((c & 1) == 1)
			{
				count++;
			}
			c >>= 1;
		}
		return count;
	}
}