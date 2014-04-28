/*
	Given n pairs of parentheses, write a function to generate 
	all combinations of well-formed parentheses.

	For example, given n = 3, a solution set is:

	"((()))", "(()())", "(())()", "()(())", "()()()"
*/
import java.util.*;
public class GenerateParentheses
{
	public static ArrayList<String> generateParenthesis(int n) 
	{
		Set<String> set = new HashSet<String>(); // try to remove the duplicates
		ArrayList<String> res = new ArrayList<String>(); // store the final result
		if (n == 0)
		{
			res.add("");
		}
		else
		{
			ArrayList<String> temp = generateParenthesis(n-1);
			for (String str : temp)
			{
				for (int i=0; i<str.length(); i++)
				{
					if (str.charAt(i) == '(')		
					{
						String s = insertInside(str, i);
						if (!set.contains(s))
						{
							set.add(s);
							res.add(s);
						}
					}
				}
				if (!set.contains("()" + str))
				{
					set.add("()" + str);
					res.add("()" + str);
				}
			}
		}
		return res;
	}

	public static String insertInside(String str, int i)
	{
		/*
		 *	Get the two substrings and insert "()" into the string
		 */
		String sub1 = str.substring(0, i+1);
		String sub2 = str.substring(i+1, str.length());
		String res = sub1 + "()" + sub2;
		return res;
	}
}












