/*
	A message containing letters from A-Z is being encoded to numbers using the following mapping:

	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	Given an encoded message containing digits, determine the total number of ways to decode it.

	For example,
	Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

	The number of ways decoding "12" is 2.
*/

public class DecodeWays 
{
	public static int numDecodings(String s) 
    {
        int[] buffer = new int[s.length()];
        buffer[0] = 1;
        char preChar = s.charAt(0);
        char curChar;
        for (int i=1; i<s.length(); i++) {
            curChar = s.charAt(i);
            if ('0' < preChar && preChar < '3' && '0' < curChar && curChar <= '9') {
                buffer[i] = buffer[i-1] + 1;
            } else if (curChar == '0') {
                buffer[i] = buffer[i-1] - 1;
            } else {
            	buffer[i] = buffer[i-1];
            }
            preChar = curChar;
            System.out.println("buffer[i]: " + buffer[i]);
        }
        return buffer[buffer.length-1];
    }
}
