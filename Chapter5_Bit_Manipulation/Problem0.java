/*
	Implementi some of the basic techniques of bit manipulation
*/

public class Problem0
{
	public static boolean getBit(int m, int i)
	{
		return (m & (1<<i) != 0);
	}
}