/* Implement a methond to perform basic string compression using counts of repeated
	charactres. For examples, the string aabccccccaaa would become a2b1c5a3.
	If the "compressed" string would not become smaller than the original string,
	your string method should return the original string.*/

public class Problem5
{
	public String simpleCompress(String str)
	{
		String compressedStr = new String();
		compressedStr = compress(str);
		if (compressedStr.length() >= str.length())
		{
			return str;
		}
		else
		{
			return compressedStr;
		}
	}
	
	private String compress(String str)
	{
		String res = "";
		int count = 1;
		for (int i=0; i<str.length()-1; i++)
		{
			if (str.charAt(i) == str.charAt(i+1))
			{
				count++;
				if (i == str.length()-1)
				{
					res = res + str.charAt(i) + count;
				}
			}
			else
			{
				res = res + str.charAt(i) + count;
				count = 1;
			}
		}
		return res;
	}	
}