/* Write a method to replace all spaces in a string with '%20'. You may assume 
   that the string has sufficient space at the end of the string to hold the 
   additional characters, and that you are given the "true" length of the string.
   Note: if implementing in Java, please use a character array so that you can 
   perform this operation in place.
   EXAMPLE: 
   Input: "Mr John Smith     "
   Output: "Mr%20John%20Smith"*/

   import java.util.*;

   public class Problem4
   {
   		public String replace(String str)
   		{
   			String res = "";
            for (int i=0; i<str.length(); i++)
            {
               if (str.charAt(i) == ' ')
               {
                  res = res + "%20";
               }
               else
               {
                  res = res + str.charAt(i);
               }
            }
   			return res;
   		}
   		// public char replaceSpace()
   		// {
   		// 	char temp = '\%20';
   		// 	return temp;
   		// }
   }