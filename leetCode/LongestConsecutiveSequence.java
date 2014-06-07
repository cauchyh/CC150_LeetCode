/*
	Given an unsorted array of integers, 
	find the length of the longest consecutive elements sequence.

	For example,
	Given [100, 4, 200, 1, 3, 2],
	The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

	Your algorithm should run in O(n) complexity.
*/

public class LongestConsecutiveSequence
{
	public int longestConsecutive(int[] num) 
    {
        Set<Integer> set = new HashSet<Integer>();
        for (int i:num) {
            set.add(i);
        }
        int maxLength = 0;
        int curMax = 1; // start from one
        int nextElement;
        for (int i=0; i<num.length; i++) {
            if (set.contains(num[i])) {
                // from the ascending order
                nextElement = num[i] + 1;
                while (set.contains(nextElement)) {
                    set.remove(nextElement);
                    curMax ++;
                    nextElement ++;
                }
                // from the reducing order
                nextElement = num[i] - 1;
                while (set.contains(nextElement)) {
                    set.remove(nextElement);
                    curMax ++;
                    nextElement --;
                }
                maxLength = Math.max(maxLength, curMax);
                curMax = 1;
            }
        }
        return maxLength;
    }
}