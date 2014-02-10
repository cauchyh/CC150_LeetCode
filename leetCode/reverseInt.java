/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321*/

public class reverseInt
{
	public static int reverse(int x)
	{
		int checker = 0;
		if (x<0)
		{
			x = x * (-1);
			checker = 1;
		}
		String in_str = Integer.toString(x);
		String output = "";
		for (int i=0; i<in_str.length(); i++)
		{
			output += in_str.charAt(in_str.length()-i-1); // this would be the most common case
		}
		int out_int = Integer.parseInt(output);
		if (checker == 1)
		{
			return out_int*(-1);
		}
		else
		{
			return out_int;
		}
	}
}