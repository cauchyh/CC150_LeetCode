/*
	Given a string containing just the characters 
	'(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	The brackets must close in the correct order, "()" and "()[]{}" are all valid 
	but "(]" and "([)]" are not.
*/
import java.util.*;
public class ValidParentheses
{
	public static boolean isValid(String s) 
    {
        if (s.length() == 0)
        {
            return true;
        }
        Stack<Character> stack1 = new Stack<Character>();
        // Stack<Character> stack2 = new Stack<Character>();
        for (int i=0; i<s.length(); i++)
        {
            if (stack1.isEmpty())
            {
                stack1.push(s.charAt(i));
            }
            else if (isPair(stack1.peek(),s.charAt(i)))
            {
                stack1.pop();
            }
            else
            {
                stack1.push(s.charAt(i));
            }
        }
        // System.out.println(stack1);
        if (stack1.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    private static boolean isPair (char c1, char c2)
    {
        if ((c1=='(' && c2==')') || (c1=='{' && c2=='}') || (c1=='[' && c2==']'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}