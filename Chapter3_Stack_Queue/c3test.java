// Test the problem in Chapter 3 
import java.util.*;
public class c3test
{
	static public void main(String[] args)
	{
		Stack <Integer> stk1 = new Stack <Integer> ();
		stk1.push(3);
		stk1.push(5);
		stk1.push(4);
		stk1.push(100);
		stk1.push(1);
		// stk1.push(0);
		Stack<Integer> stk2 = Problem7.sortStack(stk1);
		while(!stk2.isEmpty())
		{
			System.out.println(stk2.pop());
		}
		// Problem6 p6 = new Problem6();
		// p6.add(5);
		// p6.add(4);
		// p6.add(3);
		// p6.add(2);
		// p6.add(1);
		// while (!p6.isEmpty())
		// {
		// 	System.out.println(p6.remove());
		// }
		// Stack <T> StackNew, StackOld;

		// ArrayList <Stack<Integer>> stacks = new ArrayList<Stack<Integer>> ();
		// Problem4 t1 = new Problem4(3);
		// // t1.pop();
		// t1.push(1);
		// t1.push(2);	
		// t1.push(3);
		// t1.push(4);
		// t1.push(5);
		// t1.push(6);
		// t1.push(7);
		// System.out.println(t1.getSet()+" "+t1.getPos());
		// while (!t1.isEmpty())
		// {
		// 	System.out.println(t1.pop());
		// }
		// // System.out.println(t1.pop());
		// ArrayList <Integer> al = new ArrayList(10);
		// al.add(5);
		// al.get(0);

	}
}