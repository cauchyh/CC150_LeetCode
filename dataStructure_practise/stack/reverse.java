// take one integer and reverse the sequence

public class reverse
{
	private stackL stk = new stackL();
	private String res = "";

	public String reverseInt(String str)
	{
		for (int i=0; i<str.length(); i++)
		{
			stk.push(str.charAt(i)); // push in then pop out
		}

		for (int i=0; i<str.length(); i++)
		{
			res += stk.pop();
		}

		return res;
	}
}