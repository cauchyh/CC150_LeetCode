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
        Stack<String> stack = new Stack<String> ();
        String res = "";
        int wordStart = 0;
        int wordEnd = 0;
        boolean trackStart = true;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) != ' ' && trackStart == true)
            {
                wordStart = i;
                wordEnd = i+1;
                trackStart = false;
            }
            if (s.charAt(i) == ' ' && trackStart == false)
            {
                wordEnd = i;
                stack.push(s.substring(wordStart,wordEnd));
                wordStart = i+1;
                trackStart = true;
            }
        }
        if (trackStart == false && s.charAt(s.length()-1) != ' ')
        {
            wordEnd = s.length();
            stack.push(s.substring(wordStart,wordEnd));
        }
        while (!stack.isEmpty())
        {
            res = res + stack.pop();
            if (!stack.empty())
            {
                res = res + " ";
            }
        }
        return res;
    }
}