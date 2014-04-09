/*
	You are given two 32-bit numbers, N and M, and two bit positions, i and j.
	Wirte a method to insert M into N such that M starts at bit j and ends at bit i.
	You can assume that bits j through i have enough space to fit all of M. That is,
	if M = 10011, you can assume that there are at least 5 bits between j and i. 
	You would not, for example, have j=3 and i=2, because M could not fully fit between 
	bit 3 and bit 2.

	EXAMPLE:
	Input:  N = 10000000000, M = 10011, i = 2, j = 6
	Output: N = 10001001100
*/

/*
 * The main stragety of this problem is to 
 * First clear the i to j position of N
 * Second put M into the correct position among 0s
 * Finally merge them together
*/
public class Problem1
{
	public static int insertM(int n, int m, int i, int j)
	{
		int leftOnes = (~0) << (j+1);
		int rightOnes = ((1<<i) - 1);
		int clearedN = n & (leftOnes|rightOnes);
		int shiftedM = m << i;
		return clearedN | shiftedM;
	}
}

