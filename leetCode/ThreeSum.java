/*
	Given an array S of n integers, are there elements a, b, c in S 
	such that a + b + c = 0? Find all unique triplets 
	in the array which gives the sum of zero.

	Note:
	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
	The solution set must not contain duplicate triplets.
	    For example, given array S = {-1 0 1 2 -1 -4},

	    A solution set is:
	    (-1, 0, 1)
	    (-1, -1, 2)
*/

import java.util.*;
public class ThreeSum 
{
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) 
    {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        // set will reject duplicated result automatically 
        // then copy the result into an ArrayList at last
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        int firstEle, secondEle, thirdEle;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<num.length; i++) {
            // temp = new ArrayList<Integer>();
            firstEle = i;
            secondEle = i + 1;
            thirdEle = num.length - 1;
            while(secondEle < thirdEle) {
                int sum = num[firstEle] + num[secondEle] + num[thirdEle];
                if (sum == 0) {
                    temp.add(num[firstEle]);
                    temp.add(num[secondEle]);
                    temp.add(num[thirdEle]);
                    set.add(temp);
                    secondEle ++;
                    thirdEle --;
                    temp = new ArrayList<Integer>();
                } else if (sum < 0) {
                    secondEle ++;
                } else {
                    thirdEle --;
                }
            }
            // System.out.println(temp);
        }
        res.addAll(set);
        return res;
    }
}
