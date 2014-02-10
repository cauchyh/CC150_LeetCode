/*Implement an algorithm to find the kth to last element of a singly linked list*/

import java.io.*;
// for this problem, it is obviously not to count the length of the Linkedlist first and 
// then go for the kth to last element.
// A proper solution would be two pointer, which solve this problem elegently.
public class Problem2
{
	public static int findKToNth(LinkedList lk, int k)
	{

		// the solution to this problem is to use two pointer
		// one will follow the other after k steps. Thus when 
		// the first one reach the last, the second one will 
		// properly reach the k to last
		LinkedList first = lk;
		LinkedList second = lk;
		int count = 0; // counter used to check if the first one has moved k step.
		// first iterate k times
		for (int i=0; i<k; i++)
		{	
			if (first.next != null)
			{
				first = first.next;
			}
			else
			{
				return -1;
			}
		}
		while (first.next != null)
		{
			first = first.next;
			second = second.next;
		}

		return second.data;

	}
}