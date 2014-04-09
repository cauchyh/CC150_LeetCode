/*
	Given a collection of numbers, return all possible permutations.

	For example,
	[1,2,3] have the following permutations:
	[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/
import java.util.*;
public class Permutations
{
	public static ArrayList<ArrayList<Integer>> permute(int[] num) 
    {
        int newSize = num.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (num.length == 1)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(num[0]);
            res.add(temp);
            return res;
        }
        permuteRec(num, newSize, res);
        return res;     
    }
    
    public static void permuteRec(int[] num, int newSize, ArrayList<ArrayList<Integer>> res)
    {
        if (newSize == 1)
        {
            return;
        }
        for (int i=0; i<newSize; i++)
        {
            permuteRec(num, newSize-1, res);
            if (newSize == 2)
            {
                addToRes(res, num);
            }
            rotate(num, newSize);
        }
    }
    
    private static void rotate(int[] num, int newSize)
    {
        int start = num.length - newSize;
        int temp = num[start];
        for (int i=0; i<newSize-1; i++)
        {
            num[start+i] = num[start+i+1];
        }
        num[num.length - 1] = temp;
    }
    
    // append each permutation into the final result
    private static void addToRes(ArrayList<ArrayList<Integer>> res, int[] num)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i:num)
        {
            temp.add(i);
        }
        res.add(temp);
    }
}