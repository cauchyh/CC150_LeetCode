/*
	Given a string, find the length of the longest substring without repeating characters. 
	For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
	which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/
import java.util.*;
public class LongestNoRepeatSubstring 
{
	public static int lengthOfLongestSubstring(String s) 
    {
        if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int maxLength = 0;
        int curMaxLength = 0;
        for (int i=0; i<s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.clear();
                curMaxLength = 0;
            } else {
                set.add(s.charAt(i));
                curMaxLength ++;
                maxLength = curMaxLength > maxLength ? curMaxLength : maxLength;
            }
        }
        return maxLength;
    }
}