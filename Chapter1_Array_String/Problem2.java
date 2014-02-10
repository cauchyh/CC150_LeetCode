/* Implement a function to reverse a null terminated string*/

public class Problem2
{
	public String reverse(String str)
	{
		System.out.println("Original String: " + str);
		String temp = "";
		for (int i=0; i<str.length();i++)
		{
			temp += str.charAt(str.length()-i-1);
		}
		str = temp;
		System.out.println("Reversed String: " + str);
		return str;
	}
}