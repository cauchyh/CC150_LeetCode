/*
	Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/
import java.util.*;
public class ReversePolish
{
	public static int evalRPN(String[] tokens) 
    {
        Stack <Integer> res = new Stack<Integer>(); // use to store the results
        for (int i=0; i<tokens.length; i++)
        {
            if (tokens[i].equals("+"))
            {
                int temp = plus(res.pop(),res.pop());
                res.push(temp);
            }
            else if (tokens[i].equals("-"))
            {
                int temp = minus(res.pop(),res.pop());
                res.push(temp);
            }
            else if (tokens[i].equals("*"))
            {
                int temp = multiple(res.pop(),res.pop());
                res.push(temp);
            }
            else if (tokens[i].equals("/"))
            {
                int temp = divide(res.pop(),res.pop());
                res.push(temp);
            }
            else
            {
                res.push(Integer.parseInt(tokens[i]));
            }
        }
        return res.peek();
    }
    
    private static int plus(int r1, int r2)
    {
        return r1 + r2;
    }
    
    private static int minus(int r1, int r2)
    {
        return r2 - r1;
    }
    
    private static int divide(int r1, int r2)
    {
        return r2 / r1;
    }
    
    private static int multiple(int r1, int r2)
    {
        return r1 * r2;
    }
}