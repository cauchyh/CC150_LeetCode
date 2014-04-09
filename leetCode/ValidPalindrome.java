/*
	Given a string, determine if it is a palindrome, 
	considering only alphanumeric characters and ignoring cases.

	For example,
	"A man, a plan, a canal: Panama" is a palindrome.
	"race a car" is not a palindrome.

	Note:
	Have you consider that the string might be empty? 
	This is a good question to ask during an interview.

	For the purpose of this problem, we define empty string as valid palindrome.
*/
import java.util.*;
public class ValidPalindrome
{
	public static boolean isPalindrome(String s) 
    {
        if (s.equals(""))
        {
            return true;
        }
        Stack<Character> stack1 = new Stack<Character> ();
        Stack<Character> stack2 = new Stack<Character> ();
        boolean isOdd;
        for (int i=0; i<s.length(); i++)
        {
            if (isAlphanumeric(s.charAt(i)))
            {
                stack1.push(toLowerCase(s.charAt(i)));
            }
        }
        if (stack1.size()%2 == 1) // decide whether to pop the extra element in stack1
        {
            isOdd = true;
        }
        else
        {
            isOdd = false;
        }
        int length = stack1.size();
        // move half of the stack into stack2 for future compare
        for (int i=0; i<length/2; i++)
        {
            stack2.push(stack1.pop());
        }
        if (isOdd)
        {
            stack1.pop();
        }
        while (!stack1.isEmpty())
        {
            if (stack1.pop() != stack2.pop())
            {
                return false;
            }
        }
        return true;
        
    }
    private static char toLowerCase(char c)
    {
        if (c - 'A'>= 0 && c - 'A' <= 26)
        {
        	char res = (char) (c + ('a'-'A'));
            return res; // a is ahead of A in ASCII table
        }
        else
        {
            return c;
        }
    }
    private static boolean isAlphanumeric(char c)
    {
        if ((c - 'A'>= 0 && c - 'A' <= 26) || (c - 'a'>= 0 && c - 'a' <= 26) || (c >= 48 && c <= 57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}