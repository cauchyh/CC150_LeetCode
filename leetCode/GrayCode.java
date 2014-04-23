/*
	The gray code is a binary numeral system where two successive values 
	differ in only one bit.

	Given a non-negative integer n representing the total number of bits in the code, 
	print the sequence of gray code. A gray code sequence must begin with 0.

	For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

	00 - 0
	01 - 1
	11 - 3
	10 - 2
	Note:
	For a given n, a gray code sequence is not uniquely defined.

	For example, [0,2,3,1] is also a valid gray code sequence 
	according to the above definition.

	For now, the judge is able to judge based on one instance of gray code sequence. 
	Sorry about that.
*/
import java.util.*;
// import Math.*;
public class GrayCode
{
	public static ArrayList<Integer> grayCode(int n) 
    {
        ArrayList<Integer> res = new ArrayList<Integer> ();
        if (n == 0)
        {
            return res;
        }
        res.add(0);
        res.add(1);
        if (n == 1)
        {
            return res;
        }
        res.add(3);
        res.add(2);
        for (int j=2; j<n; j++)
        {
            int length = res.size();
            for (int i=0; i<length; i++)
            {
                res.add(res.get(i) + (int)Math.pow(2,j));
            }
        }
        return res;
    }
}