/*
Recently you went to a magic show. You were very impressed by one of the tricks, 
so you decided to try to figure out the secret behind it!

The magician starts by arranging 16 cards in a square grid: 
4 rows of cards, with 4 cards in each row. 
Each card has a different number from 1 to 16 written on the side that is showing. 
Next, the magician asks a volunteer to choose a card, 
and to tell him which row that card is in.

Finally, the magician arranges the 16 cards in a square grid again, 
possibly in a different order. Once again, 
he asks the volunteer which row her card is in. 
With only the answers to these two questions, 
the magician then correctly determines which card the volunteer chose. Amazing, right?

You decide to write a program to help you understand the magician's technique. 
The program will be given the two arrangements of the cards, 
and the volunteer's answers to the two questions: 
the row number of the selected card in the first arrangement, 
and the row number of the selected card in the second arrangement. 
The rows are numbered 1 to 4 from top to bottom.

Your program should determine which card the volunteer chose; 
or if there is more than one card the volunteer might have chosen 
(the magician did a bad job); 
or if there's no card consistent with the volunteer's answers (the volunteer cheated).

Solving this problem

Usually, Google Code Jam problems have 1 Small input and 1 Large input. 
This problem has only 1 Small input. 
Once you have solved the Small input, you have finished solving this problem.

Input

The first line of the input gives the number of test cases, T. 
T test cases follow. Each test case starts with a line containing an integer: 
the answer to the first question. 
The next 4 lines represent the first arrangement of the cards: 
each contains 4 integers, separated by a single space. 
The next line contains the answer to the second question, 
and the following four lines contain the second arrangement in the same format.

Output

For each test case, output one line containing "Case #x: y", 
where x is the test case number (starting from 1).

If there is a single card the volunteer could have chosen, 
y should be the number on the card. 
If there are multiple cards the volunteer could have chosen, 
y should be "Bad magician!", without the quotes. 
If there are no cards consistent with the volunteer's answers, 
y should be "Volunteer cheated!", without the quotes. 
The text needs to be exactly right, so consider copying/pasting it from here.

Limits

1 ≤ T ≤ 100.
1 ≤ both answers ≤ 4.
Each number from 1 to 16 will appear exactly once in each arrangement.

Sample


Input 
 	 
 
3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Case #1: 7
Case #2: Bad magician!
Case #3: Volunteer cheated!

*/
import java.util.*;
import java.io.*;


public class MagicTrick
{
	public static void main(String[] args)
	{
		int caseNum = 1;
		int rowOne; // row number of the first 
		int rowTwo;
		int[] arrOne = new int[4];
		int[] arrTwo = new int[4];
		// read in the data and assign them
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			int totalCase = Integer.parseInt(in.readLine());
			for (int i=0; i<totalCase; i++)
			{
				rowOne = Integer.parseInt(in.readLine());
				copyToArray(arrOne, in, rowOne);
				rowTwo = Integer.parseInt(in.readLine());
				copyToArray(arrTwo, in, rowTwo);
				checkMagic(arrOne, arrTwo, caseNum);
				caseNum++; // update the case num
			}
			in.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Cannot read the file :(");
		}
	}

	private static void copyToArray(int[] arr, BufferedReader in, int rowNum)
	{
		try
		{
			for (int i=1; i<rowNum; i++)
			{
				in.readLine();
			}
			Queue<Integer> queue = new LinkedList<Integer>();
			String temp = in.readLine();
			int start = 0;
			// int end = 0;
			for (int i=0; i<temp.length(); i++)
			{
				if (temp.charAt(i) == ' ')
				{
					queue.add(Integer.parseInt(temp.substring(start, i)));
					start = i+1;
				}
			}
			queue.add(Integer.parseInt(temp.substring(start, temp.length())));
			// System.out.println(queue);
			for (int i=0; i<arr.length; i++)
			{
				arr[i] = queue.remove();
			}

			// finish the readline for format reason
			for (int i=0; i < (4-rowNum); i++)
			{
				in.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
			// System.out.println("Cannot read the file :(");
		}

	}

	public static void checkMagic(int[] arrOne, int[] arrTwo, int caseNum)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int appearNum = 0;
		int counter = 0;
		for (int i=0; i<4; i++)
		{
			// it is assured that the total number of each row is 4
			map.put(arrOne[i], 1);
		}

		for (int i=0; i<4; i++)
		{
			if (map.containsKey(arrTwo[i]))
			{
				appearNum = arrTwo[i];
				counter++;
			}
		}
		// print the result based on the final counter
		if (counter == 0)
		{
			System.out.println("Case #" + caseNum + ": Volunteer cheated!");
		}
		else if (counter == 1)
		{
			System.out.println("Case #" + caseNum + ": " + appearNum);
		}
		else 
		{
			System.out.println("Case #" + caseNum + ": Bad magician!");
		}

	}
}























