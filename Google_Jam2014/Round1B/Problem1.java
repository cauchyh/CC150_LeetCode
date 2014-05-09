/*
	Problem1 of Google Jam 2014 
	Rount 1B
*/
import java.util.*;
public class Problem1
{
	public static void main(Sting[] args)
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			int totalCase = Integer.parseInt(in.readLine());
			for (int caseNum=1; caseNUm<=totalCase; caseNum++)
			{
				int inputStringNum = Integer.parseInt(in.readLine());
				// find the min move of each the input to the minString
				int[] minMove = new int[inputStringNum];
				String[] input = new String[inputStringNum];
				// read in the input string s
				for (int i=0; i<inputStringNum; i++)
				{
					input[i] = in.readLine();
				}
				int minMove = findMinMove(input);
				// for (int i=0; i<inputStrin)
			}
			in.close();
		}
		catch
		{
			e.printStackTrace();
			System.out.println("Cannot read the file :(");
		}
	}

	private static int findMinMove(String[] input)
	{
		String minString = findMinString(input[0]);
		for ()
	}
	// return the minimum stirng the input could possiblly be convert to
	private static String findMinString(String testString)
	{
		String res = "";
		char curChar = testString.charAt(0);
		for (int i=0; i<testString.length(); i++)
		{
			if (testString.charAt(i) != curChar)
			{
				res += testString.charAt(i);
				curChar = testString.charAt(i);
			}
		}
		return res;
	}


	private static void printResult(int caseNum, )
	{
		try
		{
			File output = new File("output.txt");
			if (!output.exists())
			{
				output.createNewFile();
			}
			BufferedWriter out = new BufferedWriter(new FileWriter(output.getAbsoluteFile(), true));

		}

		catch(IOException e)
		{
	        e.printStackTrace();
		}
	}
}