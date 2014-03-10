/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

*/
import java.util.*;
public class ReverseWords
{
	public static String reverseWords(String s) 
    {
    	if (s.length() == 0)
        {
            return "";
        }
        String res = "";
        Stack<String> stack = new Stack<String>();
        int start = 0;
        int end = 0;
        while(s.charAt(start) == ' ')
        {
        	if (start == s.length()-1)
        	{
        		return "";
        	}
        	start++; // find the start position to exclude space

        }
        // end = start;

        while (true)
        {
        	while (s.charAt(start) == ' ')
        	{
        		start++;
        		if (start >= s.length()-1)
        		{
        			break;
        		}
        	}
        	// if (start == s.length() - 1)
        	// {
        	// 	break;
        	// }
        	end = start;
        	// System.out.println(end);
        	while(s.charAt(end) != ' ')
        	{
        		// System.out.println("inside loop");
        		
        		if (end >= s.length()-1)
        		{
        			break;
        		}
        		end++;
        	}
        	// System.out.println(start);
        	// System.out.println(end);
        	stack.push(s.substring(start,end));
        	if (end == s.length()-1)
        	{
        		break;
        	}
        	start = end;

        }
        System.out.println(stack);

        // display method
        int stackSize = stack.size();
        for (int i=0; i<stackSize; i++)
        {
        	if (i == stackSize - 1)
        	{
        		res = res + stack.pop();
        	}
        	else
        	{
        		res = res + stack.pop() + " ";
        	}
        }
        return res;
    }
}