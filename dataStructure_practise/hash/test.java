import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;



public class test
{
	public static void main(String[] args)
	{
		// int test1;
		// System.out.println(test1);
		// sortedLink sl1 = new sortedLink();
		// sl1.displayLink();


		hash hashTable = new hash();
		hashTable.insert(53);
		hashTable.insert(4);
		hashTable.insert(14);
		hashTable.insert(42);
		hashTable.insert(34);		
		hashTable.insert(23);
		hashTable.insert(33);
		hashTable.insert(1);
		hashTable.insert(52);
		hashTable.displayHash();
		hashTable.delete(53);
		hashTable.delete(5);
		hashTable.delete(4);
		hashTable.displayHash();
		// hashTable.delete(0);

		// int HASHSIZE = 10;
	 // 	ArrayList<sortedLink> hashTable = new ArrayList<sortedLink> (HASHSIZE);
		// // initialize the hash table
		// System.out.println(hashTable.size());
		// sortedLink sl_ini = new sortedLink();
		// for (int i=0; i<HASHSIZE; i++)
		// {
		// 	hashTable.add(sl_ini);
		// }
		// System.out.println(hashTable.size());




	 	// test the user input and ArrayList
		// try 
		// {
		// 	System.out.print("Input a number: ");
		// 	InputStreamReader reader = new InputStreamReader(System.in);
		// 	String input = new BufferedReader(reader).readLine();
		// 	// System.out.println("The vaule you input is: " + input);
		// } 
		// catch (IOException e)
		// {
		// 	e.printStackTrace();
		// }
		// sortedLink stlink = new sortedLink(52);
		// int data = stlink.first.iData;
		// System.out.println(data);

		// hash hashtable = new hash(stlink);
		// hashtable.displayHash(5);
		// // hashtable.get(5).insert(3);
		// hashtable.displayHash(5);
		// sortedLink stlink = new sortedLink();
		// stlink.insert(53);
		// stlink.insert(1);
		// stlink.insert(2);
		
		// stlink.insert(3);
		// stlink.insert(4);
		// stlink.insert(6);
		// stlink.displayLink();
		// stlink.delete(2);
		// stlink.delete(52);
		// stlink.delete(53);



		// stlink.delete(1);
		// stlink.displayLink();
		// stlink.delete(2);
		// stlink.displayLink();
		// boolean find1 = stlink.search(2);
		// boolean find2 = stlink.search(3);
		// System.out.println(find1 + " " + find2);

	}
}



