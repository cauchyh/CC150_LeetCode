import java.lang.Object;
import java.io.*;
import java.util.*;

public class test
{
	public static void main (String[] args)
	{
		HashMap<Integer, String> map = new HashMap<Integer, String> ();
		map.put(1,"math");
		map.put(2,"English");
		map.put(1,"chinese");
		System.out.println("find the value of 1: " + map.get(1));
		// boolean test1[] = new boolean[10];
		// for (int i=0;i<test1.length;i++)
		// {
		// 	System.out.println(test1[i]);
		// }
		String str = "abcd";
		for (int i =0; i<str.length(); i++)
		{
			int val = str.charAt(i);
			System.out.print(val + " ");
		}
		System.out.println();

	}
}

