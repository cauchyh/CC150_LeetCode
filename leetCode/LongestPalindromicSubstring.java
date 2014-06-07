/*
	Given a string S, find the longest palindromic substring in S. 
	You may assume that the maximum length of S is 1000, 
	and there exists one unique longest palindromic substring.
*/


public class LongestPalindromicSubstring
{
	public static String longestPalindrome(String s) {
        if (s.length() == 0) { return ""; }
        if (s.length() == 1) { return s; }
        boolean[][] buffer = new boolean[s.length()][s.length()];
        // Initial the value, 
        // only single element is guranteed to be true
        for (int i=0; i<buffer.length; i++) {
           for (int j=0; j<buffer.length; j++) {
               buffer[i][j] = i>=j ? true : false;
           }
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int maxLength = 1;
        int curLength;
        for (int i=0; i<buffer.length; i++) {
            for (int j=i+1; j<buffer.length; j++) {
                curLength = j-i+1;
                if (s.charAt(i) == s.charAt(j)) {
                    buffer[i][j] = buffer[i+1][j-1];
                    if (curLength > maxLength) {
                        maxLength = curLength;
                        leftIndex = i;
                        rightIndex = j;
                    }
                } else {
                    buffer[i][j] = false
                }
            }
        }
        return s.substring(leftIndex, rightIndex);
    }
}