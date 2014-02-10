import java.io.*;
import java.util.*;

/* Implement an algorithm to determine if a string has all unique characters.
    What if you cannot use additional data structures?*/
   
// The solution is based on the fact that an ASC II has a total of 256 differenct characters.
// Therefore, the problem is to find if all the characters in the     
public class Problem1
{
	public boolean allUniqueChar (String strInput)
	{
		boolean[] check = new boolean[256]; // the default values are false
		if (strInput.length() > 256) 
		{
			return false;
		}
    	else
    	{
    		for (int i=0; i<strInput.length(); i++)
    		{
    			int val = strInput.charAt(i);
 				if (check[val] == true)
 				{
 					return false;
 				}
 				else
 				{
 					check[val] = true;
 				}
    		}
    	}
    	return true;
    }
}