/*
	Imagine a robot sitting on the upper left corner of an X by Y grid. The robot
	can only move in two direction: right and down. How many possible paths are there
	for the robot to go from (0, 0) to (X, Y)?
	FOLLOW UP
	Imagine certain spots are "off limits", such that the robot cannot step on them. 
	Design an algorithm to find a path for the robot from the top left to down right.
*/

public class Problem2
{
	public static int countPath(int x, int y)
	{
		int[][] map = new int[x][y];
		// initial the first row and column first
		for (int i=0; i<x; i++)
		{
			map[i][0] = 1;
		}
		for (int i=0; i<y; i++)
		{
			map[0][i] = 1;
		}
		// Let's move!
		for (int i=1; i<x; i++)
		{
			for (int j=1; j<y; j++)
			{
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}
		return map[x-1][y-1];

	}
}