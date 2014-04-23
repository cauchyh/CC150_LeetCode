/*
	Given a roman numeral, convert it to an integer.

	Input is guaranteed to be within the range from 1 to 3999.
*/

public class RomanToInteger
{
	public static int romanToInt(String s) 
    {
        if (s.length() == 1)
        {
            return toInteger(s.charAt(0));
        }
        int total = 0;
        // int nextChar = 1;
        for (int i=0; i<s.length()-1; i++)
        {
            char curChar = s.charAt(i);
            char nextChar = s.charAt(i+1);
            if (isMinus(curChar, nextChar))
            {
                total -= toInteger(curChar);
            }
            else
            {
                total += toInteger(curChar);
            }
        }
        // final element is processed here
        total += toInteger(s.charAt(s.length()-1));
        return total;
        
    }
    
    private static int toInteger(char a)
    {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        else return 0;
    }
    
    private static boolean isMinus(char a, char b)
    {
        if (a == 'I' && (b == 'V' || b == 'X')) return true;
        // if (a == 'V' && b == 'X') return true;
        if (a == 'X' && (b == 'L' || b == 'C')) return true;
        // if (a == 'L' && b == 'C') return true;
        if (a == 'C' && (b == 'D' || b == 'M')) return true;
        // if (a == 'D' && b == 'M') return true;
        else return false;
    }
}