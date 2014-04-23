import java.util.*;

class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) 
	{
	  val = x; 
	}
}

public class test
{
	public static void main(String[] args)
	{
		int[] array = new int[] {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
		System.out.println(array[7]);
		int res = Problem3.findMagic(array);
		System.out.println(res);
		// int res = Problem2.countPath(3,3);
		// System.out.println(res);
		// int res = Problem1.countStair(6);
		// System.out.println(res);

		


	}
}
