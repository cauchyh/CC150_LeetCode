/*
	Given a positive integer, print the next smallest and the next largest number that 
	have the same number of 1 bits in their binary representation.
*/

public class Problem3
{
	public static int getNext(int n)
	{
		// The main method is to clear the right most p-1 position to 0
		// count the original number of "1s" and set the right-most digit 
		// to 1 and the others (at the right of p) to 0s

		// The first move is to find the "p", which is a non-trailing 0 and 
		// then operate the above method
		int c = n;
		int count0 = 0;
		int count1 = 0;
		while ((c & 1) == 0 && (c != 0)) // count the number of zero bit by bit
		{
			count0++;
			c >>= 1;
		}

		while ((c & 1) == 1)
		{
			count1++;
			c >>= 1;
		}

		int p = count1 + count0; // the position of first non-trailing zero
		n |= (1 << p); // flip the rightmost non-trailing zero to one
		n &= ~((1 << p) - 1); //  clear all the bits into 0s that are right of p
		n |= ( 1 << (count1 -1) -1); // insert the count-1 "1s" into the very right

		return n;
	}

	public static int getPrev(int n)
	{
		int c = n;
		int count0 = 0;
		int cuont1 = 0;
		while ((c & 1) == 1)
		{
			count1 ++;
			c >>= 1;
		}

		while ((c & 1) == 0 && (c != 0)) // compare each bit
		{
			count0 ++;
			c >>= 1;
		}

		int p = count0 + count1;
		n &= ~(1 << p); // flip the rightmost nontrailing postion (which was 1) to 0
		n |= (1 << p) - 1;
		n &= (1 << (count0 - 1) -1);

		return n;
	}
}








