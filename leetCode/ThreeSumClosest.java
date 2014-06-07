/*
	Given an array S of n integers, find three integers in S 
	such that the sum is closest to a given number, target. 
	Return the sum of the three integers. 
	You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
import java.util.*;
public class ThreeSumClosest
{
	public static int threeSumClosest(int[] num, int target) 
    {
        Arrays.sort(num);
        int firstEle, secondEle, thirdEle;
        int curSum;
        int min = Integer.MAX_VALUE/2;
        for (int i=0; i<num.length; i++) {
            firstEle = i;
            secondEle = i+1;
            thirdEle = num.length-1;
            while (secondEle < thirdEle) {
                curSum = num[firstEle] + num[secondEle] + num[thirdEle];
                System.out.println("Math.abs(min - target): " + Math.abs(min - target));
                System.out.println("curSum: " + curSum);
                if (curSum == target) {
                    return target;
                } else if (Math.abs(curSum - target) < Math.abs(min - target)) {
                    min = curSum;
                    // secondEle ++;
                } 
                if ()
            }
        }
        return min;
    }
}