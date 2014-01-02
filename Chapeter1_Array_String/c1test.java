import java.io.*;


public class c1test
{
	static public void main(String[] args)
	{
		Problem1 p1 = new Problem1();
		boolean test1 = p1.allUniqueChar("abcdefga");
		boolean test2 = p1.allUniqueChar("121");
		boolean test3 = p1.allUniqueChar("2345");
		boolean test4 = p1.allUniqueChar("asdg5");
		System.out.println(test1 + " " + test2 + " " + test3 + " " + test4);
	}
}