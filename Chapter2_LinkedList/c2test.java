import java.io.*;

public class c2test
{
	static public void main(String[] args)
	{
		LinkedList l1 = new LinkedList(5);
		l1.append(1);
		l1.append(2);
		l1.displayList();
		// l1 = l1.delete(l1, 5);	
		// l1.displayList();
		l1.append(3);
		l1.append(4);
		l1.append(5);
		l1.append(6);
		l1.append(7);
		l1.append(8);
		l1.append(9);
		l1.append(10);
		l1.append(11);
		l1.append(12);
		// l1.append(3);
		// l1.append(5);
	 	l1.displayList();
	 	
	 	for (int i=1; i<4; i++)
	 	{
	 		int k = Problem2.findKToNth(l1, i);
	 		System.out.println("The "+ i + " to end data is: " + k);
	 	}
		// l1 = LinkedList.delete(l1,3);
		// l1.displayList();
		// Problem1.deleteDuplicate2(l1);
		// l1.displayList();
	}


}	