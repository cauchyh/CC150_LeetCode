/* Implement a methond to perform basic string compression using counts of repeated
	charactres. For examples, the string aabccccccaaa would become a2b1c5a3.
	If the "compressed" string would not become smaller than the original string,
	your string method should return the original string.*/

import java.lang.Math;

// public class Problem5
// {
// 	static public void main(String[] args)
// 	{
// 		String_Compress sc = new String_Compress();
// 		String str = "bbaaaaaccdd";
// 		int length = sc.CompressedLength(str);
// 		if (length >= str.length())
// 		{
// 			return 
// 		}
// 		System.out.println(length);
// 	}
// }

public class Problem5
{
	public String simpleCompress(String str)
	{
		if (CompressedLength(str) > str.length())
		{
			return str;
		}
		else
		{
			return compress2(str);
		}
		// String compressedStr = new String();
		// compressedStr = compress(str);
		// if (compressedStr.length() >= str.length())
		// {
		// 	return str;
		// }
		// else
		// {
		// 	return compressedStr;
		// }
	}

	public int CompressedLength(String str)
	{
		int length = 0;
		int count = 1; // There is a case of two digit problem
		char lastChar = str.charAt(0); // start with the first char
		for (int i=1; i<str.length();i++)  // to the first char of the string
		{
			// if the char read in the ith place is same as the last one
			// then the counter is added
			// otherwise, the length is added and it is necessary to set the count to 0
			if (str.charAt(i) == lastChar)
			{
				count++; // update the count
			}
			else // if the next char is not same as current
			{
				lastChar = str.charAt(i);
				count = 1;
				length += (int) Math.log10((double)count) + 2; // just assume the length is 2 digit here
			}
		}
		length += (int) Math.log10((double)count) + 2;
		return length;	
	}
	

	// update a new method based on the answer
	// private String compress_new(String str) 
	// {

	// }

	public String compress2(String str)
	{
		String res = "";
		int count = 1;
		char lastChar = str.charAt(0);
		for (int i=1; i<str.length(); i++)
		{
			if (str.charAt(i) == lastChar) // if char equals to current tracer
			{
				count ++;
			}
			else
			{
				res = res + lastChar + count;
				count = 1;
				lastChar = str.charAt(i);
			}
		}
		res = res + lastChar + count;
		return res;
	}

	private String compress(String str)
	{
		String res = "";
		int count = 1;
		for (int i=1; i<str.length(); i++)
		{
			if (str.charAt(i) == str.charAt(i-1))
			{
				count++;
				if (i == str.length()-1)
				{
					res = res + str.charAt(i) + count;
					return res;
				}
			}
			else
			{
				res = res + str.charAt(i-1) + count;
				count = 1;
			}
		}
		return res;
	}	
}






