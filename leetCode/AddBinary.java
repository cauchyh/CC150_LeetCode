/*
    Given two binary strings, return their sum (also a binary string).

    For example,
    a = "11"
    b = "1"
    Return "100".
*/



import java.util.*;
public class AddBinary
{
    public static String addBinary(String a, String b) 
    {
        int charLength = Math.max(a.length(), b.length());
        char[] aChar = new char[charLength];
        char[] bChar = new char[charLength];
        char[] resChar = new char[charLength];
        boolean carryUp = false;
        // initialize the value of the char array
        for (int i=0; i<charLength; i++)
        {
            if (i<a.length())
            {
                aChar[i] = a.charAt(a.length() - i - 1);
            }
            else
            {
                aChar[i] = 0;
            }
        }
        for (int i=0; i<charLength; i++)
        {
            if (i<b.length())
            {
                bChar[i] = b.charAt(b.length() - i -1);
            }
            else
            {
                bChar[i] = 0;
            }
        }

        for (int i=0; i<charLength; i++)
        {
            if (carryUp == true)
            {
                if (aChar[i] == '1' && bChar[i] == '1')
                {
                    resChar[i] = '1';
                    carryUp = true;
                }
                else if (aChar[i] == '1' || bChar[i] == '1')
                {
                    resChar[i] = '0';
                    carryUp = true;
                }
                else
                {
                    resChar[i] = '1';
                    carryUp = false;
                }
            }
            else // carryUp == false
            {
                if (aChar[i] == '1' && bChar[i] == '1')
                {
                    resChar[i] = '0';
                    carryUp = true;
                }
                else if (aChar[i] == '1' || bChar[i] == '1')
                {
                    resChar[i] = '1';
                    carryUp = false;
                }
                else
                {
                    resChar[i] = '0';
                    carryUp = false;
                }
            }
        }

        if (carryUp == false)
        {
            return charToString(resChar);
        }
        else
        {
            return ("1" + charToString(resChar));
        }

    }

    private static String charToString(char[] input)
    {
        String res = "";
        for (int i=0; i<input.length; i++)
        {
            res = res + input[input.length - i - 1];
        }
        return res;
    }
}