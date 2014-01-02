import java.io.*;

class Link
{
	public int iData;
	public Link next;
	public Link(int in)
	{
		iData = in;
		next = null;
	}
	public Link()
	{
		// iData = 0;
		next = null;
	}
	public void disPlayiDaya() 
	{
		System.out.print(iData + " ");
	}
	public int getKey()
	{
		return iData;
	}
}

public class sortedLink
{
	private Link first = new Link();
	//private Link current;
	//private Link previous;

	// constructor
	public sortedLink(int data) 
	{
		// Link first = new Link();
		first.iData = data;	
		//current = link;
		// first = link;
	}
	public sortedLink()
	{
		// first = null;
	}

	public void insert (int data)
	{
		// System.out.println("first.iData is: " + first.iData);
		// link.iData = data;
		// first case is to check whether the linkedlist is empty or not
		if (first == null)
		{
			first.iData = data;
		}
		else if (data < first.iData) // if the data is to insert into the first place of the list
		{
			Link temp = new Link(first.iData);
			first.iData = data;
			temp.next = first.next;
			first.next = temp;
		}
		// following steps find a proper position for the link
		else
		{
			Link link = new Link(data);
			// System.out.println(link.iData);
			// if the sortedlink is not empty
			Link current = first; // from the first data point
			Link previous = null;
			while (current != null && link.iData != current.iData) // assume that there is no duplicated data
			{	
				if (link.iData > current.iData) // sort the link by the iData
				{
					previous = current;
					current = current.next;
				}
				else // if find the correct position
				{
					previous.next = link;
					link.next = current;
					return;
				}
			}
			// when the link shall be inserted in the last of the linklist
			previous.next = link;
		}
	}

	public boolean search (int data)
	{
		Link current = first;
		// Link pevious = null;
		while (current != null)
		{
			if (data == current.iData)
			{
				return true;
			}
			else
			{
				current = current.next;
			}
		}
		return false;
	}

	public boolean delete(int data)
	{
		Link current = first;
		Link previous = null;
		// if the link wanted to delete is the first one
		if (data == first.iData)
		{
			// count the case when the Link List has only one link
			if (first.next != null)
			{
				first.iData = first.next.iData;
				if (first.next.next != null)
				{
					first.next = first.next.next;
				}
			}
			return true;
		}
		// when the link is not the first
		while (current != null)
		{
			if (data == current.iData)
			{	
				previous.next = current.next;
				return true;
			}
			else
			{
				previous = current;
				current = current.next;
			}
		}
		return false;
	}

	// check whether the sorted link is empty or not
	public boolean isEmpty()
	{
		if (first.iData == 0 && first.next == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void displayLink()
	{
		Link current = first.next;
		// System.out.println("\nDisplay the Sorted Link List: ");
		while (current != null)
		{
			// System.out.println("Link is not empty. Start display...");
			System.out.print(current.iData);
			if (current.next != null)
			{
				System.out.print(" --> ");
			}
			else
			{
				System.out.println();
			}
			current = current.next;
		}
		// System.out.println("\n");

	}
}






