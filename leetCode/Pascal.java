/*
    Given numRows, generate the first numRows of Pascal's triangle.

    For example, given numRows = 5,
    Return

    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
*/
import java.util.*;
public class Pascal
{
    public static ArrayList<ArrayList<Integer>> generate(int numRows) 
    {
        if (numRows == 0)
        {
            return (new ArrayList<ArrayList<Integer>>());
        }
        Stack<Integer> stack = new Stack<Integer>(); // use to store the elements and 0
        stack.push(0);
        stack.push(1); // for the first element
        stack.push(0);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for (int i=1; i<numRows; i++)
        {
            res.add(new ArrayList<Integer>());
            while (true)
            {
                int temp = stack.pop();
                if (stack.isEmpty())
                {
                    break;
                }
                else
                {
                    res.get(i).add(temp + stack.peek());
                }
            }
            // System.out.println(res);
            stack.push(0);
            for (int j=0; j<res.get(i).size(); j++)
            {
                int temp = res.get(i).get(j);
                stack.push(temp);
            }
            stack.push(0);
        }
        return res;
    }
    //     if (numRows == 0)
    //     {
    //         return (new ArrayList<ArrayList<Integer>>());
    //     }
    //     ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    //     for (int i=0; i<numRows; i++)
    //     {
    //         res.add(new ArrayList<Integer>());
    //         for (int j=0; j<=i; j++)
    //         {
    //             res.get(i).add(kCn(i+1,j+1));
    //         }
    //     }
    //     return res;
    // }
    // /*
    //     the kth element in the nth row 
    // */
    // public static int kCn(int n, int k) 

    // {
    //     long long resLong = factorial(n-1)/(factorial(k-1)*factorial(n-k));
    //     return (int) resLong;
    // }
    
    // public static long factorial(long m)
    // {
    //     if (m == 0)
    //     {
    //         return 1;
    //     }
    //     return m*factorial(m-1);
    // }
}