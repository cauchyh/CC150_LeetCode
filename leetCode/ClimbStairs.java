/*
	You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. 
	In how many distinct ways can you climb to the top?
*/

import java.util.*;
public class ClimbStairs
{
	public static int climbStairs(int n) 
    {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        return climbStairsRec(n, hashmap);
        
    }

    private static int climbStairsRec(int n, HashMap<Integer,Integer> hashmap)
    {
        if (n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return 2;
        }
        if (hashmap.containsKey(n))
        {
            return hashmap.get(n);
        }
        else
        {
            int temp = climbStairs(n-1) + climbStairs(n-2);
            hashmap.put(n,temp);
            return temp;
        }
    }
}