import java.io.*;
import java.util.*;


public class hash
{
	static final int HASHSIZE = 10; // Assume this is a hash table with size of 10
	public ArrayList<sortedLink> hashTable = new ArrayList<sortedLink> (10);
	// initialize the hash table
	// sortedLink sl_ini = new sortedLink ();

	public hash()
	{
		// System.out.println("size of the hash: " + hashTable.size());
		for (int i=0; i<HASHSIZE; i++)
		{
			hashTable.add(new sortedLink());
			hashTable.get(i).delete(0);
		}
	}

	// public hash(sortedLink sLink)
	// {
	// 	hashTable.add(sLink);
	// 	for (int i=0; i<HASHSIZE; i++)
	// 	{
	// 		hashTable.add(new sortedLink());
	// 	}
	// }

	private int hashFunc(int key)
	{
		return key % HASHSIZE; 
	}

	public boolean insert(int data)
	{
		// get the hash key first and then check the list
		try 
		{
			int hashKey = hashFunc(data);
			hashTable.get(hashKey).insert(data);
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Inappropriate input.");
		}
		return false;
	}

	public boolean search(int data)
	{
		int hashKey = hashFunc(data);
		boolean find = hashTable.get(hashKey).search(data);
		if (find)
		{
			System.out.println("Data found, in List #" + hashKey);
			return true;
		}
		else 
		{
			System.out.println("Data not found.");
			return false;
		}
	}

	public boolean delete(int data)
	{
		int hashKey = hashFunc(data);
		boolean deleted = hashTable.get(hashKey).delete(data);
		if (deleted)
		{
			System.out.println("Data \"" + data + "\" deleted, in List #" + hashKey);
			return true;
		}
		else
		{
			System.out.println("Data \"" + data + "\" not found");
			return false;
		}
	}

	public void displayHash()
	{
		System.out.println("\nDisplay the Hash Link List:");
		for (int i=0; i<hashTable.size(); i++)
		{
			if (!hashTable.get(i).isEmpty()) // print only if the sortedlink is not empty
			{
				System.out.print("Link List# " + i + ": ");
				hashTable.get(i).displayLink();
			}
		}
	}

	public void displayList(int num)
	{
		if (num > hashTable.size())
		{
			System.out.println("The size of the hashmap is:" + hashTable.size());
			System.out.println("Number input out of size of the hash!");
		}
		else
		{
			System.out.println("The size of the hashtable is: " + hashTable.size());
			for (int i=0; i<hashTable.size(); i++)
			{
				hashTable.get(i).displayLink();
			}
		}
	}
}














