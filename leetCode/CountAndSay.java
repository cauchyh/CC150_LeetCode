/*
	The count-and-say sequence is the sequence of integers beginning as follows:
	1, 11, 21, 1211, 111221, ...

	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.
	Given an integer n, generate the nth sequence.

	Note: The sequence of integers will be represented as a string.
*/
public class CountAndSay
{
	public static String countAndSay(int n) 
    {
        String input = "1";
        for (int i=1; i<n; i++)
        {
            input = exchange(input);
            // System.out.println(input);
        }
        return input;
    }
    
    private static String exchange(String input)
    {
    	String res = "";
        int curCharCounter = 1; // start from one since there would at least be one
        char curChar = input.charAt(0); // the first one first:D
        for (int i=1; i<input.length(); i++)
        {
            if (input.charAt(i) == curChar)
            {
                curCharCounter ++;
            }
            else // input.charAt(i) != curChar;
            {
                res += Integer.toString(curCharCounter);
                res += curChar;
                curChar = input.charAt(i);
                curCharCounter = 1;
            }
        }
        res += Integer.toString(curCharCounter);
        res += curChar;
        return res;
    }
}