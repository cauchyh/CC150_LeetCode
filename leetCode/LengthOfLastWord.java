/*
	Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
	return the length of last word in the string.

	If the last word does not exist, return 0.

	Note: A word is defined as a character sequence consists of non-space characters only.

	For example, 
	Given s = "Hello World",
	return 5.
*/

public class LengthOfLastWord
{
	public static int lengthOfLastWord(String s)
	{
		if (s.equals(""))
        {
            return 0;
        }
        int start = -1; // "-1" indicates last word not found
        int curEnd = s.length()-1;
        int end = -1; // in case there is no space in the first word
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(curEnd) != ' ' && start == -1)
            {
                start = curEnd;
            }
            
            else if (s.charAt(curEnd) == ' ' && start != -1)
            {
                end = curEnd;
                break;
            }
            
            curEnd--;
        }
        //for (int i=0; i<start; i++)
        // {
            
        // }
        System.out.println(start);
        System.out.println(end);
        if (start == -1)
        {
            return 0;
        }
        else
        {
            return (start - end);
        }
	}
}