import java.io.*;
import java.util.*;

public class c2test
{
	static public void main(String[] args)
	{
		// LinkedListList lk1 = new LinkedListList();
		// Stack <Integer> stk = new Stack <Integer> ();

		// try
		// {
		// 	stk.pop();	
		// }
		// catch (EmptyStackException e)
		// {
		// 	System.out.println("Stack is empty!! Failed!");
		// }

		LinkedList l1 = new LinkedList(1);
		LinkedList l2 = new LinkedList(2);
		LinkedList l3 = new LinkedList(3);
		LinkedList l4 = new LinkedList(3);
		LinkedList l5 = new LinkedList(2);
		LinkedList l6 = new LinkedList(0);
		// // LinkedList l1 = new LinkedList(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;

		boolean test1 = Problem7.isPalindrome(l1);

		System.out.println(test1);
		l1.displayList();


		// LinkedList current = l1;
		// // System.out.println(current.idata);

		// // current = l1;
		// int data1 = current.idata;
		// int data2 = current.next.idata;
		// System.out.println(current.idata);
		// System.out.println(current.next.next.idata);
		// // current.next.idata = -1;
		// // current.idata = -1;
		// // System.out.println(l1.idata);

		// current.next = l3;
		// System.out.println(l1.next.idata);



		// System.out.println(data1 + " " + data2);
		// System.out.println(l1.next.idata);
		// LinkedListList l1 = new LinkedListList(5);
		// l1.append(1);
		// l1.append(2);
		// l1.displayList();
		// // l1 = l1.delete(l1, 5);	
		// // l1.displayList();
		// l1.append(3);
		// l1.append(4);
		// l1.append(5);
		// l1.append(6);
		// l1.append(7);
		// l1.append(8);
		// l1.append(9);
		// l1.append(10);
		// l1.append(11);
		// l1.append(12);
		// // l1.append(3);
		// // l1.append(5);
	 // 	l1.displayList();
	 	
	 // 	for (int i=1; i<4; i++)
	 // 	{
	 // 		int k = Problem2.findKToNth(l1, i);
	 // 		System.out.println("The "+ i + " to end data is: " + k);
	 // 	}
		// l1 = LinkedListList.delete(l1,3);
		// l1.displayList();
		// Problem1.deleteDuplicate2(l1);
		// l1.displayList();
	}


}	